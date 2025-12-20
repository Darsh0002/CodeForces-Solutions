
import java.util.Scanner;

public class _1676B_Equalcandies {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            long[] arr = new long[n];
            long min = Long.MAX_VALUE;
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextLong();
                min = Math.min(min, arr[i]);
            }

            long eat = 0;
            for (int i = 0; i < n; i++) {
                eat += arr[i] - min;
            }
            System.out.println(eat);
        }
    }
}
