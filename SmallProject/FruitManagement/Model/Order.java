package Model;

import java.util.ArrayList;

public class Order {
    private ArrayList<String> items;

    private ArrayList<Integer> quantities;
    private ArrayList<Integer> amount;
    private ArrayList<Integer> total;

    public Order() {
        this.items = new ArrayList<>();
        this.quantities = new ArrayList<>();
        this.amount = new ArrayList<>();
        this.total = new ArrayList<>();
    }

    public ArrayList<String> getItems() {
        return items;
    }

    public ArrayList<Integer> getTotal() {
        return total;
    }

    public void setTotal(ArrayList<Integer> total) {
        this.total = total;
    }

    public void setItems(ArrayList<String> items) {
        this.items = items;
    }

    public ArrayList<Integer> getQuantities() {
        return quantities;
    }

    public void setQuantities(ArrayList<Integer> quantities) {
        this.quantities = quantities;
    }

    public ArrayList<Integer> getAmount() {
        return amount;
    }

    public void setAmount(ArrayList<Integer> amount) {
        this.amount = amount;
    }
}
