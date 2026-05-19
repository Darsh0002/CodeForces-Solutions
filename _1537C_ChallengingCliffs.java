import java.util.Arrays;
import java.util.Scanner;

public class _1537C_ChallengingCliffs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();

        while (tc-- > 0) {
            int n = sc.nextInt();
            int[] h = new int[n];

            for (int i = 0; i < n; i++) {
                h[i] = sc.nextInt();
            }

            Arrays.sort(h);

            // If n is 2, the sorted array is already optimal
            if (n == 2) {
                System.out.println(h[0] + " " + h[1]);
                continue;
            }

            // Find the adjacent pair with the minimum difference
            int minDiff = Integer.MAX_VALUE;
            int pivotIndex = 0;

            for (int i = 0; i < n - 1; i++) {
                int diff = h[i + 1] - h[i];
                if (diff < minDiff) {
                    minDiff = diff;
                    pivotIndex = i; // h[pivotIndex] and h[pivotIndex + 1] are our start/end
                }
            }

            // First: Start mountain
            System.out.print(h[pivotIndex] + " ");

            // Second: All elements greater than or equal to the start mountain
            for (int i = pivotIndex + 2; i < n; i++) {
                System.out.print(h[i] + " ");
            }

            // Third: All elements smaller than or equal to the start mountain
            for (int i = 0; i < pivotIndex; i++) {
                System.out.print(h[i] + " ");
            }

            // Fourth: End mountain
            System.out.print(h[pivotIndex + 1]);

            System.out.println();
        }
        sc.close();
    }
}