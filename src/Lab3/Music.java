package Lab3;

import java.util.Dictionary;

public class Music {
    private String title;
    private Artist artist;
    private String duration;
    private String genre;
    private String albumName;
    private Date releaseDate;

    public Music(String title, Artist artist, String duration, String genre, String albumName, Date releaseDate) {
        this.title = title;
        this.artist = artist;
        this.duration = duration;
        this.genre = genre;
        this.albumName = albumName;
        this.releaseDate = releaseDate;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Artist getArtist() {
        return artist;
    }

    public void setArtist(Artist artist) {
        this.artist = artist;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getAlbumName() {
        return albumName;
    }

    public void setAlbumName(String albumName) {
        this.albumName = albumName;
    }

    public String toString() {
        String details = String.format("%-12s%-35s%-20s%-15s%-25s%-20s" , title,artist,duration,genre,albumName,releaseDate);
        return details;
    }

//    public String equal() {
//
//    }
}
