package Validators;

import View.View;

import java.util.Scanner;

public class InputLetterData {
    public static String run(Scanner sc, String attribute, String type) {
        String data;
        while (true) {
            if (attribute.equals("Color")) {
                View.inputColorView(type);
            } else {
                View.inputTypeView(type);
            }
            data = sc.nextLine();
            if (UserInputHandler.checkIfSkip(data)) {
                break;
            } else if (data.matches("[a-zA-Z]+")) {
                break;
            } else {
                System.out.println(attribute + " contains letter only, please try again");
            }
        }
        return data;
    }
}
