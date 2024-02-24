package Model;

public class Motorbike extends Vehicle implements VehicleInterface {
    private static int id = 10000;
    private String motorbikeId;
    private int speed;
    private String requireLicense;

    public Motorbike(String motorbikeId, String name, String color, int price, String brand,
                     int speed, String needLicense) {
        super(name, color, price, brand);
        if (motorbikeId.equals("generate")) {
            this.motorbikeId = generateId();
        } else {
            this.motorbikeId = motorbikeId;
        }
        this.speed = speed;
        this.requireLicense = needLicense;
    }
    public void makeSound () {
        System.out.println("Tin tin tin");
    }

    public static String generateId() {
        return "Motorbike" + id++;
    }

    @Override
    public int getId() {
        return Integer.parseInt(motorbikeId.replace("Motorbike", ""));
    }
    @Override
    public void setId (int id) {
        this.motorbikeId = "Motorbike" + id;
    }
    @Override
    public void setIdAfterRemove() {
        id--;
    }
    public int getSpeed() {
        return speed;
    }

    public String getRequireLicense() {
        return requireLicense;
    }

    @Override
    public String toString() {
        return "Motorbike{" +
                "motorbikeId='" + motorbikeId + '\'' +
                ", name='" + getName() + '\'' +
                ", color='" + getColor() + '\'' +
                ", price=" + getPrice() +
                ", brand='" + getBrand() + '\'' +
                ", speed='" + getSpeed() + '\'' +
                ", requireLicense='" + getRequireLicense() + '\'' +
                '}';
    }
}
