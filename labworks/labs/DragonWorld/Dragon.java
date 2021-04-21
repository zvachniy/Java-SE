package labs.DragonWorld;

public class Dragon {

    public final String name;
    public final int tooth;


    public int getTooth() {
        return tooth;
    }

    public String getName() {
        return name;
    }

    public Dragon(String name, int tooth) {
        this.name = name;
        this.tooth = tooth;
    }

    public static void fire(Dragon firstDragon, Dragon secondDragon ) {
        System.out.println("Дракон по имени " + firstDragon.getName() + " ударил дракона по имени " + secondDragon.getName() );
        System.out.println("Нанесено " + firstDragon.getTooth()+ " урона");
    }

    public static void main(String[] args) {
        ///просто огонь

        Dragon dragon1 = new Dragon("Анкалагон Пожиратель Гор", 100);
        Dragon dragon2 = new Dragon("Смауг Хитроумный", 50);
        fire(dragon1,dragon2);

        //вызов наследников с их интерфейсами
        SilverWings dragon3 = new SilverWings("Среброкрыл", 150);
        dragon3.Fly();
        ShadowWhisper dragon4 = new ShadowWhisper("Думатель", 20);
        dragon4.MindControl();
        TimeKeeper dragon5=new TimeKeeper("Хроми",75);
        dragon5.Fly();
        dragon5.MindControl();

    }

}
