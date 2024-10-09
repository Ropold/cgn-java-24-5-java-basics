package Pharmacy;

import java.util.HashMap;
import java.util.Map;

public class Pharmacy {
    private final Map<String, Medication> medicines;

    public Pharmacy() {
        medicines = new HashMap<>();
    }

    public Map<String, Medication> getMedicines() {
        return medicines;
    }

    public int getCount() {
        return medicines.size();
    }

    public void saveMedicine(Medication medicine) {
        medicines.put(medicine.getName(), medicine);
    }

    public Medication find(String medicineName) {
        return medicines.get(medicineName);
    }

    public void delete(String medicineName) {
        medicines.remove(medicineName);
    }

    public void printAll() {
        for (Medication medicine : medicines.values()) {
            System.out.println(medicine);
        }
    }
}
