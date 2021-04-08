
package spbuWorks.cpsmi;

public class factorial {
    final static int N = 100;

    public static void main(String[] args) {
        if (N < 0) {
            System.out.println("Error");
            System.exit(0);
        }
        int n = 1;
        System.out.println("input factorial " + N);
        for (int i = 1; i <= N; i++) {
            n *= i;
        }
        System.out.println("fact is " + n);
    }
}
