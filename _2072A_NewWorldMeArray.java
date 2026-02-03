import java.util.Scanner;

public class _2072A_NewWorldMeArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int k = Math.abs(sc.nextInt());
            int p = sc.nextInt();

            if (k == 0) {
                System.out.println(0);
            } else if (k > n * p) {
                System.out.println(-1);
            } else if (k % p == 0) {
                System.out.println(k / p);
            } else {
                int count = 0;
                int mod = k % p;
                k = k - mod;
                System.out.println(k/p + 1);
            }
        }
    }
}