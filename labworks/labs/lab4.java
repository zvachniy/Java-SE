package labs;

import java.util.Scanner;

public class lab4 {
    public static void main(String[] args) {
        Scanner scannerA = new Scanner(System.in);
        Scanner scannerB = new Scanner(System.in);
        Scanner scannerC = new Scanner(System.in);
        double a, b, c;
        double x1, x2;
        double Discriminant;
        System.out.println("Введите a, b, c для решения квадратного уравнения вида a*x^2+b*x+c=0");
        System.out.println("a, b и c могут вводиться вида 1 или -16 или 0,9787");
        System.out.print("Введите a: ");
        a = scannerA.nextDouble();
        System.out.print("Введите b: ");
        b = scannerB.nextDouble();
        System.out.print("Введите c: ");
        c = scannerC.nextDouble();
        Discriminant = b * b - 4 * a * c;
        if (Discriminant < 0)
            System.out.println("Корней нет");
        else if (Discriminant > 0) {
            x2 = (-b + Math.sqrt(Discriminant)) / (2 * a);
            x1 = (-b - Math.sqrt(Discriminant)) / (2 * a);
            ///условие добавлено для красоты вывода
            if (x1 <x2)
                System.out.println("Решений два.    x1= " + x1 + "  " + "x2= " + x2);
            else System.out.println("Решений два.    x1= " + x2 + "  " + "x2= " + x1);
        } else {
            x1 = -1 * (b / (2 * a));
            System.out.println("Решение одно.   x1=x2= " + x1);
        }
    }
}
