package Lab;

public class Analgesic extends Pharmaceutical implements Classifiable{
    private String painType;
    public Analgesic(String medName, String manufacturer, String expiryDate, String painType) {
        super(medName, manufacturer, expiryDate);
        this.painType =painType;
    }

    public void displaySpecs() {
        System.out.println("Medicine Name:  "+ getMedName() + "\nManufacturer:  " +getManufacturer());
        System.out.println("Expiry Date:  " +getExpiryDate() + "\nPain type:  "+painType);
    }
}
