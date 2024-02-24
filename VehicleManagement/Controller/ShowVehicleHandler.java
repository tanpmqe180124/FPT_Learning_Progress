package Controller;

import Model.Vehicle;
import Model.VehicleInterface;

import java.util.ArrayList;

public class ShowVehicleHandler {
    public static void run(Vehicle vehicle) {
        if (vehicle.isEmpty()) {
        } else {
            if (!vehicle.getCars().isEmpty()) {
                ShowVehicleData.run(vehicle.getCars());
            }
            if (!vehicle.getMotorbikes().isEmpty()) {
                ShowVehicleData.run(vehicle.getMotorbikes());
            }
        }
    }
}
