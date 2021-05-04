package labs;

import java.util.Scanner;

public class OriginalTextAnalys {
    private static String s1;   //строка ввода

    int countSymbols;

    public int getCountSymbols(String s) {
        for (int i = 0; i < s.length(); i++) {
            countSymbols++;
        }
        return countSymbols;
    }

    int countLetters;   //количество букв в строке

    public int getCountLetters(String s) {
        int countOddLetters=0;
        int sum=0;
        for (int i = 0; i < s.length(); i++) {
            sum++;
            if (s.charAt(i) == ' ' | s.charAt(i) == ',' | s.charAt(i) == '.'| s.charAt(i) == '!') countOddLetters++;
        }
        System.out.println("лишних символов "+countOddLetters);
        countLetters=sum-countOddLetters;
        return countLetters;
    }

    public static void main(String[] args) {
        System.out.println("Введите текстовую строку");
        Scanner in = new Scanner(System.in);
        s1 = in.nextLine();
        char[] chars = s1.toCharArray();
        System.out.println(s1);
        OriginalTextAnalys n1 = new OriginalTextAnalys();
        System.out.println("Количество символов в строке " + n1.getCountSymbols(s1));
        System.out.println("Количество букв в строке " + n1.getCountLetters(s1));
    }
}
