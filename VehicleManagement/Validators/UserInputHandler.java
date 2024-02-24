package Validators;

import java.util.Scanner;

public class UserInputHandler {
    public static boolean askUSerToContinue(Scanner sc) {
        System.out.println("Do you want to continue (y to continue, other to stop) ?");
        String userChoice = sc.nextLine();
        return userChoice.equalsIgnoreCase("y");
    }
    public static boolean checkIfSkip (String data) {
        if (data.trim().isBlank()) {
            return true;
        }
        return false;
    }
}
