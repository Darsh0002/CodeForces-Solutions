import java.util.Arrays;
import java.util.Scanner;

public class _1876A_Helmets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int p = sc.nextInt();

            int[][] pair = new int[n][2];

            for (int i = 0; i < n; i++) pair[i][0] = sc.nextInt();
            for (int i = 0; i < n; i++) pair[i][1] = sc.nextInt();

            if (n == 1) {
                System.out.println(p);
                continue;
            }

            Arrays.sort(pair, (a, b) -> a[1] - b[1]);

            int i = 0;
            int remaining = n - 1;
            long minCost = p;   // first person pays p

            while (i < n && remaining > 0 && pair[i][1] < p) {
                int persons = Math.min(remaining, pair[i][0]);
                minCost += (long) pair[i][1] * persons;
                remaining -= persons;
                i++;
            }

            // remaining people pay p
            minCost += (long) remaining * p;

            System.out.println(minCost);
        }
    }
}
