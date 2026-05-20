import java.util.Arrays;
import java.util.Scanner;

public class _1539C_StableGroups {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        long k = sc.nextLong();
        long x = sc.nextLong();

        long[] arr = new long[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextLong();
        }
        Arrays.sort(arr);

        long[] diff = new long[n - 1];
        for (int i = 1; i < n; i++) {
            diff[i - 1] = arr[i] - arr[i - 1];
        }

        // sort differences so we try to fix smallest gaps first (greedy)
        Arrays.sort(diff);

        int groups = 0;

        int i = 0;
        while (i < diff.length) {
            // if elements differ by more than x
            if (diff[i] > x) {

                // count number of students needed to bridge this gap
                long required = Math.ceilDiv(diff[i], x) - 1;

                if (k >= required) {
                    k -= required;
                } else {
                    groups++;
                }
            }
            i++;
        }

        System.out.println(groups + 1);
    }
}
