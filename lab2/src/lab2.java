import java.util.Scanner;   //приблуда для ввода в консоль

public class lab2 {
    public static void main(String[] args) {
        //string WeekDay = new WeekDay(System.in);
        Scanner in = new Scanner(System.in);    //инициализируется для приблыды ввода консоли
        String[] arrayDays = {"Понедельник", "Вторник", "Среда", "Четверг", "Пятница", "Суббота", "Воскресенье"}; //создаём и объявляем массив дней недели
        System.out.println("Понедельник - 1, Вторник - 2 и т.д.");
        System.out.print("Введите номер дня: ");
        int num = in.nextInt();
        switch (num) {   //не забывай про break
            default:
                System.out.println("Error");
                break;
            case 1:
                System.out.println(arrayDays[0]);
                break;
            case 2:
                System.out.println(arrayDays[1]);
                break;
            case 3:
                System.out.println(arrayDays[2]);
                break;
            case 4:
                System.out.println(arrayDays[3]);
                break;
            case 5:
                System.out.println(arrayDays[4]);
                break;
            case 6:
                System.out.println(arrayDays[5]);
                break;
            case 7:
                System.out.println(arrayDays[6]);
                break;
        }
    }
}
