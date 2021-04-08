package spbuWorks.zoo;

public class Zoo {
    public static void main(String[] args) {
        Animal dambo= new Elephant("Dambo");
        Animal pepe= new Elephant("pepe");
        Animal hedwig=new Owl("Hedwig");
        Animal jerry=new Mice("Jerry");
        Animal[] allAnimals = new Animal[] {dambo,hedwig,jerry};

        for (Animal animal: allAnimals){
            animal.move();
        }
    }
}
