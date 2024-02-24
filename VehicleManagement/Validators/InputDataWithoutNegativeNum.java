package Validators;

import View.View;

import java.util.Scanner;

public class InputDataWithoutNegativeNum {
    public static int run(Scanner sc, String attribute, String type) {
        int data = 0;
        while (true) {
            try {
                if (attribute.equals("Price")) {
                    View.inputPriceView(type);
                } else {
                    View.inputSpeedView(type);
                }
                String input = sc.nextLine();
                if (UserInputHandler.checkIfSkip(input)) {
                    break;
                }
                data = Integer.parseInt(input);
                if (data < 0) {
                    System.out.println(attribute + " must be positive number");
                } else {
                    break;
                }
            } catch (Exception e) {
                View.wrongInputNotify();
                sc.nextLine();
            }
        }
        return data;
    }
}
