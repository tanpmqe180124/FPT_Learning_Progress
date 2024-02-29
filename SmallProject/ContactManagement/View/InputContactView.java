package View;

public class InputContactView {

    public static void requestUserChoice() {
        System.out.println("Enter your choice: ");
    }

    public static void requestFullName() {
        System.out.println("Enter full name: ");
    }

    public static void requestGroup() {
        System.out.println("Enter group: ");
    }

    public static void requestAddress() {
        System.out.println("Enter address: ");
    }

    public static void requestPhoneNumber() {
        System.out.println("Enter phone number: ");
    }

    public static void numberFormat() {
        System.out.println("-------------------------------------------------");
        System.out.println("1234567890");
        System.out.println("123-456-7890");
        System.out.println("123-456-7890 x1234");
        System.out.println("123-456-7890 ext1234");
        System.out.println("(123)-456-7890");
        System.out.println("123.456.7890");
        System.out.println("123 456 7890");
        System.out.println("-------------------------------------------------");
    }

    public static void requestId() {
        System.out.println("Enter ID: ");
    }
}
