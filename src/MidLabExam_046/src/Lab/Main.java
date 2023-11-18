package Lab;

public class Main {
    public static void main(String[] args) {
        PharmaControl pharmaControl = new PharmaControl();

        Antibiotic amoxicillin = new Antibiotic("Amoxicillin","ABC Pharma","2024-12-01","Broad");
        Analgesic ibuprofen =new Analgesic("Ibuprofen","XYZ Pharma","2024-05-15","Acute");
        Antibiotic ciprofloxacin = new Antibiotic("Ciprofloxacin","123 Pharma","2023-06-15","Broad");
        Analgesic paracetamol = new Analgesic("Paracetamol","456 Pharma","2025-05-15","General");
        Antibiotic erythromycin = new Antibiotic("Erythromycin","789 Pharma","2022-11-20","Narrow");

        pharmaControl.addToInventory(amoxicillin);
        pharmaControl.addToInventory(ibuprofen);
        pharmaControl.addToInventory(ciprofloxacin);
        pharmaControl.addToInventory(paracetamol);
        pharmaControl.addToInventory(erythromycin);

        //pharmaControl.generateReport();

        System.out.println();
        pharmaControl.searchInInventory("Amoxicillin");

        System.out.println();
        pharmaControl.removeFromInventory("Ibuprofen");

        System.out.println();
        System.out.println("Search results for Ibuprofen");
        pharmaControl.searchInInventory("Ibuprofen");

        //pharmaControl.generateReport();

        //System.out.println();
        //pharmaControl.restockMedicine("a");
    }
}
