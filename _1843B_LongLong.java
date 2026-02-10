import java.util.Arrays;
import java.util.Scanner;

public class _1843B_LongLong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while (tc-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            long sum = 0;
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
                sum += Math.abs(arr[i]);
            }

            // we have to count number of subarrays where numbers are negative(including zeros)
            int count = 0;
            int l = 0, r = 0;
            while (r < n) {
                if (arr[r] < 0) {
                    if (l == r) count++;
                    r++;
                } else if (arr[r] == 0) {
                    if (l == r) l++;
                    r++;
                } else {
                    r++;
                    l = r;
                }
            }
            System.out.println(sum + " " + count);
        }
    }
}
