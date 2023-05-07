import java.util.*;

public class Main {
    public static void main(String[] args) {

        //new object from RentalStore Class
        var rentalStore = new RentalStore();

        //new object from Customer Class and register it in rentalStor with register method
        var customer1 = new Customer("ali" , "alliikochaki" , "0936" , "Qaemshahr" , 936);
        rentalStore.register(customer1);

        //new objects from Movie Class and add in rentalStore with addMovie method
        List actorsList = Arrays.asList("mmd" , "yaser" , "hamed" , "zahra");
        ArrayList<String> actors = new ArrayList<>();
        actors.addAll(actorsList);
        var date = new Date();

        var movie1 = new Movie("red notice" , "action" , "director" , actors , date , 21);
        rentalStore.addMovie(movie1);

        var movie2 = new Movie("black notice" , "dark action" , "bad director" , actors , date , 123);
        rentalStore.addMovie(movie2);

        var movie3 = new Movie("green notice" , "light action" , "good director" , actors , date , 110);
        rentalStore.addMovie(movie3);

        System.out.println(rentalStore.getAvailableMovies());
        rentalStore.rentMovie(movie1 , customer1);
        System.out.println(rentalStore.getAvailableMovies());
        rentalStore.returnMovie(movie1 , customer1);
        System.out.println(rentalStore.getAvailableMovies());

        System.out.println(rentalStore.getCustomerById(936));

        System.out.println(rentalStore.getMovieById(21));

        System.out.println(rentalStore.getRentals().get(0).rentalDate);
        System.out.println(rentalStore.getRentals().get(0).returnDate);
        rentalStore.removeMovie(movie1);
        System.out.println(rentalStore.getAvailableMovies());
    }
}