import java.util.Scanner;
public class lab2{
    public static void main(String[] args) {
        //string WeekDay = new WeekDay(System.in);
        Scanner in = new Scanner(System.in);
        System.out.print("Введите номер дня: ");
        int num=in.nextInt();

        switch (num){
            case 1:
                System.out.println("Понедельник");
            case 2:
                System.out.println("Вторник");

        }
    }
}
