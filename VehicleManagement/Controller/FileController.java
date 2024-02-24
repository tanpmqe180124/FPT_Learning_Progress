package Controller;

import Model.Car;
import Model.Motorbike;
import Model.Vehicle;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class FileController {
    private Scanner sc;
    private BufferedWriter bw; // write data to file
    public void readDataFromFile(String filePath, Vehicle vehicle) {
        try { // try to create new file to avoid exception
            File file = new File(filePath); // create new file object
            if (file.exists()) { // check if exist
                sc = new Scanner(file); // read file at file object by scanner
                if (isFileEmpty(file)) {
                    System.out.println("File is empty, please import data");
                } else {
                    while (sc.hasNextLine()) { // loop to read all line in file
                        String data = sc.nextLine(); // save line to data
                        try { // catch InputException
                            if (Car.isCar(data)) { // check if data is car
                                createCarFromData(data, vehicle);
                            } else {
                                createMotorbikeFromData(data, vehicle);
                            }
                        } catch (Exception e) {
                            System.out.println("File format error: ");
                            System.out.println(data);
                        }
                    }
                    System.out.println("Import data successfully");
                }
            } else {
                file.createNewFile();
                System.out.println("Create file successfully at: " + filePath + " now you can import data from file");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        sc.close(); // close file after read
    }

    private void createMotorbikeFromData(String data, Vehicle vehicle) {
        String[] dataArray = data.split("\\|");
        if (vehicle.getMotorbikes() == null) { // check if motorbikes is empty
            vehicle.setMotorbikes(new ArrayList<>()); // create new list
        }
        Motorbike motorbike = new Motorbike("generate", dataArray[1], dataArray[2], Integer.parseInt(dataArray[3]),
                dataArray[4], Integer.parseInt(dataArray[5]), dataArray[6]);
        vehicle.getMotorbikes().add(motorbike);
    }

    private void createCarFromData(String data, Vehicle vehicle) {
        String[] dataArray = data.split("\\|");
        if (vehicle.getCars() == null) {
            vehicle.setCars(new ArrayList<>());
        }
        Car car = new Car("generate", dataArray[1], dataArray[2], Integer.parseInt(dataArray[3]), dataArray[4],
                dataArray[5], Integer.parseInt(dataArray[6]));
        vehicle.getCars().add(car);
    }

    private boolean isFileEmpty(File file) {
        return file.length() == 0;
    }

    public void writeDataToFile(String filePath, Vehicle vehicle) throws IOException {
        try {
            bw = new BufferedWriter(new FileWriter(filePath)); // open file to write throw new FileWriter(filePath)
                                                               // write data to FileWrite throw new BufferedWriter
            writeCarsToFile(vehicle, bw);
            writeMotorbikesToFile(vehicle, bw);
            System.out.println("store data success at: " +filePath);
            bw.close(); // close after write
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void writeMotorbikesToFile(Vehicle vehicle, BufferedWriter bw) {
        for (Motorbike motorbike : vehicle.getMotorbikes()) {
            try {
                bw.write(String.valueOf(motorbike));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        System.out.println();
    }

    private void writeCarsToFile(Vehicle vehicle, BufferedWriter bw) {
        for (Car car : vehicle.getCars()) {
            try {
                bw.write(String.valueOf(car));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
