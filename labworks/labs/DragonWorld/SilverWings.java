package labs.DragonWorld;

public abstract class SilverWings extends Dragon implements Flyable {

    public SilverWings(String name, int tooth) {
        super(name, tooth);
    }

    public void SilverWings() {
    }

    public void fly() {
        System.out.println("   Взмахни крыльями серебряными");
    }

    public static void main(String[] args) {
        SilverWings dragon3 = new SilverWings("Среброкрыл", 150) {

            @Override
            public void Fly() {

            }
        };
        dragon3.fly();
    }

}
