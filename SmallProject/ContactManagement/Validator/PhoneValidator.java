package Validator;

import View.InputContactView;
import View.NotifyView;

import java.util.Scanner;

public class PhoneValidator {
    public static String input(Scanner sc) {
        String[] phoneFlowFormat = {"1234567890", "123-456-7890", "123-456-7890 x1234",
                "123-456-7890 ext1234", "(123)-456-7890", "123.456.7890", "123 456 7890"};
        String phone = "";
        boolean valid = false;
        while (true) {
            InputContactView.numberFormat();
            InputContactView.requestPhoneNumber();
            phone = sc.nextLine();
            for (int i = 0; i < phoneFlowFormat.length; i++) {
                if (phone.equals(phoneFlowFormat[i])) {
                    valid = true;
                    break;
                }
            }
            if (valid) {
                break;
            } else {
                NotifyView.wrongInput();
            }
        }
        return phone;
    }
}
