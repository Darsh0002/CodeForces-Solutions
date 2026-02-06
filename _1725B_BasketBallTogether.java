import java.util.Arrays;
import java.util.Scanner;

public class _1725B_BasketBallTogether {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d = sc.nextInt();
        d++; // to avoid strictly

        int[] power = new int[n];
        for (int i = 0; i < n; i++) {
            power[i] = sc.nextInt();
        }

        Arrays.sort(power);

        int i = 0, j = n - 1;
        int wins = 0;
        while (j >= i) {
            int required = (d / power[j]) + (d % power[j] == 0 ? 0 : 1);

            if (j - i + 1 >= required) {
                wins++;
            }

            j--;
            i += required - 1;
        }

        System.out.println(wins);
    }
}
