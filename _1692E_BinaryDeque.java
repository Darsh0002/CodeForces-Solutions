import java.util.Scanner;

public class _1692E_BinaryDeque {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();

        while (tc-- > 0) {
            int n = sc.nextInt();
            int s = sc.nextInt();
            int[] a = new int[n];

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }

            // Note that the remaining array is a subarray of the original array

            // Problem Boils down to: Count SubArrays with sum s

            int i = 0, j = 0, currSum = 0;
            int minOps = Integer.MAX_VALUE;

            while (j < n) {
                currSum += a[j];

                while (currSum > s) {
                    currSum -= a[i];
                    i++;
                }

                if (currSum == s) {
                    minOps = Math.min(minOps, n - j - 1 + i);
                }
                j++;
            }

            System.out.println(minOps == Integer.MAX_VALUE ? -1 : minOps);
        }
    }
}
