import java.util.Arrays;
import java.util.Scanner;

public class _2209A_FlipFlop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while (tc-- > 0) {
            int n = sc.nextInt();
            long c = sc.nextLong();
            long k = sc.nextLong();

            long[] power = new long[n];
            for (int i = 0; i < n; i++) {
                power[i] = sc.nextLong();
            }

            Arrays.sort(power);

            for (int i = 0; i < n; i++) {
                if (power[i] > c) {
                    break;
                }

                long add = Math.min(k, c - power[i]);

                power[i] += add;
                k -= add;
                c += power[i];
            }
            System.out.println(c);
        }
    }
}
