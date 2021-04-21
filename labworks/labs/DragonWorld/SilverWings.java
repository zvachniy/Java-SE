package labs.DragonWorld;

public class SilverWings extends Dragon implements Flyable {

    public SilverWings(String name, int tooth) {
        super(name, tooth);
    }

    @Override
    public void ulta() {
        Fly();
        System.out.println("Это ульт того самого дракона "+name+" , представителя Среброкрылых драконов");
        System.out.println();
    }

    @Override
    public void Fly() {
        System.out.println("Взмахни крыльями цвета Луносвета");
    }
}
