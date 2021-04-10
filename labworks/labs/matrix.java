package labs;

import java.util.Random;
import java.util.Scanner;

public class matrix {
    public static void main(String[] args) {
        Scanner scannerJ = new Scanner(System.in);
        Scanner scannerK = new Scanner(System.in);
        System.out.println("Введи строки и столбцы");
        System.out.println("Количество строк");
        int j = scannerJ.nextInt();
        System.out.println("Количество столбцов");
        int k = scannerK.nextInt();

        int[][] array = new int[j][k];
        for (int i = 0; i < j; i++) {
            for (int n = 0; n < k; n++) {
                Random r2 = new Random();
                array[j][k] = r2.nextInt(100);
            }

        }

    }
}
