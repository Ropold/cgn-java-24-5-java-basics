package Car;

public class CarOop {
    public boolean startEngine;
    String brand;
    String model;
    String color;
    boolean engine;
    int year;
    int speed;

    public CarOop(){

    }

    public CarOop(String brand, String model, String color, boolean engine, int year, int speed) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.engine = engine;
        this.year = year;
        this.speed = speed;

    }

    public void speedAccelerates(){
        System.out.println("Speed now 100 km/h");
        speed = 100;
    }
    public void startEngine() {
        System.out.println("Start engine");
        engine = true;
    }

    @Override
    public String toString() {
        return "CarOop{" +
                "startEngine=" + startEngine +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", engine=" + engine +
                ", year=" + year +
                ", speed=" + speed +
                '}';
    }
}
