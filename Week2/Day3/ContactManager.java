package Week2.Day3;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ContactManager {
    List<Contact> contactList;
    Set<Contact>  uniqueCheck;
    public ContactManager(){
        contactList = new ArrayList<>();
        uniqueCheck = new HashSet<>();
    }

    public boolean addContact(Contact contact){
        if (uniqueCheck.add(contact)){
            contactList.add(contact);
            System.out.println("Contact Added...");
            return true;
        }
        else{
            System.out.println("Duplicate Contact...");
            return false;
        }

    }





//    private List<Contact> contactList;
//    private Set<Contact> uniqueCheck;
//
//    public ContactManager() {
//        contactList = new ArrayList<>();
//        uniqueCheck = new HashSet<>();
//    }
//
//    /**
//     * Attempts to add a contact to the list.
//     * @param contact The contact to add
//     * @return true if added successfully, false if it's a duplicate
//     */
//    public boolean addContact(Contact contact) {
//        if (uniqueCheck.add(contact)) {
//            contactList.add(contact);
//            System.out.println("Added: " + contact);
//            return true;
//        } else {
//            System.out.println("Duplicate prevented: " + contact.getName() +
//                    " shares a phone number with an existing contact.");
//            return false;
//        }
//    }
//
    public void displayContacts() {
        System.out.println("\n--- My Contact List ---");
        for (int i = 0; i < contactList.size(); i++) {
            System.out.println((i + 1) + ". " + contactList.get(i));
        }
        System.out.println("-----------------------\n");
    }
    public static void main(String[] args) {
        ContactManager manager = new ContactManager();
        manager.addContact(new Contact("Alice Smith", "03001111222"));
        manager.addContact(new Contact("Bob Jones", "5550"));
        manager.addContact(new Contact("Alice (Work)", "555-0100"));
        manager.addContact(new Contact("Charlie Brown", "555-0102"));
        manager.displayContacts();
    }
}