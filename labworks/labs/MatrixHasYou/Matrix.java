package labs.MatrixHasYou;

import java.util.Random;

public class Matrix {
    private int rowNumber;
    private int colNumber;
    private int [][] matrix;

    public Matrix(int rowNumber, int colNumber){

        this.rowNumber = rowNumber;
        this.colNumber = colNumber;
        Random r = new Random();
        System.out.println("\nИнициализируем матрицу с числом строк - "
                + this.rowNumber + ", числом столбцов - " + this.colNumber + " и заполняем случайными значениями..");
        int [][] matrix = new int[this.rowNumber][this.colNumber];
        for (int i = 0; i < this.rowNumber; i++) {
            for (int j = 0; j < this.colNumber; j++)
                matrix[i][j] = r.nextInt(10); //заполнение массива случайными числами от 0 до 10
        }
        this.matrix = matrix;
        printMatrix();
    }

//    private int [][] matrix = new int[rowNumber][colNumber];

    public void resetRandomMatrix() {
        System.out.println("\nЗаполняем матрицу случайными значениями..");
        Random r = new Random();
        int [][] matrix = new int[rowNumber][colNumber];
        for (int i = 0; i < rowNumber; i++) {
            for (int j = 0; j < colNumber; j++)
                matrix[i][j] = r.nextInt(10); //заполнение массива случайными числами от 0 до 10
        }
        this.matrix = matrix;
        printMatrix();
    }

    public void resetMatrix(int[][] array) {
        System.out.println("\nЗаполняем матрицу передаваемыми значениями..");
        if (array.length == rowNumber && array[0].length == colNumber) {
            for (int i = 0; i < rowNumber; i++) {
                for (int j = 0; j < colNumber; j++) {
                    this.matrix[i][j] = array[i][j];
                }
            }
            printMatrix();
        } else {
            System.out.println("Размерность передаваемого массива не соответствует заданному шаблону матрицы." +
                    " Передаваемый массив должен содержать: \nстрок - " + this.rowNumber + "\nрядов - " + this.colNumber);
            printMatrix();
        }
    }

    public void addMatrix(Matrix myMatrix) {
        System.out.println("\nПередаем матрицу для сложения..");
        if (myMatrix.matrix.length == rowNumber && myMatrix.matrix[0].length == colNumber) {
            for (int i = 0; i < rowNumber; i++) {
                for (int j = 0; j < colNumber; j++) {
                    this.matrix[i][j] = this.matrix[i][j] + myMatrix.matrix[i][j];
                }
            }
            System.out.println("\nРезультат сложения:");
            printMatrix();
        } else {
            System.out.println("Размерность передаваемого массива не соответствует заданному шаблону матрицы." +
                    " Передаваемый массив должен содержать: \nстрок - " + this.rowNumber + "\nрядов - " + this.colNumber);
            printMatrix();
        }
    }

    public void printMatrix() {
        if (matrix.length > 0) {
            System.out.println();
            for (int i = 0; i < rowNumber; i++) {
                for (int j = 0; j < colNumber; j++) {
                    System.out.printf("%4d", this.matrix[i][j]);
                }
                System.out.println();
            }
        } else {
            System.out.println(0);
        }
    }
}