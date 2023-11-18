package TaxiBooking;

public class Taxi {
    private int id;
    private Location location;
    private boolean availability;
    private Location des;

    public Taxi(int id, Location location, boolean availability, Location des) {
        this.id = id;
        this.location = location;
        this.availability = availability;
        this.des = des;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public boolean isAvailability() {
        return availability;
    }

    public void setAvailability(boolean availability) {
        this.availability = availability;
    }

    public Location getDes() {
        return des;
    }

    public void setDes(Location des) {
        this.des = des;
    }

    @Override
    public String toString() {
        return "Taxi{" +
                "id=" + id +
                ", location=" + location +
                ", availability=" + availability +
                ", des=" + des +
                '}';
    }
}
