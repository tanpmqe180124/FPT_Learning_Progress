package Validator;

import View.InputContactView;
import View.NotifyView;

import java.util.Scanner;

public class AlphaStringValidator {

    public static String input(Scanner sc, String attribute) {
        String inputData;
        while (true) {
            if (attribute.equalsIgnoreCase("fullName")) {
                InputContactView.requestFullName();
                inputData = sc.nextLine();
                if (!inputData.contains(" ")) {
                    NotifyView.wrongInput();
                    continue;
                }
            } else {
                InputContactView.requestGroup();
                inputData = sc.nextLine();

            }
            if (!inputData.matches(".*[0-9].*") && inputData.matches("[a-zA-Z ]*")) {
                break;
            } else {
                NotifyView.wrongInput();
            }
        }
        return inputData;
    }
}
