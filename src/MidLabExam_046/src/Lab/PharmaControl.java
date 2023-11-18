package Lab;

public class PharmaControl {
    Pharmaceutical[] med = new Pharmaceutical[10];
    InventoryClerk[] invent = new InventoryClerk[10];
    public void addToInventory(Pharmaceutical pharma) {
        for (int i=0;i< med.length;i++) {
            if(med[i] == null) {
                med[i] = pharma;
                med[i].setInStock(StockStatus.IN_STOCK);
                System.out.println("Medicine added to Inventory");
                break;
            }
        }
    }


    public void searchInInventory(String name) {
        for (int i=0; i< med.length; i++) {
            if (med[i] != null) {
                if(med[i].getMedName() == name) {
                    System.out.println("Search Results for " +med[i].getMedName());
                    med[i].displaySpecs();
                    break;
                }
                else {
                    System.out.println("Medicine not found in Inventory");
                    break;
                }

            }
        }
    }

    public void removeFromInventory(String name) {
        for (int i=0; i< med.length; i++) {
            if (med[i] != null && med[i].getMedName() == name) {
                med[i] = null;
                med[i].setInStock(StockStatus.OUT_OF_STOCK);
                System.out.println("Medicine removed from Inventory");
            }
        }
    }

    public void issueMedicine() {

    }

    public void generateReport() {
        System.out.println("\nMedicine details are as follow\n");
        for (int i=0; i< med.length; i++) {
            if(med[i] != null) {
                med[i].displaySpecs();
            }
            System.out.println();
        }
    }
    public void restockMedicine(String name) {
        for(int i=0;i< med.length;i++) {
            if(med[i] != null) {
                if(med[i].getMedName() != name) {
                    System.out.println("Restock the medicine");
                    break;
                }
            }
        }
    }
}
