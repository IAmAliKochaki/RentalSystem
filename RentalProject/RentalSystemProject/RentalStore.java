import java.util.ArrayList;
import java.util.Date;

public class RentalStore {

    ArrayList<Customer> customers;
    ArrayList<Movie> movies;
    ArrayList<Rental> rentals;

    public RentalStore() {
        this.movies = new ArrayList<>();
        this.customers = new ArrayList<>();
        this.rentals = new ArrayList<>();
    }

    public void register(Customer customer){
        customers.add(customer);
    }

    public void addMovie(Movie movie){
        movies.add(movie);
    }

    public void removeMovie(Movie movie){
        movies.remove(movie);
    }

    public ArrayList<Movie> getAvailableMovies() {

        ArrayList<Movie> availableMovies = new ArrayList<>();
        for (int i=0 ; i<movies.size() ; i++){
            if (movies.get(i).isAvailable()==true)
                availableMovies.add(movies.get(i));
        }
        return availableMovies;
    }

    public ArrayList<Rental> getRentals() {
        return rentals;
    }

    public void rentMovie(Movie movie , Customer customer){
        int indexOfMovie = movies.indexOf(movie);
        if (movies.get(indexOfMovie).isAvailable()){
            movies.get(indexOfMovie).setAvailable(false);
            int id = movies.get(movies.indexOf(movie)).getID() + customers.get(customers.indexOf(customer)).getID();
            var rental = new Rental(movie , customer , id );
            Date date = new Date();
            rental.setrentalDate(date);
            rentals.add(rental);
        }
        else
            System.out.println("the movie is not available!");
    }

    public void returnMovie(Movie movie , Customer customer){
        int indexOfMovie = movies.indexOf(movie);
        movies.get(indexOfMovie).setAvailable(true);
        int id = movies.get(movies.indexOf(movie)).getID() + customers.get(customers.indexOf(customer)).getID();
        int indexOfRental = -1;
        for(int i=0 ; i<rentals.size() ; i++){
            if (rentals.get(i).getId()==(id)){
                indexOfRental = i;
                break;
            }
        }
        if (indexOfRental != -1){
            Date date = new Date();
            rentals.get(indexOfRental).setReturnDate(date);
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

    public Movie getMovieById(int id){
        int indexOfMovie = -1;
        for (int i=0 ;  i<movies.size() ; i++){
            if (id==(movies.get(i).getID())){
                indexOfMovie = i;
                break;
            }
        }
        if (indexOfMovie !=-1)
            return movies.get(indexOfMovie);
        return null;
    }

}
