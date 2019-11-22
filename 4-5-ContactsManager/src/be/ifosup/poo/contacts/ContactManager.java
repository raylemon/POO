package be.ifosup.poo.contacts;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Predicate;
import java.util.stream.Collectors;

class ContactManager {
    private List<Contact> contacts = new ArrayList<>();

    void addContact(Contact contact){
        if (!contacts.contains(contact)) contacts.add(contact);
    }

    void deleteContact(Contact contact){
        contacts.remove(contact);
    }

    void deleteContact(int index){
        contacts.remove(index);
    }

    List<Contact> getContacts() {
        return contacts;
    }

    void setContacts(List<Contact> contacts) {
        this.contacts = contacts;
    }

    List<Contact> filter(String name, int zipcode){
        Predicate<Contact> predicate = null;
        if (name != null) {
            predicate = contact ->
                    contact.getFirstName().contains(name) ||
                            contact.getLastName().contains(name);
        }
        if (zipcode != 0){
            if (predicate == null)
                predicate = contact -> contact.getZipcode() == zipcode;
            else predicate = predicate.and(contact -> contact.getZipcode() == zipcode);
        }

        if (predicate == null) {
            predicate = Objects::nonNull;
        }
        List<Contact> out = contacts.parallelStream().filter(predicate).collect(Collectors.toList());
        if (out.isEmpty()) System.err.println("Personne");
        return out;
    }
}
