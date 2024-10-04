package VehicleManagement;

public class Main {
    public static void main(String[] args) {

        Vehicle toyota1 = new Vehicle("Toyota", "Camry", 2020);
        System.out.println(toyota1);

        Car honda1 = new Car("Honda", "Civic", toyota1.getYearOfManufacture(), 4);
        System.out.println(honda1);

        Motorcycle chopper1 = new Motorcycle("Kawasaki","Hotweels",2023,"Chopper");
        System.out.println(chopper1);
    }
}
