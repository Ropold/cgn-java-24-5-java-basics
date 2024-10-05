package Farm;

public class Cat extends Animal{
    private String breed;
    private boolean isIndoor;

    // Konstruktor für die Cat-Klasse

    public Cat(String name, int age, double weight, String color, String breed, boolean isIndoor) {
        super(name, age, weight, color);
        this.breed = breed;
        this.isIndoor = isIndoor;
    }

    @Override
    public void makeSound() {
        System.out.println(name + " says: Meow!");
    }

    public void purr() {
        System.out.println(name + " is purring.");
    }

    public void scratch() {
        System.out.println(name + " is scratching.");
    }

    public void chaseMouse() {
        System.out.println(name + " is chasing a mouse.");
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public boolean isIndoor() {
        return isIndoor;
    }

    public void setIndoor(boolean indoor) {
        isIndoor = indoor;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", breed='" + breed + '\'' +
                ", color='" + color + '\'' +
                ", isIndoor=" + isIndoor +
                ", weight=" + weight +
                '}';
    }
}
