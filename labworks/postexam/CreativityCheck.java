package postexam;

import java.util.Scanner;

public class CreativityCheck {

    public static void main(String[] args) {
        int letterCount = 0;
        int wordsCount = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите текст сюда:");
        String text = sc.nextLine();
        System.out.println("Текст принят в следующем ввиде: "+text);
        boolean flagDiv = true;
        boolean flagLetter;


        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' ' || text.charAt(i) == ',' || text.charAt(i) == '.' || text.charAt(i) == '!'
                    || text.charAt(i) == '?' || text.charAt(i) == ':' || text.charAt(i) == ';' || text.charAt(i) == '('
                    || text.charAt(i) == ')' || text.charAt(i) == '"') {
                flagDiv = true;
                flagLetter = false;
            } else {
                flagLetter = true;
                letterCount++;
            }
            if (flagLetter && flagDiv) {
                wordsCount++;
                flagDiv = false;
            }
        }
        System.out.println("Количество слов = " + wordsCount);
        System.out.println("Количество букв = " + letterCount);
    }
}