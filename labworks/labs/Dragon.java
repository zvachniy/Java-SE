package labs;

public class Dragon {

    private final String name;
    private final int tooth;
    static Dragon dragon1 = new Dragon("Анкалагон Пожиратель Гор", 100);
    static Dragon dragon2 = new Dragon("Смауг Хитроумный", 50);

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

    public static void fire() {
        System.out.println("Дракон по имени " + dragon1.name + " ударил дракона по имени " + dragon2.name);
        System.out.println("Нанесено " + dragon1.tooth + " урона");
    }

    public static void main(String[] args) {
        fire();
    }
}
