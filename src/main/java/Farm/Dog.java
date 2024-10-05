package Farm;

public class Dog extends Animal{
    private String breed;
    private boolean isTrained;

    public Dog(String name, int age, double weight, String color, String breed, boolean isTrained) {
        super(name, age, weight, color);
        this.breed = breed;
        this.isTrained = isTrained;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public boolean isTrained() {
        return isTrained;
    }

    public void setTrained(boolean trained) {
        isTrained = trained;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", breed='" + breed + '\'' +
                ", color='" + color + '\'' +
                ", isTrained=" + isTrained +
                ", weight=" + weight +
                '}';
    }
}
