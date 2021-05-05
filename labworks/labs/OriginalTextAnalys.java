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


    public int makeMagic(String s) {
        boolean flagComma = false;
        boolean flagEndSentence = false;
        boolean flagOddLetters = false;
        //boolean flagLetters = true;
        int countOddLetters = 0;
        int sum = 0;
        int Words = 0;
        int pseudoWords=0;
        for (int i = 0; i < s.length(); i++) {
            sum++;
            if (s.charAt(i) == ' ' | s.charAt(i) == ',' | s.charAt(i) == '.' | s.charAt(i) == '!') {
                flagOddLetters = true;
                Words++;
                countOddLetters++;
            } /*else {
                flagLetters = true;
            }*/
            if (s.charAt(i) == ',') flagComma = true;
            if (s.charAt(i) == '.' | s.charAt(i) == '!') flagEndSentence = true;
            if (flagComma & flagOddLetters) {
                flagOddLetters = false;
                flagComma = false;
                pseudoWords++;
            }
            if (flagEndSentence && flagOddLetters) {
                flagEndSentence = false;
                flagOddLetters = false;
                pseudoWords++;
            }
        }
        Words=Words-pseudoWords;
        System.out.println("лишних символов " + countOddLetters);
        countLetters = sum - countOddLetters;
        System.out.println("Количество слов в строке " + Words);
        return countLetters;
    }

    public static void main(String[] args) {
        System.out.println("Введите текстовую строку");
        Scanner in = new Scanner(System.in);
        s1 = in.nextLine();
        //char[] chars = s1.toCharArray();
        //System.out.println(s1);
        OriginalTextAnalys n1 = new OriginalTextAnalys();
        System.out.println("Количество символов в строке " + n1.getCountSymbols(s1));
        System.out.println("Количество букв в строке " + n1.makeMagic(s1));
    }
}
