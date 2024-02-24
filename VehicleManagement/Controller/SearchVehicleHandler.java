package Controller;

import Model.Car;
import Model.Vehicle;
import Validators.InputDataWithoutSpecialChar;
import Validators.InputIdValidator;
import View.View;

import java.util.Scanner;

public class SearchVehicleHandler {

    public static void run(Scanner sc, Vehicle vehicle) {
        if (vehicle.isEmpty()) {
        } else {
            int userChoice = 0;
            do {
                try {
                    View.searchView();
                    userChoice = sc.nextInt();
                    sc.nextLine();
                    if (userChoice > 2 || userChoice < 1) {
                        View.wrongInputNotify();
                    }
                } catch (Exception e) {
                    View.wrongInputNotify();
                    sc.nextLine();
                }
            } while (userChoice > 2 || userChoice < 1);
            if (userChoice == 1) {
                String targetId = InputIdValidator.run(sc, vehicle);
                if (Car.isCar(targetId)) {
                    SearchById.run(targetId, vehicle, sc, "car");
                } else {
                    SearchById.run(targetId, vehicle, sc, "motorbike");
                }
            } else {
                String targetName = InputDataWithoutSpecialChar.run(sc, "Vehicle", "vehicle");
                SearchByName.run(targetName, vehicle);
            }
        }
    }
}
