package spbu.works.zoo;

public class Owl extends Animal {
    public Owl(String name) {
        super(name);
    }

    public void nightSight(){
        System.out.println("I see a gray mice!!!");
    }

    @Override
    public void move() {
        System.out.println("Flying on to ..."+getName());
    }
}
