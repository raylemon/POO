package be.ifosup.poo.javafx.beans;

import javafx.beans.property.*;

import java.time.LocalDate;

public final class Person {
    private StringProperty firstName = new SimpleStringProperty();
    private StringProperty lastName = new SimpleStringProperty();
    private StringProperty address = new SimpleStringProperty();
    private StringProperty city = new SimpleStringProperty();
    private IntegerProperty zipcode = new SimpleIntegerProperty();
    private StringProperty emailAddr = new SimpleStringProperty();
    private StringProperty phoneNumber = new SimpleStringProperty();
    private ObjectProperty<LocalDate> birthday = new SimpleObjectProperty<>();
    private LongProperty id = new SimpleLongProperty();

    public long getId() {
        return id.get();
    }

    public void setId(long id) {
        this.id.set(id);
    }

    public LongProperty idProperty() {
        return id;
    }

    public String getFirstName() {
        return firstName.get();
    }

    public void setFirstName(String firstName) {
        this.firstName.set(firstName);
    }

    public StringProperty firstNameProperty() {
        return firstName;
    }

    public String getLastName() {
        return lastName.get();
    }

    public void setLastName(String lastName) {
        this.lastName.set(lastName);
    }

    public StringProperty lastNameProperty() {
        return lastName;
    }

    public String getAddress() {
        return address.get();
    }

    public void setAddress(String address) {
        this.address.set(address);
    }

    public StringProperty addressProperty() {
        return address;
    }

    public String getCity() {
        return city.get();
    }

    public void setCity(String city) {
        this.city.set(city);
    }

    public StringProperty cityProperty() {
        return city;
    }

    public int getZipcode() {
        return zipcode.get();
    }

    public void setZipcode(int zipcode) {
        this.zipcode.set(zipcode);
    }

    public IntegerProperty zipcodeProperty() {
        return zipcode;
    }

    public String getEmailAddr() {
        return emailAddr.get();
    }

    public void setEmailAddr(String emailAddr) {
        this.emailAddr.set(emailAddr);
    }

    public StringProperty emailAddrProperty() {
        return emailAddr;
    }

    public String getPhoneNumber() {
        return phoneNumber.get();
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber.set(phoneNumber);
    }

    public StringProperty phoneNumberProperty() {
        return phoneNumber;
    }

    public LocalDate getBirthday() {
        return birthday.get();
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday.set(birthday);
    }

    public ObjectProperty<LocalDate> birthdayProperty() {
        return birthday;
    }
}
