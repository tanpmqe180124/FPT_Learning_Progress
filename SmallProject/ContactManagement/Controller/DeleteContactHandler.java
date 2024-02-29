package Controller;

import Model.Contact;
import View.InputContactView;
import View.NotifyView;

import java.util.ArrayList;
import java.util.Scanner;

public class DeleteContactHandler {
    public static void run(Scanner sc, ArrayList<Contact> contacts) {
        InputContactView.requestId();
        int idRemove = sc.nextInt();
        sc.nextLine();
        boolean found = false;
        int deletedIndex = -1;
        for (int i = 0; i < contacts.size(); i++) {
            if (contacts.get(i).getContactId() == idRemove) {
                contacts.remove(i);
                NotifyView.removeSuccessfully(idRemove);
                deletedIndex = i;
                found = true;
                break;
            }
        }
        if (!found) {
            NotifyView.inputNotValid();
        } else {
            for (int i = deletedIndex; i < contacts.size(); i++) {
                contacts.get(i).setContactId(idRemove);
                idRemove++;
            }
        }
    }
}
