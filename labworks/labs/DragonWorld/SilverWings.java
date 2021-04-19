package labs.DragonWorld;

public abstract class SilverWings implements Flyable {

    public void SilverWings() {
    }

    public void fly() {
        System.out.println("   Взмахни крыльями серебряными");
    }

    public static void main(String[] args) {
        SilverWings dragon3 = new SilverWings() {

            @Override
            public void Fly() {

            }
        };
        dragon3.fly();
    }

}
