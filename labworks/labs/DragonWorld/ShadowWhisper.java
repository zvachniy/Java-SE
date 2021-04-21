package labs.DragonWorld;

public class ShadowWhisper extends Dragon implements MindControlable {
    public ShadowWhisper(String name, int tooth) {
        super(name, tooth);
    }

    @Override
    public void ulta() {
        MindControl();
        System.out.println("Это ульта Шептуна Тени по имени "+name);
        System.out.println();
    }

    @Override
    public void MindControl() {
        System.out.println("Я в твоей голове");
    }
}
