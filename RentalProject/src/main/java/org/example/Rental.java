package org.example;
import java.util.Date;

public class Rental{
    private Item item;
    private Customer customer;
    private int ID;
    private static int id=1;
    public  Date rentalDate;
    public  Date returnDate;

    public Rental(Item item, Customer customer) {
        this.item = item;
        this.customer = new Customer(customer.getName(), customer.getEmail(), customer.getPhoneNumber(), customer.getAddress(), customer.getID());
        this.ID = id++;
    }

    public Date getRentalDate(){
        return rentalDate;
    }

    public Date getReturnDate(){
        return returnDate;
    }

    public void setReturnDate(Date returnDate){this.returnDate = returnDate;}

    public Item getItem() {return item;}

    public Customer getCustomer() {return customer;}

    public int getId() {return ID;}

    public void setrentalDate(Date rentalDate){this.rentalDate = rentalDate;}

}
