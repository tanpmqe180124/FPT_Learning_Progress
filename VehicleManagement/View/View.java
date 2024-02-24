package View;

import Model.Vehicle;

// 0. Build your data structure
//1. Load data from file
//2. Add new vehicle
//3. Update vehicle by ID
//4. Delete vehicle ID
//5. Search vehicle
//5.1 Search by name(descending)
//5.2 Search by id
//6. Show vehicle list
//6.1 Show all
//6.2 Show all (descending by price)
//7. Store data to file
public class View {
    public static void mainView () {
        System.out.println("------------------Vehicle Management------------------");
        System.out.println("0. Build your data structure");
        System.out.println("1. Load data from file");
        System.out.println("2. Add new vehicle");
        System.out.println("3. Update vehicle by Id");
        System.out.println("4. Delete vehicle by Id");
        System.out.println("5. Search vehicle");
        System.out.println("6. Show vehicle list");
        System.out.println("7. Store data to file");
        System.out.println("Other to exit");
        System.out.println("------------------------------------------------------");
        System.out.println("Enter your choice: ");
    }
    public static void vehicleView() {
        System.out.println("------------------------------------------------------");
        System.out.println("1. Car");
        System.out.println("2. Motorbike");
        System.out.println("------------------------------------------------------");
        System.out.println("Enter your choice: ");
    }
    public static void inputNameView(String vehicleType) {
        System.out.println("Enter " +vehicleType+ " name (Enter to skip): ");
    }
    public static void inputColorView(String vehicleType) {
        System.out.println("Enter " +vehicleType+ " color (Enter to skip): ");
    }
    public static void inputPriceView(String vehicleType) {
        System.out.println("Enter " +vehicleType+ " price (Enter to skip): ");
    }
    public static void inputBrandView(String vehicleType) {
        System.out.println("Enter " +vehicleType+ " brand (Enter to skip): ");
    }
    public static void inputTypeView(String vehicleType) {
        System.out.println("Enter " +vehicleType+ " type (Enter to skip): ");
    }
    public static void inputYearOfManufactureView(String vehicleType) {
        System.out.println("Enter " +vehicleType+ " year of manufacture (Enter to skip): ");
    }
    public static void inputSpeedView(String vehicleType) {
        System.out.println("Enter " +vehicleType+ " speed (Enter to skip): ");
    }
    public static void inputRequireLicenseView(String vehicleType) {
        System.out.println("Enter " +vehicleType+ " require license (y/n) (Enter to skip): ");
    }
    public static void wrongInputNotify() {
        System.out.println("Your input is wrong");
    }

    public static void inputId() {
        System.out.println("Enter vehicle id: ");
    }
    public static void vehicleNotFoundNotify() {
        System.out.println("Vehicle does not exist");
    }

    public static void searchView() {
        System.out.println("------------------------------------------------------");
        System.out.println("1. Search by vehicle id");
        System.out.println("2. Search by vehicle name");
        System.out.println("------------------------------------------------------");
        System.out.println("Enter your choice: ");
    }

    public static void sayBye() {
        System.out.println("See you again. ");
    }

    public static void showVehicleInShowroom(int count, String vehicleName) {
        System.out.println("There are " +count+ " " +vehicleName+ " in show room");
    }

    public static void updateCarSuccessfulNotify(Vehicle vehicle, int indexVehicle, String oldCarData) {
        System.out.println("Update successfully");
        System.out.println("------------------------------------------------------");
        System.out.println("Car Id: Car" + vehicle.getCars().get(indexVehicle).getId() + " has been changed from:");
        System.out.println(oldCarData);
        System.out.println("To: ");
        System.out.println(vehicle.getCars().get(indexVehicle));
    }

    public static void updateMotorbikeSuccessfulNotify(Vehicle vehicle, int indexVehicle, String oldMotorbikeData) {
        System.out.println("Update successfully");
        System.out.println("------------------------------------------------------");
        System.out.println("Motorbike Id: Motorbike" + vehicle.getMotorbikes().get(indexVehicle).getId() +
                " has been changed from:");
        System.out.println(oldMotorbikeData);
        System.out.println("To: ");
        System.out.println(vehicle.getMotorbikes().get(indexVehicle));
    }

    public static void deleteCarConfirmNotify(Vehicle vehicle, int indexVehicle) {
        System.out.println("------------------------------------------------------");
        System.out.println("Are you sure to delete above car (y/n): ");
    }

    public static void deleteSuccessfulNotify() {
        System.out.println("Delete successful");
    }

    public static void deleteMotorBikeConfirmNotify(Vehicle vehicle, int indexDeleted) {
        System.out.println("------------------------------------------------------");
        System.out.println("Are you sure to delete above motorbike (y/n): ");
    }
}
