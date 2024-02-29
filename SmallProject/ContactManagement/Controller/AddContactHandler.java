package Controller;

import Model.Contact;
import Utilities.FullNameParser;
import Validator.AlphaStringValidator;
import Validator.PhoneValidator;
import View.InputContactView;

import java.util.ArrayList;
import java.util.Scanner;

public class AddContactHandler {

    public static void run(Scanner sc, Contact contact, ArrayList<Contact> contacts) {
        String fullName = AlphaStringValidator.input(sc, "fullName");
        String group = AlphaStringValidator.input(sc, "group");
        InputContactView.requestAddress();
        String address = sc.nextLine();
        String phone = PhoneValidator.input(sc);
        String lastName = FullNameParser.extractNameComponent(sc, "lastName", fullName);
        String firstName = FullNameParser.extractNameComponent(sc, "firstName", fullName);
        contact = new Contact(fullName, group, address, phone, lastName, firstName);
        contacts.add(contact);
    }
}
