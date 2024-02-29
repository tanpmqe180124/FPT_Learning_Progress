package Controller;

import Model.Contact;
import View.HeaderView;

import java.util.ArrayList;

public class ShowContactHandler {

    public static void run(ArrayList<Contact> contacts) {
        HeaderView.contact();
        for (int i = 0; i < contacts.size(); i++) {
            System.out.printf("%-3s %-15s %-10s %-10s %-10s %-32s %-12s\n", contacts.get(i).getContactId(),
                    contacts.get(i).getFullName(), contacts.get(i).getFirstName(), contacts.get(i).getLastName(),
                    contacts.get(i).getGroup(), contacts.get(i).getAddress(), contacts.get(i).getPhone());
        }
    }
}
