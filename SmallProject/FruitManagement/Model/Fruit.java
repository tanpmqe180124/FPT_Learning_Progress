package Model;

public class Fruit {
    private static int id = 0;
    private int fruitId;
    private String fruitName;
    private int price;
    private int quantity;
    private String origin;
    public Fruit() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFruitName() {
        return fruitName;
    }

    public void setFruitName(String fruitName) {
        this.fruitName = fruitName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public int getFruitId() {
        return fruitId;
    }

    public void setFruitId(int fruitId) {
        this.fruitId = fruitId;
    }

    public Fruit (int id, String fruitName, int price, int quantity, String origin) {
        if (id == 0) {
            this.fruitId = generateId();
        } else {
            this.fruitId = id;
        }
        this.fruitName = fruitName;
        this.price = price;
        this.quantity = quantity;
        this.origin = origin;
    }

    private int generateId() {
        return ++id;
    }
}
