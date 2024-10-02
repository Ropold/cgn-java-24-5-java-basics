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

    }

    public void speedAccelerates(){
        System.out.println("Speed now 100 km/h");
        this.speed = 100;
    }
    public void startEngine() {
        System.out.println("Start engine");
        this.engine = true;
    }
}
