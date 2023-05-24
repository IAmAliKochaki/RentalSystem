package org.example;
import java.util.Date;

public class Book extends Item {
    private String author;
    private int pages;

    public Book(String title, String genre, Date releaseDate, String author, int pages, int ID) {
        this.title = title;
        this.genre = genre;
        this.releaseDate = releaseDate;
        this.author = author;
        this.pages = pages;
        this.ID = ID;
        isAvailable = true;
    }

    public String getAuthor() {
        return author;
    }

    public int getPages() {
        return pages;
    }
}