import java.util.Random;

public class gym1 {
    public static void main(String[] args) {
        int arrayRandom[] = new int[100];
        for (int i=0; i < arrayRandom.length; i++) {
            Random r= new Random();
            arrayRandom[i]= r.nextInt(100);
            System.out.println(arrayRandom[i] + " ");
        }
        for (int i=0; i<arrayRandom.length; i++){
            if (arrayRandom[i]>arrayRandom[i+1]) {
                System.out.print("Массив не отсортирован по возрастанию " + i + ", "+arrayRandom[i]+ ", "+ arrayRandom[i+1]);
                break;
            }
        }

    }
}
