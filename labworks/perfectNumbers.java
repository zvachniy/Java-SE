import java.util.stream.Stream;

public class perfectNumbers {
    public static void main(String[] args) {
        int Numbers=1000000;
        //long[] arrayNumbers=new arrayNumbers[Numbers];
        int procNumbers = 100000;
        int summaryprocNumbers = 0;

        for (int i = 1; i <= Numbers; i++) {
            if (i % procNumbers == 0) {
                summaryprocNumbers++;
                System.out.println("Done " + summaryprocNumbers + "%");
            }
            if (i / 2 != 0) {
                int s = 0;
                for (int k = 1; k <= i / 2; k++) {
                    if (i % k == 0) s += k;
                }
                if (i == s) {
                    System.out.println("Совершенное число " + i);
                }
            }
        }
    }
}
