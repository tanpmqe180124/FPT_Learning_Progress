package Controller;

import Model.VehicleInterface;
import Untils.ConvertDataToId;
import View.View;

import java.util.ArrayList;

public class BinarySearchOnId {
    public static <T extends VehicleInterface> int run(String targetId, ArrayList<T> vehicles) {
        // <T extends VehicleInterface> will accept all object which implement all methods in Vehicle Interface
        int left = 0, right = vehicles.size() - 1;
        int targetIdAfterConvert = ConvertDataToId.run(targetId);
        while (left <= right) {
            int middle = (left + right) / 2;
            if (vehicles.get(middle).getId() == targetIdAfterConvert) {
                System.out.println(vehicles.get(middle));
                return middle;
            } else if (vehicles.get(middle).getId() < targetIdAfterConvert) {
                left = middle + 1;
            } else {
                right = middle - 1;
            }
        }
        View.vehicleNotFoundNotify();
        return -1;
    }
}
