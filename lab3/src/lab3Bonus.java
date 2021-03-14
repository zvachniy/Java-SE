import java.util.Scanner;

public class lab3Bonus {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);    //инициализируется для приблыды ввода консоли
        System.out.print("Введите верхний предел для проверки на палиндромы: ");
        int Max = in.nextInt();   //предел счета для цикла
        int Counter=0;

        for (int num=10000; num<=Max; num++) {
            int num1 = num / 1000;
            int num2 = num % 100;
            boolean c1 = false;
            boolean c2 = false;
            if (num1 / 10 == num2 % 10) {
                //System.out.print("первое и последнее совпадает ---");
                c1 = true;
            }
            //System.out.println("Сравниваем первое и последнее цифры " + num1 / 10 + " " + num2 % 10);
            if (num1 % 10 == num2 / 10) {
                //System.out.print("второе и предпоследнее совпадает ---");
                c2 = true;
            }
            //System.out.println("Сравниваем второе и предпоследнее цифры " + num1 % 10 + " " + num2 / 10);
            //System.out.println(num1 + " " + num2);
            if (c1 && c2) {Counter++;}
            //else System.out.println("AIN`T PALINDROME");
        }
        System.out.println("Количество палиндромов от 10000 до "+Max+" = "+Counter);
    }
}
