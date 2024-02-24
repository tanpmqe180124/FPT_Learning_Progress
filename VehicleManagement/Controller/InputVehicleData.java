package Controller;

import Model.Car;
import Model.Motorbike;
import Model.Vehicle;
import Validators.*;

import java.util.Scanner;

public class InputVehicleData {
    public static Vehicle run(Scanner sc, String type, String vehicleId) {
        String typeCar = null;
        int yearOfManufacture = 0;
        int speed = 0;
        String needLicense = null;

        String name = InputDataWithoutSpecialChar.run(sc, "Name", type);
        String color = InputLetterData.run(sc, "Color", type);
        int price = InputDataWithoutNegativeNum.run(sc, "Price", type);
        String brand = InputDataWithoutSpecialChar.run(sc, "Brand", type);

        if (type.equalsIgnoreCase("car")) {
            typeCar = InputLetterData.run(sc, "Type", type);
            yearOfManufacture = InputValidYearOfManufacture.run(sc);
        } else {
            speed = InputDataWithoutNegativeNum.run(sc, "Speed", type);
            needLicense = InputValidLicense.run(sc, type);
        }
        if (type.equalsIgnoreCase("car")) {
            if (vehicleId.equalsIgnoreCase("generate")) {
                return new Car("generate", name, color, price, brand, typeCar, yearOfManufacture);
            }
            return new Car(vehicleId, name, color, price, brand, typeCar, yearOfManufacture);
        } else {
            if (vehicleId.equalsIgnoreCase("generate")) {
                return new Motorbike("generate", name, color, price, brand, speed, needLicense);
            }
        }
        return new Motorbike(vehicleId, name, color, price, brand, speed, needLicense);
    }
}
