package View;

public class NotifyView {

    public static void wrongInput() {
        System.out.println("Your input is wrong, try again");
    }

    public static void sayBye() {
        System.out.println("Good bye, see you again");
    }

    public static void inputNotValid() {
        System.out.println("Your input is not valid");
    }

    public static void removeSuccessfully(int idRemoved) {
        System.out.println("Remove successfully ID: " +idRemoved);
    }
}
