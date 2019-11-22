package be.ifosup.poo.contacts;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

public class ContactBuilder {
    private String firstName;
    private String lastName;
    private String address;
    private String city;
    private int zipcode;
    private String phoneNumber;
    private String email;
    private LocalDate birthday;

    public ContactBuilder setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public ContactBuilder setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public ContactBuilder setAddress(String address) {
        this.address = address;
        return this;
    }

    public ContactBuilder setCity(String city) {
        this.city = city;
        return this;
    }

    public ContactBuilder setZipcode(int zipcode) {
        this.zipcode = zipcode;
        return this;
    }

    public ContactBuilder setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    public ContactBuilder setEmail(String email) {
        this.email = email;
        return this;
    }

    public ContactBuilder setBirthday(LocalDate birthday) {
        this.birthday = birthday;
        return this;
    }

    public Contact createContact() {
        return new Contact(firstName, lastName, address, city, zipcode, phoneNumber, email, birthday);
    }

    public ContactBuilder setBirthday(Date birthDate) {
        this.birthday = birthDate.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        return this;
    }
}