package Validators;

import View.View;

import java.util.Scanner;

public class InputValidLicense {
    public static String run(Scanner sc, String type) {
        String data;
        while (true) {
            View.inputRequireLicenseView(type);
            data = sc.nextLine();
            if (UserInputHandler.checkIfSkip(data)) {
                break;
            }
            if (!data.equalsIgnoreCase("y") && !data.equalsIgnoreCase("n")) {
                System.out.println("License" + " input is wrong, try again");
            } else {
                break;
            }
        }
        return data;
    }
}
