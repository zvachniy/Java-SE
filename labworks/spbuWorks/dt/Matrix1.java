package spbuWorks.dt;

import java.util.Random;

public class Matrix1 {
    final static int SIZE = 50;

    public static void main(String[] args) {
        int m[][] = new int[SIZE][SIZE];
        int n[][] = new int[SIZE][SIZE];
        int sum[][] = new int[SIZE][SIZE];

        printMatrix(m);
        System.out.println();
        printMatrix(n);

        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                sum[i][j] = m[i][j] + n[i][j];
            }
        }

        System.out.println("+++++++++++++++++++++++");
        printMatrix(sum);

    }

    private static void printMatrix(int[][] m) {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                Random random = new Random();
                m[i][j] = random.nextInt(20);
                System.out.print(m[i][j] + " ");
            }
            System.out.println();
        }
    }
}
