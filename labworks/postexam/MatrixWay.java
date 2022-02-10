package postexam;

import java.util.Random;
import java.util.Scanner;

public class MatrixWay {
    public static void main(String[] args) {

        int intScanInputVar, SquariingMatrixVar;
        int i, j;
        int MatrixSum = 0;

        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число строк матрицы: ");
        intScanInputVar = scan.nextInt();
        SquariingMatrixVar = intScanInputVar;

        Random r = new Random();

        int[][] matrix = new int[intScanInputVar][SquariingMatrixVar];
        for (i = 0; i < intScanInputVar; i++) {
            for (j = 0; j < SquariingMatrixVar; j++)
                matrix[i][j] = r.nextInt(100);

        }

        for (i = 0; i < intScanInputVar; i++) {
            for (j = 0; j < SquariingMatrixVar; j++)
                System.out.printf("%4d", matrix[i][j]);
            System.out.println();
        }

        for (i = 0, j = 0; i < intScanInputVar; i++) {
            MatrixSum += matrix[i][j];
            j++;
        }
        System.out.println();
        System.out.println("След матрицы: " + MatrixSum);
    }
}
