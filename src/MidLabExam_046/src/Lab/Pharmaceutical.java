package Lab;

import java.util.Objects;

public abstract class Pharmaceutical {
    private String medName;
    private String manufacturer;
    private StockStatus inStock;
    private String expiryDate;

    public Pharmaceutical(String medName, String manufacturer, String expiryDate) {
        this.medName = medName;
        this.manufacturer = manufacturer;
        this.expiryDate = expiryDate;
    }
    Pharmaceutical() {

    }

    public String getMedName() {
        return medName;
    }

    public void setMedName(String medName) {
        this.medName = medName;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public StockStatus getInStock() {
        return inStock;
    }

    public void setInStock(StockStatus inStock) {
        this.inStock = inStock;
    }

    public String getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
    }

    public abstract void displaySpecs();

    public boolean isEquivalent(String manu, String date) {
        if (this.manufacturer == manu && this.expiryDate == date) {
            return true;
        }
        else
            return false;
    }
}
