package Controller;

import Model.Fruit;

import java.util.ArrayList;
import java.util.Scanner;
import View.View;

public class CreateFruit {

    public static void start(ArrayList<Fruit> fruits, Fruit fruit, Scanner sc) {
        while (true) {
            try {
                View.inputNameView();
                String fruitName = sc.nextLine();
                View.inputPriceView();
                int price = sc.nextInt();
                sc.nextLine();
                View.inputQuantityView();
                int quantity = sc.nextInt();
                sc.nextLine();
                View.inputOriginView();
                String origin = sc.nextLine();
                fruit = new Fruit(0, fruitName, price, quantity, origin);
                fruits.add(fruit);
            } catch (Exception e) {
                View.wrongInputNotify();
                sc.nextLine();
            }
            if (!UserInputHandler.askUserToContinue(sc)) { // break when user press n
                break;
            }
        }
    }
}
