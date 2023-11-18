package Lab;

public class Antibiotic extends Pharmaceutical implements Classifiable{

    private String spectrum;
    public Antibiotic(String medName, String manufacturer, String expiryDate, String spectrum) {
        super(medName, manufacturer, expiryDate);
        this.spectrum =spectrum;
    }

    public void displaySpecs() {
        System.out.println("Medicine Name:  "+ getMedName() + "\nManufacturer:  " +getManufacturer());
        System.out.println("Expiry Date:  " +getExpiryDate() + "\nSpectrum:  "+spectrum);
    }
}
