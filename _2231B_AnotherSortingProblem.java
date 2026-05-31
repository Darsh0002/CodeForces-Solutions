import java.util.Scanner;

public class _2231B_AnotherSortingProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();

        while (tc-- > 0) {
            int n = sc.nextInt();

            long[] arr = new long[n];

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextLong();
            }

            System.out.println(possibleToSort(arr, n) ? "YES" : "NO");
        }
    }

    private static boolean possibleToSort(long[] arr, int n) {
        long maxK = -1;
        for (int i = 1; i < n; i++) {
            if (arr[i] < arr[i - 1]) {
                maxK = Math.max(arr[i - 1] - arr[i], maxK);
            }
        }

        for (int i = 1; i < n; i++) {
            if (arr[i] < arr[i - 1]) {
                arr[i] += maxK;
            }

            if (arr[i] < arr[i - 1]) {
                return false;
            }
        }

        return true;
    }
}
