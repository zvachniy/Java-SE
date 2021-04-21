package labs.DragonWorld;

public class TimeKeeper extends Dragon implements Flyable, MindControlable {
    public TimeKeeper(String name, int tooth) {
        super(name, tooth);
    }

    @Override
    public void Fly() {
        System.out.println("Хранитель времени летит, мало кто знает, но Бронзовые драконы Warcraft III умели и летать тоже");
    }

    @Override
    public void MindControl() {
        System.out.println("Так же, Бронзовые драконы Warcraft III имели заклинание на контроль разума, поэтому ты слышишь этот голос в своей голове, смертный");
    }
}
