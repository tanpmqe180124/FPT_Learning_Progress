package Validators;

import View.View;

import java.util.Scanner;

public class InputValidYearOfManufacture {
    public static int run(Scanner sc) {
        int yearOfManufacture = 0;
        while (true) {
            try {
                View.inputYearOfManufactureView("car");
                String input = sc.nextLine();
                if (UserInputHandler.checkIfSkip(input)) {
                    break;
                }
                yearOfManufacture = Integer.parseInt(input);
                if (yearOfManufacture < 1999) {
                    System.out.println("Year of manufacture must be greater than 1999");
                } else {
                    break;
                }
            } catch (Exception e) {
                View.wrongInputNotify();
                sc.nextLine();
            }
        }
        return yearOfManufacture;
    }
}
