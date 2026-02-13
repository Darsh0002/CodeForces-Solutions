import java.util.Scanner;

public class _1853A_Desorting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while (tc-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            int minDiff = Integer.MAX_VALUE;
            for (int i = 1; i < n; i++) {
                minDiff = Math.min(minDiff, arr[i] - arr[i - 1]);
            }

            System.out.println(minDiff < 0 ? 0 : (minDiff / 2) + 1);
        }
    }
}
