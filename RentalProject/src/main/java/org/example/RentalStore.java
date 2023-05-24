package org.example;
import java.util.ArrayList;
import java.util.Date;

public class RentalStore {
    private ArrayList<Customer> customers;
    private ArrayList<Item> items ;
    private ArrayList<Rental> rentals;
    public RentalStore() {
        this.customers = new ArrayList<>();
        this.rentals = new ArrayList<>();
        this.items = new ArrayList<>();
    }

    public void register(Customer customer){
        customers.add(customer);
    }

    public void addItem(Item item){
        items.add(item);
    }

    public void removeItem(Item item, Customer brown){
        items.remove(item);
    }

    public ArrayList<Item> getAvailableItems() {

        ArrayList<Item> availableItems = new ArrayList<>();
        for (int i=0 ; i<items.size() ; i++){
            if (items.get(i).isAvailable()==true)
                availableItems.add(items.get(i));
        }
        return availableItems;
    }

    public ArrayList<Rental> getRentals() {
        return rentals;
    }

    public void rentItem(Item item , Customer customer){
        int indexOfItem = items.indexOf(item);
        if (items.get(indexOfItem).isAvailable()){
            items.get(indexOfItem).setAvailable(false);
            var rental = new Rental(item , customer);
            Date date = new Date();
            rental.setrentalDate(date);
            rentals.add(rental);
        }
        else
            System.out.println("the item is not available!");
    }

    public void returnItem(Item item , Customer customer){
        item.setAvailable(true);
            for (Rental rental : rentals) {
                if (rental.getItem()==item && rental.getCustomer()==customer){
                    rental.setReturnDate(new Date());
                }
            }
    }

    public Customer getCustomerById(int id){
        int indexOfCustomer = -1;
        for (int i=0 ;  i<customers.size() ; i++){
            if (id==(customers.get(i).getID())){
                indexOfCustomer = i;
                break;
            }
        }
        if (indexOfCustomer !=-1)
            return customers.get(indexOfCustomer);
        return null;
    }

    public Item getItemById(int id){
        int indexOfItem = -1;
        for (int i=0 ;  i<items.size() ; i++){
            if (id==(items.get(i).getID())){
                indexOfItem = i;
                break;
            }
        }
        if (indexOfItem !=-1)
            return items.get(indexOfItem);
        return null;
    }

}
