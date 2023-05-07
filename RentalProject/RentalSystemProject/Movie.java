import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Movie extends Item{
    private String director;
    private ArrayList<String> cast;
    private boolean isAvailable;

    public Movie(String title, String genre, String director, ArrayList<String> cast, Date releaseDate, int ID) {
        this.title = title;
        this.genre = genre;
        this.director = director;
        this.cast = cast;
        this.releaseDate = releaseDate;
        this.id = ID;
        isAvailable = true;
    }

    public String getTitle() {
        return title;
    }

    public String getGenre() {
        return genre;
    }

    public String getDirector() {
        return director;
    }

    public ArrayList<String> getCast() {
        return cast;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public int getID() {
        return id;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public boolean isAvailable() {
        return isAvailable;
    }
}
