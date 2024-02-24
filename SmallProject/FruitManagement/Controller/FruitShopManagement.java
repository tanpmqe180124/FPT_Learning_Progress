package Controller;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Scanner;

import Model.Fruit;
import Model.Order;
import View.View;
public class FruitShopManagement {
    public static void start () {
        int userChoice = 0;

        Scanner sc = new Scanner(System.in);
        Fruit fruit = new Fruit();
        Order order = new Order();

        ArrayList<Fruit> fruits = new ArrayList<>();
        Hashtable<String, ArrayList<String>> customerOrders = new Hashtable<>();
        do {
            try {
                View.mainMenu();
                userChoice = sc.nextInt();
                sc.nextLine();
                switch (userChoice) {
                    case 1:
                        CreateFruit.start(fruits, fruit, sc);
                        break;
                    case 2:
                        ViewOrders.start(customerOrders, order, fruits);
                        break;
                    case 3:
                        Shopping.start(fruits, order, customerOrders, sc, userChoice);
                        break;
                    case 4:
                        View.sayBye();
                        sc.close();
                        break;
                    default:
                        View.wrongInputNotify();
                        break;
                }
            } catch (Exception e) {
                View.wrongInputNotify();
                sc.nextLine();
            }
        } while (userChoice != 4);
    }
}
