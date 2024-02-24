package Model;

import java.util.ArrayList;

public class Vehicle {
    private String name;
    private String color;
    private int price;
    private String brand;
    private ArrayList<Car> cars;
    private ArrayList<Motorbike> motorbikes;

    public Vehicle() {
    }

    public Vehicle(String name, String color, int price, String brand) {
        this.name = name;
        this.color = color;
        this.price = price;
        this.brand = brand;
    }

    public String getName() {
        return name;
    }
    public String getColor() {
        return color;
    }

    public int getPrice() {
        return price;
    }

    public String getBrand() {
        return brand;
    }

    public ArrayList<Car> getCars() {
        if (cars == null) {
            this.cars = new ArrayList<>();
        }
        return cars;
    }

    public void setCars(ArrayList<Car> cars) {
        this.cars = cars;
    }

    public ArrayList<Motorbike> getMotorbikes() {
        if (motorbikes == null) {
            this.motorbikes = new ArrayList<>();
        }
        return motorbikes;
    }

    public void setMotorbikes(ArrayList<Motorbike> motorbikes) {
        this.motorbikes = motorbikes;
    }


    public boolean isEmpty() {
        if (cars == null && motorbikes == null) {
            System.out.println("Show room is empty, please add more vehicle");
            return true;
        }
         return false;
    }
}
