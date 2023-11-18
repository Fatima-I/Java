package Lab3;

public class Artist {
    private String name;
    private String nationality;
    private double rating;

    public Artist(String name, String nationality, double rating) {
        this.name = name;
        this.nationality = nationality;
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public String toString() {
        String details = String.format("%-15s%-17s%-10f" ,name,nationality,rating);
        return details;
    }
}
