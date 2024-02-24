package Untils;

import Model.Car;

public class ConvertDataToId {
    public static int run(String targetId) {
        if (Car.isCar(targetId)) {
            targetId = targetId.replace("Car", "");
            int targetIdAfterConvert = Integer.parseInt(targetId);
            return targetIdAfterConvert;
        }
        targetId = targetId.replace("Motorbike", "");
        int targetIdAfterConvert = Integer.parseInt(targetId);
        return targetIdAfterConvert;
    }
}
