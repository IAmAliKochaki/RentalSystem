package org.example;

import java.util.ArrayList;

public class AllModules {
    public ArrayList<Game> games;
    public ArrayList<Book> books;
    public ArrayList<Movie> movies;
    public ArrayList<Customer> customers;

    public void setGames(ArrayList<Game> games) {
        this.games = games;
    }

    public void setBooks(ArrayList<Book> books) {
        this.books = books;
    }

    public void setMovies(ArrayList<Movie> movies) {
        this.movies = movies;
    }

    public void setCustomers(ArrayList<Customer> customers) {
        this.customers = customers;
    }

    public ArrayList<Game> getGames() {
        return games;
    }

    public ArrayList<Book> getBooks() {
        return books;
    }

    public ArrayList<Movie> getMovies() {
        return movies;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }
}
