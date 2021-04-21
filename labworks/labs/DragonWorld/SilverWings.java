package labs.DragonWorld;

public class SilverWings extends Dragon implements Flyable {

    public SilverWings(String name, int tooth) {
        super(name, tooth);
    }

    @Override
    public void Fly() {
        System.out.println("Взмахни крыльями цвета Луносвета");
    }
}
