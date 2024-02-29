package Controller;

import Model.Contact;
import View.InputContactView;
import View.MenuView;
import View.NotifyView;

import java.util.ArrayList;
import java.util.Scanner;

public class ContactManagement {
    public static void run() {
        int userChoice = 0;
        Contact contact = new Contact();
        ArrayList<Contact> contacts = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        do {
            try {
                MenuView.contactData();
                InputContactView.requestUserChoice();
                userChoice = sc.nextInt();
                sc.nextLine();
                switch (userChoice) {
                    case 1:
                        AddContactHandler.run(sc, contact, contacts);
                        break;
                    case 2:
                        ShowContactHandler.run(contacts);
                        break;
                    case 3:
                        DeleteContactHandler.run(sc, contacts);
                        break;
                    case 4:
                        NotifyView.sayBye();
                        break;
                }
            } catch (Exception e) {
                NotifyView.wrongInput();
                sc.nextLine();
            }
        } while (userChoice != 4);
    }
}
