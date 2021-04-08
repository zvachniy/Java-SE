package spbu.works.cpsmi;

public class Hello1 {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            int d=i%7;
            switch (d) {
                case 0 -> System.out.println("Понедельник " + i);
                case 1 -> System.out.println("Вторник " + i);
                case 2 -> System.out.println("Среда " + i);
                case 3 -> System.out.println("Четверг " + i);
                case 4 -> System.out.println("Пятница " + i);
                case 5 -> System.out.println("Суббота " + i);
                case 6 -> System.out.println("Воскресенье " + i);
            }
        }
    }
}
