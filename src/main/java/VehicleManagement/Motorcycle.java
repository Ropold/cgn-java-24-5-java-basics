package VehicleManagement;

public class Motorcycle extends Vehicle{
 private String motorcycle;

    public Motorcycle(String manufacturer, String model, int yearOfManufacture, String motorcycle) {
        super(manufacturer, model, yearOfManufacture);
        this.motorcycle = motorcycle;
    }

    public String getMotorcycle() {
        return motorcycle;
    }

    public void setMotorcycle(String motorcycle) {
        this.motorcycle = motorcycle;
    }

    @Override
    public String toString() {
        return super.toString()+
                " motorcycle='" + motorcycle + '\'' +
                '}';
    }
}
