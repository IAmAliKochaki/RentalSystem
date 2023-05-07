import java.util.ArrayList;
import java.util.Date;

public class Rental {
    private Movie movie;
    private Customer customer;
    private int id;
    public  Date rentalDate;
    public  Date returnDate;

    public Rental(Movie movie, Customer customer, int id) {
        this.movie = movie;
        this.customer = customer;
        this.id = id;
    }

    public Date getRentalDate(){
        return rentalDate;
    }

    public Date getReturnDate(){
        return returnDate;
    }

    public void setReturnDate(Date returnDate){this.returnDate = returnDate;}

    public Movie getMovie() {return movie;}

    public Customer getCustomer() {return customer;}

    public int getId() {return id;}

    public void setrentalDate(Date rentalDate){this.rentalDate = rentalDate;}

}
