package Validators;

import View.View;

import java.util.Scanner;

public class InputDataWithoutSpecialChar {
    public static String run(Scanner sc, String attribute, String type) {
        String data;
        while (true) {
            if (attribute.equals("Name")) {
                View.inputNameView(type);
            } else if (attribute.equals("Id")) {
                View.inputId();
            }
            else if (attribute.equals("Brand")) {
                View.inputBrandView(type);
            } else {
                View.inputNameView("vehicle");
            }
            data = sc.nextLine();
            if (UserInputHandler.checkIfSkip(data)) {
                break;
            } else if (data.matches("[a-zA-Z0-9 ]+")) {
                break;
            } else {
                System.out.println(attribute + " contains letter or number only, please try again");
            }
        }
        return data;
    }
}
