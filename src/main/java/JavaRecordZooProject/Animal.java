package JavaRecordZooProject;

public record Animal(
        int id,
        String name,
        String species,
        int age,
        Owner owner,
        Species animalSpecies


) {
    public Animal(int id, String name, String species, int age) {
        this(id, name, species, age, null, null);
    }
}


