package org.example;

public class Customer {
    private String name;
    private String email;
    private String phoneNumber;
    private String address;
    private int ID;

    public Customer(String name, String email, String phoneNumber, String address, int ID) {
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public int getID() {
        return ID;
    }
}
