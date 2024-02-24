package Controller;

import Model.Car;
import Model.Motorbike;
import Model.Vehicle;
import java.util.Scanner;

import Validators.InputIdValidator;
import View.View;


public class UpdateVehicleHandler {
    public static void run(Scanner sc, Vehicle vehicle) {
        int indexUpdate;
        if (vehicle.isEmpty()) {
        } else {
            String targetId = InputIdValidator.run(sc, vehicle);
            if (Car.isCar(targetId)) {
                indexUpdate = SearchById.run(targetId, vehicle, sc, "car");
                Car oldCarData = vehicle.getCars().get(indexUpdate);
                if (indexUpdate != -1) {
                    Car car = (Car) InputVehicleData.run(sc, "car", targetId);
                    vehicle.getCars().set(indexUpdate, car);
                    View.updateCarSuccessfulNotify(vehicle, indexUpdate, String.valueOf(oldCarData));
                }
            } else {
                indexUpdate = SearchById.run(targetId, vehicle, sc, "motorbike");
                Motorbike oldMotorbikeData = vehicle.getMotorbikes().get(indexUpdate);
                if (indexUpdate != -1) {
                    Motorbike motorbike = (Motorbike) InputVehicleData.run(sc,"motorbike", targetId);
                    vehicle.getMotorbikes().set(indexUpdate, motorbike);
                    View.updateMotorbikeSuccessfulNotify(vehicle, indexUpdate, String.valueOf(oldMotorbikeData));
                }
            }
        }
    }
}
