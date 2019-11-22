package be.ifosup.poo.javafx.controllers;

import be.ifosup.poo.javafx.beans.Person;
import javafx.beans.property.*;

import java.time.LocalDate;

public class PersonViewModel {
    private StringProperty firstName = new SimpleStringProperty();
    private StringProperty lastName = new SimpleStringProperty();
    private StringProperty address = new SimpleStringProperty();
    private StringProperty city = new SimpleStringProperty();
    private IntegerProperty zipcode = new SimpleIntegerProperty();
    private StringProperty emailAddr = new SimpleStringProperty();
    private StringProperty phoneNumber = new SimpleStringProperty();
    private ObjectProperty<LocalDate> birthday = new SimpleObjectProperty<>();
    private BooleanProperty changed = new SimpleBooleanProperty(true);

    private Person person;

    public StringProperty firstNameProperty() {
        return firstName;
    }

    public StringProperty lastNameProperty() {
        return lastName;
    }

    public StringProperty addressProperty() {
        return address;
    }

    public StringProperty cityProperty() {
        return city;
    }

    public IntegerProperty zipcodeProperty() {
        return zipcode;
    }

    public StringProperty emailAddrProperty() {
        return emailAddr;
    }

    public StringProperty phoneNumberProperty() {
        return phoneNumber;
    }

    public ObjectProperty<LocalDate> birthdayProperty() {
        return birthday;
    }

    PersonViewModel() {
        firstNameProperty().addListener(change -> this.changed.setValue(false));
        lastNameProperty().addListener(change -> this.changed.setValue(false));
        addressProperty().addListener(change -> this.changed.setValue(false));
        cityProperty().addListener(change -> this.changed.setValue(false));
        zipcodeProperty().addListener(change -> this.changed.setValue(false));
        phoneNumberProperty().addListener(change -> this.changed.setValue(false));
        emailAddrProperty().addListener(change -> this.changed.setValue(false));
        birthdayProperty().addListener(change -> this.changed.setValue(false));
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
        rollback();
    }

    public void commit() {
        person.setFirstName(this.firstName.getValue());
        person.setLastName(this.lastName.getValue());
        person.setAddress(this.address.getValue());
        person.setZipcode(this.zipcode.getValue());
        person.setCity(this.city.getValue());
        person.setPhoneNumber(this.phoneNumber.getValue());
        person.setEmailAddr(this.emailAddr.getValue());
        person.setBirthday(this.birthday.getValue());
    }

    public BooleanProperty disableProperty() {
        return changed;
    }

    public void rollback() {
        this.firstName.setValue(person.getFirstName());
        this.lastName.setValue(person.getLastName());
        this.address.setValue(person.getAddress());
        this.city.setValue(person.getCity());
        this.zipcode.setValue(person.getZipcode());
        this.phoneNumber.setValue(person.getPhoneNumber());
        this.emailAddr.setValue(person.getEmailAddr());
        this.birthday.setValue(person.getBirthday());
        this.changed.setValue(true);
    }
}
