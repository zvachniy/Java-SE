package labs;

import java.util.Random;

public class Genom {
    public static void main(String[] args) {
        int[] array;
        int buffer = 0;//переменная буфер
        array = new int[10];
        int indexSwap=0;

        for (int i = 0; i < array.length; i++) {
            Random r2 = new Random();
            array[i] = r2.nextInt(99);
            System.out.print(array[i] + "  ");
        }

        System.out.println();
        System.out.println("----------------------------");

        for (int externalI = array.length - 1; externalI >= 1; externalI--) {
            for (int internalI = 0; internalI < externalI; internalI++) {
                if (array[internalI] > array[internalI + 1]) {
                    buffer = array[internalI];
                    array[internalI] = array[internalI + 1];
                    array[internalI + 1] = buffer;
                    indexSwap++;
                }
            }
        }

        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "  ");
        }
        System.out.println();
        System.out.println("Количество проходов "+indexSwap);
    }
}
