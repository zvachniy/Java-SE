package spbuWorks.cpsmi;

public class Coal extends Mineral {
    private static int worldCapacity=400;
      //мировые запасы
    public Coal(String name, int complexity) {
        this.name=name;

        this.miningComplexity=complexity;
    }
    public void burn(){
        System.out.println("Coal is burning");
    }
    @Override   //аннтотация
    void mine(){

            worldCapacity-=1;
            System.out.println("mining "+name+" remaining minerals = "+worldCapacity);

    }
}
