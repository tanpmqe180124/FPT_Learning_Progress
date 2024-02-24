package Controller;

import Model.Vehicle;
import View.View;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class VehicleController {
    public static void run() {

        Scanner sc = new Scanner(System.in);
        FileController fileController = new FileController();
        Vehicle vehicle = new Vehicle();

        int userChoice;
        String filePath = "D:\\Desktop\\IntelliJ IDEA Community Edition 2023.3.2\\VehicleManagement\\src\\vehicles.txt";

        while (true) {
            try {
                View.mainView();
                userChoice = sc.nextInt();
                sc.nextLine();
                switch (userChoice) {
                    case 0:
                        break;
                    case 1:
                        fileController.readDataFromFile(filePath, vehicle);
                        break;
                    case 2:
                        AddVehicleHandler.run(vehicle, sc);
                        break;
                    case 3:
                        UpdateVehicleHandler.run(sc, vehicle);
                        break;
                    case 4:
                        DeleteVehicleHandler.run(sc, vehicle);
                        break;
                    case 5:
                        SearchVehicleHandler.run(sc, vehicle);
                        break;
                    case 6:
                        ShowVehicleHandler.run(vehicle);
                        break;
                    case 7:
                        fileController.writeDataToFile(filePath, vehicle);
                        break;
                    default:
                        View.sayBye();
                }
                if (userChoice > 7 || userChoice < 0) {
                    break;
                }
            } catch (InputMismatchException e) {
                View.wrongInputNotify();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}