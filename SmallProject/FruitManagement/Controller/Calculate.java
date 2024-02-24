package Controller;

public class Calculate {
    static int total = 0;
    public static int amount(int price, int quantity) {
        return quantity*price;
    }

    public static int total(int currentAmount) {
        return total + currentAmount;
    }
}
