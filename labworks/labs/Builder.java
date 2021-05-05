package labs;

import java.util.Scanner;

public class Builder {
    static int holeA = 0, holeB = 0; //отверстие
    static int A = 0, B = 0, C = 0;    //кирпич
    static boolean flag = false;

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
        if (holeA >= A && holeB >= C) flag = true;

        if (holeA >= A && holeB >= B) flag = true;

        if (holeA >= B && holeB >= C) flag = true;

        if (holeA >= B && holeB >= A) flag = true;

        if (holeA >= C && holeB >= A) flag = true;

        if (holeA >= C && holeB >= B) flag = true;

        if (flag) System.out.println("Прошёл");
        else System.out.println("не прошел");

    }
}
