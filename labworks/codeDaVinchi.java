import java.util.Scanner;
public class codeDaVinchi {
    public static void main(String[] args) {
        // 1 1 2 3 5 8 13
        int l=1;
        int r=1;
        int nextNumber;
        Scanner in = new Scanner(System.in);
        int number=in.nextInt();
        System.out.println(l);
        System.out.println(r);
        for (int i=2;i<number;i++){
            nextNumber=l+r;
            System.out.println(nextNumber);
            l=r;
            r=nextNumber;


        }
    }
}
