package Car;

public class Main {
    public static void main(String[] args) {
        CarOop MaleksAudi = new CarOop( "Audi", "A4","blue",false,2000,0);
        System.out.println(MaleksAudi);

        CarOop RobertsMercedes = new CarOop();

        System.out.println("Auto am Anfang: " + MaleksAudi.engine);
        MaleksAudi.startEngine();
        System.out.println("Auto läuft: " + MaleksAudi.engine);
        MaleksAudi.speedAccelerates();

    }
}
