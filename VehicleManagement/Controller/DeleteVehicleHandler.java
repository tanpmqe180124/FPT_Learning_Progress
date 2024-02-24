package Controller;

import Model.Car;
import Model.Vehicle;
import Validators.InputIdValidator;
import View.View;
import java.util.Scanner;

public class DeleteVehicleHandler {

    public static void run(Scanner sc, Vehicle vehicle) {
        String userResponse;
        String targetId = InputIdValidator.run(sc, vehicle);
        if (Car.isCar(targetId)) {
            int indexDeleted = BinarySearchOnId.run(targetId, vehicle.getCars());
            if (indexDeleted == -1) {
            } else {
                View.deleteCarConfirmNotify(vehicle, indexDeleted);
                userResponse = sc.nextLine();
                if (userResponse.equalsIgnoreCase("y")) {
                    int deletedId = vehicle.getCars().get(indexDeleted).getId();
                    vehicle.getCars().remove(indexDeleted);
                    View.deleteSuccessfulNotify();
                    RearrangeIdsAfterDeletion.run(vehicle.getCars(), deletedId, indexDeleted);
                }
            }
        } else {
            int indexDeleted = BinarySearchOnId.run(targetId, vehicle.getMotorbikes());
            if (indexDeleted == -1) {
            } else {
                View.deleteMotorBikeConfirmNotify(vehicle, indexDeleted);
                userResponse = sc.nextLine();
                if (userResponse.equalsIgnoreCase("y")) {
                    int deletedId = vehicle.getMotorbikes().get(indexDeleted).getId();
                    vehicle.getMotorbikes().remove(indexDeleted);
                    View.deleteSuccessfulNotify();
                    RearrangeIdsAfterDeletion.run(vehicle.getMotorbikes(), deletedId, indexDeleted);
                }
            }
        }
    }
}
