import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class HackWithInfy_Mock_1_Blocks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            b[i] = sc.nextInt();
        }
        System.out.println(maxNumber(a, b, n));
    }

    private static long maxNumber(int[] a, int[] brr, int n) {
        long MOD = 1000000007;

        Integer[] arr = Arrays.stream(a)
                .boxed().
                toArray(Integer[]::new);
        Arrays.sort(arr, Collections.reverseOrder());

        Arrays.sort(brr);

        long num = 0;

        for (int i = 0; i < n; i++) {
            int ones = arr[i];
            int zeros = brr[i];

            // append 1-bits
            while (ones > 0) {
                num = ((num << 1) | 1) % MOD;
                ones--;
            }

            // append 0-bits
            while (zeros > 0) {
                num = (num << 1) % MOD;
                zeros--;
            }
        }

        return num;
    }
}
