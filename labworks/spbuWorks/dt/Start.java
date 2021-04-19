package spbuWorks.dt;
public class Start {
    public static void main(String[] args) {
        Hero drakula= new Hero("Дракула");
        Hero vanHelsing=new Hero ("Ван Хельсинг");

        //назначение друг друга врагами
        drakula.assignEnemy(vanHelsing);
        vanHelsing.assignEnemy(drakula);

        drakula.setPriority(10);
        vanHelsing.setPriority(1);

        //запуск потоков
        drakula.start();
        vanHelsing.start();
    }
}
