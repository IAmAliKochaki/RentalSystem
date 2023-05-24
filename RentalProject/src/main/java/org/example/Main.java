package org.example;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;

public class Main {
    public static void main(String[] args) throws IOException {
        var rentalStore = new RentalStore();
        Gson gson = new Gson(); // create a new Gson object
        Reader reader = new FileReader("C:\\Users\\LENOVO\\OneDrive\\Desktop\\RentalProjectSecondPart\\RentalSystem\\RentalProject\\src\\test\\TestYourFork.json"); // open the input file
        AllModules allModulesList = gson.fromJson(reader , new TypeToken<AllModules>() {
        }.getType());

        Customer Joshn = allModulesList.customers.get(0);
        Customer Emily = allModulesList.customers.get(1);
        Customer Brown = allModulesList.customers.get(2);

        Movie movie1 = allModulesList.movies.get(0);
        Movie movie2 = allModulesList.movies.get(1);
        Movie movie3 = allModulesList.movies.get(2);
        Movie movie4 = allModulesList.movies.get(3);
        Movie movie5 = allModulesList.movies.get(4);
        Movie movie6 = allModulesList.movies.get(5);
        Movie movie7 = allModulesList.movies.get(6);
        Movie movie8 = allModulesList.movies.get(7);
        Movie movie9 = allModulesList.movies.get(8);
        Movie movie10 = allModulesList.movies.get(9);

        Game game1 = allModulesList.games.get(0);
        Game game2 = allModulesList.games.get(1);
        Game game3 = allModulesList.games.get(2);
        Game game4 = allModulesList.games.get(3);
        Game game5 = allModulesList.games.get(4);
        Game game6 = allModulesList.games.get(5);
        Game game7 = allModulesList.games.get(6);
        Game game8 = allModulesList.games.get(7);
        Game game9 = allModulesList.games.get(8);
        Game game10 = allModulesList.games.get(9);

        Book book1 = allModulesList.books.get(0);
        Book book2 = allModulesList.books.get(1);
        Book book3 = allModulesList.books.get(2);
        Book book4 = allModulesList.books.get(3);
        Book book5 = allModulesList.books.get(4);
        Book book6 = allModulesList.books.get(5);
        Book book7 = allModulesList.books.get(6);
        Book book8 = allModulesList.books.get(7);
        Book book9 = allModulesList.books.get(8);
        Book book10 = allModulesList.books.get(9);

        rentalStore.addItem(book1);
        rentalStore.addItem(movie1);
        rentalStore.addItem(game1);
        rentalStore.register(Joshn);
        rentalStore.register(Emily);
        rentalStore.register(Brown);
        rentalStore.rentItem(book1 , Joshn);
        rentalStore.rentItem(movie1 , Brown);
        rentalStore.rentItem(game1 , Emily);
        rentalStore.returnItem(book1 , Joshn);

        reader.close(); // close the input file

        // Convert the data to a JSON string
        Gson writing = new Gson();
        String json = gson.toJson(allModulesList);
        String filePath = "C:\\Users\\LENOVO\\OneDrive\\Desktop\\RentalProjectSecondPart\\RentalSystem\\RentalProject\\src\\test\\TestYourFork.json";
        try {
            FileWriter writer = new FileWriter(filePath);// Write the JSON string to the file
            writer.write(json);
            writer.close();
            System.out.println("JSON data has been updated.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}