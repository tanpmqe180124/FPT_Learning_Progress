package Controller;

import Model.VehicleInterface;
import View.View;

import java.util.ArrayList;

public class LinearSearchOnName {
    public static <T extends VehicleInterface> int run(String targetName, ArrayList<T> vehicles) {
        int vehicleCount = 0;
        for (int i = 0; i < vehicles.size(); i++) {
            if (vehicles.get(i).getName().equalsIgnoreCase(targetName)) {
                System.out.println(vehicles.get(i));
                vehicleCount++;
            }
        }
        return vehicleCount;
    }
}
