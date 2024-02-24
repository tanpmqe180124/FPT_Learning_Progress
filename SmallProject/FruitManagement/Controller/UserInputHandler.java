package Controller;
import View.View;

import java.util.Scanner;

public class UserInputHandler {
    public static boolean askUserToContinue(Scanner sc) {
        String userResponse;
        while (true) {
            View.askUserToContinue();
            userResponse = sc.nextLine().trim();
            if (!userResponse.equalsIgnoreCase("y") && !userResponse.equalsIgnoreCase("n")) {
                View.wrongInputNotify();
            } else {
                break;
            }
        }
        return userResponse.equalsIgnoreCase("y");
    }

    public static boolean askUserToOrder(Scanner sc) {
        String userResponse;
        while (true) {
            View.askUserToOrder();
            userResponse = sc.nextLine().trim();
            if (!userResponse.equalsIgnoreCase("y") && !userResponse.equalsIgnoreCase("n")) {
                View.wrongInputNotify();
            } else {
                break;
            }
        }
        return userResponse.equalsIgnoreCase("n");
    }
}
