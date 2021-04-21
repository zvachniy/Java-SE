package labs.DragonWorld;

public class SilverWings extends Dragon implements Flyable {

    public SilverWings(String name, int tooth) {
        super(name, tooth);
    }


    @Override
    public void Fly() {
        System.out.println("Взмахни крыльями цвета Луносвета");
    }

    public static void main(String[] args) {
        SilverWings dragon3 = new SilverWings("Среброкрыл", 150);
        dragon3.Fly();
    }
}
