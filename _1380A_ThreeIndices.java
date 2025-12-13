import java.util.Arrays;
import java.util.Scanner;

public class _1380A_ThreeIndices {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();

        while (tc-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];

            // store INDICES instead of values
            int[] prevSmall = new int[n];
            int[] nextSmall = new int[n];
            Arrays.fill(prevSmall, -1);
            Arrays.fill(nextSmall, -1);

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            // prev smaller index
            int minIdx = 0;
            for (int i = 1; i < n; i++) {
                if (arr[minIdx] < arr[i]) {
                    prevSmall[i] = minIdx;
                }
                if (arr[i] < arr[minIdx]) {
                    minIdx = i;
                }
            }

            // next smaller index
            minIdx = n - 1;
            for (int i = n - 2; i >= 0; i--) {
                if (arr[minIdx] < arr[i]) {
                    nextSmall[i] = minIdx;
                }
                if (arr[i] < arr[minIdx]) {
                    minIdx = i;
                }
            }

            boolean found = false;
            for (int i = 1; i < n - 1; i++) {
                if (prevSmall[i] != -1 && nextSmall[i] != -1) {
                    System.out.println("YES");
                    // +1 for 1-based indexing
                    System.out.println(
                            (prevSmall[i] + 1) + " " +
                                    (i + 1) + " " +
                                    (nextSmall[i] + 1)
                    );
                    found = true;
                    break;
                }
            }

            if (!found) System.out.println("NO");
        }
    }
}
