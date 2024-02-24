package Controller;

import Model.Car;
import Model.Motorbike;
import Model.Vehicle;
import Validators.UserInputHandler;
import View.View;

import java.util.Scanner;

public class AddVehicleHandler {
    public static void run(Vehicle vehicle, Scanner sc) {
        do {
            View.vehicleView();
            int userChoice = sc.nextInt();
            sc.nextLine();
            switch (userChoice) {
                case 1:
                    Car car = (Car) InputVehicleData.run(sc, "car", "generate");
                    vehicle.getCars().add(car);
                    break;
                case 2:
                    Motorbike motorbike = (Motorbike) InputVehicleData.run(sc, "motorbike", "generate");
                    vehicle.getMotorbikes().add(motorbike);
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        } while (UserInputHandler.askUSerToContinue(sc));
    }
}
