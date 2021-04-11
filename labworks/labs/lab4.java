package labs;

import java.util.Scanner;

public class lab4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);    //инициализируется для приблуды ввода консоли
        double a, b, c;
        double x1, x2;
        double Discriminant;

        System.out.println("Введите a, b, c для решения квадратного уравнения вида a*x^2+b*x+c=0");
        System.out.println("Введите a: " + scanner);
        a = scanner.nextDouble();
        System.out.println("Введите b: " + scanner);
        b = scanner.nextDouble();
        System.out.println("Введите c: " + scanner);
        c = scanner.nextDouble();
        Discriminant = b * b - 4 * a * c;
        if (Discriminant < 0)
            System.out.println("Error");
        else if (Discriminant > 0) {
            x1 = (-b + Math.sqrt(Discriminant)) / (2 * a);
            x2 = (-b - Math.sqrt(Discriminant)) / (2 * a);
            System.out.println("x1= " + x1 + "  " + "x2= " + x2);
        } else {
            x1 = -1 * (b / (2 * a));
            System.out.println("x1=x2= " + x1);
        }
    }
}
