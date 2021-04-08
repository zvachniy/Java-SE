package spbuWorks.zoo;

public class Animal {
    private String name;

    public String getName() {
        return name;
    }

    public Animal(String pName){
        this.name=pName;
    }

    public void move(){
        System.out.println("Moving on ..."+name);
    }
}
