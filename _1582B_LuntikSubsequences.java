import java.util.Scanner;

public class _1582B_LuntikSubsequences {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while (tc-- > 0) {
            int n = sc.nextInt();
            int ones = 0, zeros = 0;

            for (int i = 0; i < n; i++) {
                int x = sc.nextInt();
                if (x == 1) ones++;
                else if (x == 0) zeros++;
            }

            long ways = (long) Math.pow(2, zeros) * ones;
            System.out.println(ways);
        }
    }

}
