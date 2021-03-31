import java.util.Scanner;   //приблуда для ввода в консоль

public class lab3 {
    public static void main(String[] args) {
        //string WeekDay = new WeekDay(System.in);
        Scanner in = new Scanner(System.in);    //инициализируется для приблыды ввода консоли
        String[] arrayDays = {"Понедельник", "Вторник", "Среда", "Четверг", "Пятница", "Суббота", "Воскресенье"}; //создаём и объявляем массив дней недели
        System.out.println("Понедельник - 1, Вторник - 2 и т.д.");
        System.out.print("Введите номер дня: ");
        int num = in.nextInt();
        //не забывай про break
        switch (num) {
            default -> System.out.println("Error");
            case 1 -> System.out.println(arrayDays[0]);
            case 2 -> System.out.println(arrayDays[1]);
            case 3 -> System.out.println(arrayDays[2]);
            case 4 -> System.out.println(arrayDays[3]);
            case 5 -> System.out.println(arrayDays[4]);
            case 6 -> System.out.println(arrayDays[5]);
            case 7 -> System.out.println(arrayDays[6]);
        }
    }
}
