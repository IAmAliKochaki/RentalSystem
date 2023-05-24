package org.example;
import java.util.ArrayList;
import java.util.Date;

public class Game extends Item {
    private String platform;

    public Game(String title, String genre, Date releaseDate, String platform, int ID) {
        this.title = title;
        this.genre = genre;
        this.releaseDate = releaseDate;
        this.ID = ID;
        isAvailable = true;
    }

    public String getPlatform() {
        return platform;
    }
}

