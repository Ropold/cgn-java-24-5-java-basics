package Pharmacy;

public class Main {
    public static void main(String[] args) {
        Pharmacy pharmacy = new Pharmacy();
        pharmacy.saveMedicine(new Medication("Paracetamol", 100, true));
        pharmacy.saveMedicine(new Medication("Aspirin", 50, true));
        pharmacy.saveMedicine(new Medication("Ibuprofen", 100, true));
        pharmacy.saveMedicine(new Medication("Acetaminophen", 100, true));
        pharmacy.saveMedicine(new Medication("Diazepam", 100, true));
        pharmacy.saveMedicine(new Medication("Metoprolol", 100, true));
        pharmacy.saveMedicine(new Medication("Hydrocodone", 100, true));
        pharmacy.saveMedicine(new Medication("Oxycodone", 100, true));
        pharmacy.saveMedicine(new Medication("Fentanyl", 100, true));
        pharmacy.saveMedicine(new Medication("Benzodiazepine", 100, true));
        pharmacy.saveMedicine(new Medication("Codeine", 100, true));
        pharmacy.saveMedicine(new Medication("Amphetamine", 100, true));
        pharmacy.printAll();
        System.out.println("Count: " + pharmacy.getCount());

        pharmacy.delete("Paracetamol");
        pharmacy.delete("Aspirin");
        pharmacy.delete("Ibuprofen");
        pharmacy.printAll();
        System.out.println("Count: " + pharmacy.getCount());

        Medication paracetamol = pharmacy.find("Paracetamol");
        if (paracetamol != null) {
            System.out.println(paracetamol);
        } else {
            System.out.println("Paracetamol not found");
        }
    }
}
