package PetCenter;

public class User {
    private int id;
    private String name;
    private int contactNo;
    private String donations;
    static int counter = 0;

    public User(String name, int contactNo, String donations) {
        this.id = ++counter;
        this.name = name;
        this.contactNo = contactNo;
        this.donations = donations;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getContactNo() {
        return contactNo;
    }

    public void setContactNo(int contactNo) {
        this.contactNo = contactNo;
    }

    public String getDonations() {
        return donations;
    }

    public void setDonations(String donations) {
        this.donations = donations;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", contactNo=" + contactNo +
                '}';
    }
}
