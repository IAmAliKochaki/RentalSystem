package org.example;
import java.util.Date;

public class Item {
    protected String title;
    protected String genre;
    protected Date releaseDate;
    protected int ID;
    protected boolean isAvailable;

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public int getID() {
        return ID;
    }

    public String getTitle() {
        return title;
    }

    public String getGenre() {
        return genre;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }
}