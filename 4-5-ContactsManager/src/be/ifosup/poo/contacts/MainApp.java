package be.ifosup.poo.contacts;

import org.fluttercode.datafactory.impl.DataFactory;

import java.util.List;
import java.util.StringJoiner;
import java.util.stream.Collectors;

public class MainApp {
    public static void main(String[] args) {
        ContactManager manager = new ContactManager();
        DataFactory factory = new DataFactory();

        System.out.println("Création des contacts");
        for (int i = 0; i < 20; i++) {
            Contact contact = new ContactBuilder()
                    .setFirstName(factory.getFirstName())
                    .setLastName(factory.getLastName())
                    .setAddress(factory.getAddress())
                    .setCity(factory.getCity())
                    .setEmail(factory.getEmailAddress())
                    .setPhoneNumber(factory.getNumberText(10))
                    .setZipcode(factory.getNumberBetween(1000, 9999))
                    .setBirthday(factory.getBirthDate())
                    .createContact();
            manager.addContact(contact);
        }
        System.out.println("Affichage des contacts");
        manager.getContacts().forEach(System.out::println);

        System.out.println("Affichage détaillé");
        manager.getContacts().forEach(contact -> {
            StringJoiner sj = new StringJoiner(" ");
            sj
                    .add(contact.getFirstName())
                    .add(contact.getLastName())
                    .add(contact.getAddress())
                    .add(String.valueOf(contact.getZipcode()))
                    .add(contact.getCity());
            System.out.println(sj.toString());
        });

        System.out.println("Test recherche");
        List<Contact> filtered = manager.getContacts().parallelStream()
                .filter(contact -> contact.getFirstName().contains("Sydney"))
                .collect(Collectors.toList());
        filtered.forEach(System.out::println);

        manager.filter("Sydney", 0).forEach(System.out::println);
    }
}
