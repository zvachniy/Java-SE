package labs.DragonWorld;

public class ShadowWhisper extends Dragon implements MindControlable {
    public ShadowWhisper(String name, int tooth) {
        super(name, tooth);
    }

    @Override
    public void MindControl() {
        System.out.println("Я в твоей голове");
    }

    public static void main(String[] args) {
        ShadowWhisper dragon4=new ShadowWhisper("Думатель",20);
        dragon4.MindControl();
    }
}
