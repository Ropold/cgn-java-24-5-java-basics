package Farm;

public class Animal {
    protected String name;
    protected int age;
    protected double weight;
    protected String color;

    //constructor:

    public Animal(String name, int age, double weight, String color) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.color = color;
    }

    public void makeSound() {
        System.out.println(name + " makes a sound.");
    }

    public void eat() {
        System.out.println(name + " is eating.");
    }

}
