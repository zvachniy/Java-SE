package labs;

import java.util.List;
import java.util.Scanner;

public class lab15 {
    public static void main(String[] args) {
        int numberofFact = 0;
        int number = 1;
        System.out.print("Введи факториал ");
        Scanner scanner = new Scanner(System.in);
        try {
            numberofFact = scanner.nextInt();
        }
        catch (Exception e) {
            System.out.println("Не число");
            return ;
        }
        for (int i = 1; i <= numberofFact; i++) {
            number = i * number;
            //System.out.println(Number);
        }
        System.out.println("Результат="+number);

    }
}
