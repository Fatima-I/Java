package Lab2;
public class Product {
    private int id;
    private String name;
    private double price;
    private int quantity;
    private Date dateManufacturing;
    private static int counter = 0;
    Product(String name , double price , int quantity , Date dateManufacturing)
    {
        this.id = ++counter;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.dateManufacturing = dateManufacturing;
    }

    public int getId()
    {
        return id;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return name;
    }

    public void setPrice(double price)
    {
        this.price = price;
    }

    public double getPrice()
    {
        return price;
    }

    public void setQuantity(int quantity)
    {
        this.quantity = quantity;
    }

    public int getQuantity()
    {
        return quantity;
    }

    public void setDate(Date dateManufacturing)
    {
        this.dateManufacturing = dateManufacturing;
    }

    public Date getDate()
    {
        return dateManufacturing;
    }

    public String toString()
    {
        String productDetails = String.format("%d\t%s\t%f\t%d\t%s",id,name,price,quantity,dateManufacturing);
        return productDetails;
        // or you can write return productDetails = String.format("%d\t%s\t%f\t%d",id,name,price,quantity);
    }


//    public Product isLatest(Product p1 , Product p2) {
//        Date temp = dateManufacturing.recentDate(p1.dateManufacturing , p2.dateManufacturing);
//        return temp == p1.dateManufacturing?p1:p2;
//    }
}
