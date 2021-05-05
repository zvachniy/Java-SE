package labs;

import java.util.Scanner;

public class Builder {
    static int holeA = 0, holeB = 0; //отверстие
    static int A = 0, B = 0, C = 0;    //кирпич

    public static void main(String[] args) {
        try {
            System.out.println("Введи габариты отверстия");

            Scanner scanner = new Scanner(System.in);
            holeA = scanner.nextInt();
            holeB = scanner.nextInt();
            System.out.println("Введите параметры кирпича");
            A = scanner.nextInt();
            B = scanner.nextInt();
            C = scanner.nextInt();
        } catch (Exception exception) {
            System.out.println("ТОЛЬКО ЦИФРЫ");
        }

        if (holeA >= A && holeB >= C) System.out.println("Влазит");
        else System.out.println("Не влазит");
        if (holeA >= A && holeB >= B) System.out.println("Влазит");
        else System.out.println("Не влазит");
        if (holeA >= B && holeB >= C) System.out.println("Влазит");
        else System.out.println("Не влазит");
        if (holeA >= B && holeB >= A) System.out.println("Влазит");
        else System.out.println("Не влазит");
        if (holeA >= C && holeB >= A) System.out.println("Влазит");
        else System.out.println("Не влазит");
        if (holeA >= C && holeB >= B) System.out.println("Влазит");
        else System.out.println("Не влазит");
    }
}
