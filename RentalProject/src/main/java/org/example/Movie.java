package org.example;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Movie extends Item{
    private String director;
    private List<String> cast;

    public Movie(String title, String genre, String director, List<String> cast, Date releaseDate, int ID) {
        this.title = title;
        this.genre = genre;
        this.director = director;
        this.cast = cast;
        this.releaseDate = releaseDate;
        this.ID = ID;
        isAvailable = true;
    }

    public String getDirector() {
        return director;
    }

    public List<String> getCast() {
        return cast;
    }
}
