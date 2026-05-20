import java.util.Scanner;

public class _1359A_BerlandPoker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();

        while (tc-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int k = sc.nextInt();

            // number of jockers winner can have
            int w = Math.min(n / k, m);

            // remaining jockers
            int rem = m - w;

            System.out.println(w - (int) Math.ceil((double) rem / (k - 1)));
        }
    }
}
