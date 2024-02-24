package Controller;

import java.util.ArrayList;
import java.util.Hashtable;

import Model.Fruit;
import Model.Order;
import View.View;
public class ViewOrders {
    public static void start(Hashtable<String, ArrayList<String>> customerOrders, Order order,
                             ArrayList<Fruit> fruits) {
        for (String customer : customerOrders.keySet()) {
            System.out.println("Customer: " +customer);
            View.fruitOrderHeader();
            String data = String.valueOf(customerOrders.get(customer));
            String[] datas = data.split(",");
            for (int i = 0; i < order.getItems().size(); i++) {
                View.fruitOrderDetail(datas[i], order.getQuantities().get(i),
                        fruits.get(i).getPrice(), order.getAmount().get(i));
            }
            View.total(order.getTotal().get(order.getTotal().size() - 1));
            View.line();
        }
    }
}
