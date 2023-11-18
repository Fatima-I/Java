package CaseStudy;

public class ProductItem {
    private String name;
    private double price;
    private int quantity;
    private double taxation;
    private int id;
    private static int counter = 0;
    private Elements type;

    public ProductItem(String name, double price, int quantity, double taxation, Elements type) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.taxation = taxation;
        this.id = counter++;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getTaxation() {
        return taxation;
    }

    public void setTaxation(double taxation) {
        this.taxation = taxation;
    }

    public int getId() {
        return id;
    }

    public Elements getType() {
        return type;
    }

    public void setType(Elements type) {
        this.type = type;
    }

    public String toString() {
        String details = String.format("%d\t%s\t%f\t%d\t%f",id,name,price,quantity,taxation);
        return details;
    }
}
