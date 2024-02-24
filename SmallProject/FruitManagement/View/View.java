package View;

public class View {
    public static void mainMenu() {
        System.out.println("--------------------- Fruit shop management ---------------------");
        System.out.println("1. Create Fruit");
        System.out.println("2. View orders");
        System.out.println("3. Shopping");
        System.out.println("4. Exit");
        System.out.println("(Please choose 1 to create product, 2 to view order, 3 for shopping, 4 to Exit program).");
        System.out.println("-----------------------------------------------------------------");
        System.out.println("Enter your choice: ");
    }

    public static void wrongInputNotify() {
        System.out.println("Your input is wrong try again.");
    }

    public static void sayBye() {
        System.out.println("Good bye, thanks for using fruit shop management.");
    }

    public static void askUserToContinue() {
        System.out.println("Do you want to continue (Y/N)?");
    }

    public static void inputNameView() {
        System.out.println("Enter fruit name: ");
    }

    public static void inputPriceView() {
        System.out.println("Enter price: ");
    }

    public static void inputQuantityView() {
        System.out.println("Enter quantity: ");
    }

    public static void inputOriginView() {
        System.out.println("Enter origin: ");
    }

    public static void ordersEmptyNotify() {
        System.out.println("Orders is empty");
    }

    public static void fruitListHeader() {
        System.out.println("List of Fruit:");
        System.out.println("| ++ Item ++ | ++ Fruit Name ++ | ++ Origin ++ | ++ Price ++ |");
    }

    public static void fruitListDetail(int id, String fruitName, String origin, int price) {
        System.out.printf("| %-10s | %-15s | %-10s | %-10s $|\n", id, fruitName, origin, price);
    }

    public static void getUserChoiceFruit() {
        System.out.println("-----------------------------------------------------------------");
        System.out.println("Enter your choice: ");
    }

    public static void selectedFruit(String fruitName) {
        System.out.println("You selected: " +fruitName);
    }

    public static void getQuantityInputPrompt() {
        System.out.println("-----------------------------------------------------------------");
        System.out.println("Please input quantity: ");
    }

    public static void askUserToOrder() {
        System.out.println("Do you want to order now (Y/N)?");
    }

    public static void fruitOrderHeader() {
        System.out.println("| ++ Product ++ | ++ Quantity ++ | ++ Price ++ | ++ Amount ++ ");
    }

    public static void fruitOrderDetail(String fruitName, int quantity, int price, int amount) {
        System.out.printf("| %-10s | %-16s | %-11s $| %-11s $|\n", fruitName, quantity, price, amount);
    }

    public static void inputCustomerName() {
        System.out.println("Input your name: ");
    }

    public static void total(int total) {
        System.out.println("Total: " +total+" $");
    }

    public static void line() {
        System.out.println("-----------------------------------------------------------------");
    }
}
