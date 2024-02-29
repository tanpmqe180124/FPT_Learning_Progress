package Utilities;

import java.util.Scanner;

public class FullNameParser {
    public static String extractNameComponent(Scanner sc, String nameComponent, String fullName) {
        String[] names = fullName.split(" ");
        if (nameComponent.equalsIgnoreCase("lastName")) {
            nameComponent = names[names.length - 1];
        } else {
            nameComponent = names[0];
        }
        return nameComponent;
    }
}
