package Controller;

import Model.VehicleInterface;

import java.util.ArrayList;

public class ShowVehicleData {
    public static <T extends VehicleInterface> void run (ArrayList<T> vehicles) {
        for (int i = 0; i < vehicles.size(); i++) {
            System.out.println(vehicles.get(i));
        }
    }
}
