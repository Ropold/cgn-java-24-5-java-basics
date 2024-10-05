package Farm;

public class Main {
    public static void main(String[] args) {
        Cat Pinda = new Cat("Pinda",5,3.1, "white", "Persian",true);
        Dog Ngus = new Dog("Ngus",3,3.2,"brown","various",false);

        System.out.println(Pinda);
        Pinda.eat();
        Pinda.makeSound();

        System.out.println(Ngus);
        Ngus.eat();
        Ngus.makeSound();
    }
}
