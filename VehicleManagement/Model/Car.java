package Model;

public class Car extends Vehicle implements VehicleInterface {
    private static int id = 10000;
    private String carId;
    private String type;
    private int yearOfManufacture;

    public Car(String carId, String name, String color, int price, String brand, String type, int yearOfManufacture) {
        super(name, color, price, brand);
        if (carId.equals("generate")) {
            this.carId = generateId();
        } else {
            this.carId = carId;
        }
        this.type = type;
        this.yearOfManufacture = yearOfManufacture;
    }

    public static String generateId() {
        return "Car" + id++;
    }
    @Override
    public void setIdAfterRemove() {
        id--;
    }
    @Override
    public void setId (int id) {
        this.carId = "Car" + id;
    }
    @Override
    public int getId() {
        return Integer.parseInt(carId.replace("Car", ""));
    }

    @Override
    public String toString() {
        return "Car{" +
                "carId='" + carId + '\'' +
                ", name='" + getName() + '\'' +
                ", color='" + getColor() + '\'' +
                ", price=" + getPrice() +
                ", brand='" + getBrand() + '\'' +
                ", type='" + type + '\'' +
                ", yearOfManufacture='" + yearOfManufacture + '\'' +
                '}';
    }
    public static boolean isCar(String data) {
        return data.contains("Car");
    }
}
