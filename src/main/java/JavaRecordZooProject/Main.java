package JavaRecordZooProject;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Owner owner1 = new Owner("John",25,"Cologne");
        Owner owner2 = new Owner("Bob",28,"Berlin");

        Species cat = new Species("cat",200);
        Species mouse = new Species("mouse",50);

        Animal cat1 = new Animal(1,"Whiskas","Cat",2);
        Animal cat2 = new Animal(2,"Tom","Cat", 3);
        Animal mouse1 = new Animal(3,"Jerry","Mouse",3);

        Animal cat1update = new Animal(cat1.id(), cat1.name(), cat1.species(), cat1.age(), owner1, cat);
        Animal cat2update = new Animal(cat2.id(), cat2.name(), cat2.species(), cat2.age(), owner2, cat);
        Animal mouse1update = new Animal(mouse1.id(), mouse1.name(), mouse1.species(), mouse1.age(),owner2,mouse);

        Zoo zoo1 = new Zoo(List.of(cat1update, cat2update, mouse1update));

        System.out.println(cat1);
        System.out.println(cat1update);
        System.out.println(zoo1.calculateTotalFoodRequirement());

    }
}
