package Validators;

import Model.Vehicle;

import java.util.Scanner;

import Validators.InputDataWithoutSpecialChar;
import View.View;


public class InputIdValidator {
    public static String run(Scanner sc, Vehicle vehicle) {
        String id;
        while (true) {
            id = InputDataWithoutSpecialChar.run(sc, "Id", "vehicle");
            if ((id.length() != 14 && id.length() != 8) ||
                    (!id.contains("Car") && !id.contains("Motorbike"))) {
                View.wrongInputNotify();
            } else {
                break;
            }
        }
        return id;
    }
}
