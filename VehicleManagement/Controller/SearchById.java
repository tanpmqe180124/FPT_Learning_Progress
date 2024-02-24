package Controller;

import Model.Vehicle;

import java.util.Scanner;

public class SearchById {
    public static int run(String targetId, Vehicle vehicle, Scanner sc, String type) {
        if (type.equalsIgnoreCase("car")) {
            return BinarySearchOnId.run(targetId, vehicle.getCars());
        } else {
            return BinarySearchOnId.run(targetId, vehicle.getMotorbikes());
        }
    }
}
