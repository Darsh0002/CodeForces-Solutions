import java.util.Scanner;

public class _2228B_RemiliaPlaysSoku {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tc = sc.nextInt();

        while (tc-- > 0) {
            int n = sc.nextInt();
            int a = sc.nextInt();
            int b = sc.nextInt();
            int k = sc.nextInt();

            if (n <= 3) {
                System.out.println(1);
                continue;
            }

            int d1 = Math.abs(a - b);
            int d2 = n - d1;
            int d = Math.min(d1, d2);

            System.out.println(d + k);
        }
    }
}