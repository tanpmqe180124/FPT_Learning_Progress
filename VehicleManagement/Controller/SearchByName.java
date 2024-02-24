package Controller;

import Model.Car;
import Model.Vehicle;
import View.View;

public class SearchByName {
    public static void run(String targetName, Vehicle vehicle) {
        int count;
        count = LinearSearchOnName.run(targetName, vehicle.getCars()) +
                LinearSearchOnName.run(targetName, vehicle.getMotorbikes());
        if (count == 0) {
            View.vehicleNotFoundNotify();
        } else {
            View.showVehicleInShowroom(count, targetName);
        }
    }
}
