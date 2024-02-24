package Controller;

import Model.Fruit;
import Model.Order;
import View.View;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Scanner;

public class Shopping {

    public static void start(ArrayList<Fruit> fruits, Order order, Hashtable<String, ArrayList<String>> customerOrders,
                             Scanner sc, int userChoice) {
        int total = 0;
        if (!customerOrders.isEmpty()) {
            System.out.println("Orders is empty");
            order = new Order();
        }
        do {            // loop for input order
            View.fruitListHeader();
            for (int i = 0; i < fruits.size(); i++) {       //loop for show available fruits
                View.fruitListDetail(fruits.get(i).getFruitId(), fruits.get(i).getFruitName(),
                        fruits.get(i).getOrigin(), fruits.get(i).getPrice());
            }
            try {
                View.getUserChoiceFruit();
                userChoice = sc.nextInt();
                sc.nextLine();
                order.getItems().add(fruits.get(userChoice - 1).getFruitName());
                View.selectedFruit(fruits.get(userChoice - 1).getFruitName());
                View.getQuantityInputPrompt();
                int quantity = sc.nextInt();
                sc.nextLine();
                order.getQuantities().add(quantity);
            } catch (Exception e) {
                View.wrongInputNotify();
                sc.nextLine();
            }
        } while (UserInputHandler.askUserToOrder(sc)); // break when user press "y"

        View.fruitOrderHeader();

        for (int i = 0; i < fruits.size(); i++) {
            order.getAmount().add(Calculate.amount(fruits.get(i).getPrice(), order.getQuantities().get(i)));
            total += order.getAmount().get(i);
            order.getTotal().add(total);
        }
        for (int i = 0; i < order.getItems().size(); i++) {
            View.fruitOrderDetail(fruits.get(i).getFruitName(), order.getQuantities().get(i),
                    fruits.get(i).getPrice(), order.getAmount().get(i));
        }
        View.total(order.getTotal().get(order.getTotal().size() - 1));
        View.inputCustomerName();
        String customerName = sc.nextLine();
        customerOrders.put(customerName, order.getItems());
    }
}
