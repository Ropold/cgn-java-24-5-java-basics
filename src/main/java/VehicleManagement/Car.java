package VehicleManagement;

import java.util.Objects;

public class Car extends Vehicle{
    private int numberOfDoors;

    public Car(String manufacturer, String model, int yearOfManufacture, int numberOfDoors) {
        super(manufacturer, model, yearOfManufacture);
        this.numberOfDoors = numberOfDoors;
    }


    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

//    @Override
//    public String toString() {
//        return "Car{" +
//                "manufacturer='" + manufacturer + '\'' +
//                ", model='" + model + '\'' +
//                ", yearOfManufacture=" + yearOfManufacture +
//                ", numberOfDoors=" + numberOfDoors +
//                '}';
//    }

    @Override
    public String toString() {
        return super.toString()+" Car{" +
                "doorsNumber=" + numberOfDoors +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Car car = (Car) o;
        return numberOfDoors == car.numberOfDoors;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), numberOfDoors);
    }
}
