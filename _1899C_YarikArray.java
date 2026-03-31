import java.util.Scanner;

public class _1899C_YarikArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while (tc-- > 0) {
            int n = sc.nextInt();

            long[] arr = new long[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextLong();
            }

            long maxSum = arr[0];
            long currSum = arr[0];

            for (int i = 1; i < n; i++) {
                // if same parity as previous element
                if (Math.abs(arr[i]) % 2 == Math.abs(arr[i - 1]) % 2) {
                    // start new subarray
                    currSum = arr[i];
                    maxSum = Math.max(maxSum, currSum);
                }
                // otherwise
                else {
                    // we have two options:
                    // 1) start new subarray
                    // 2) continue with joining previous subarray

                    long newSub = arr[i];
                    long joinPrev = currSum + arr[i];

                    currSum = Math.max(newSub, joinPrev);
                    maxSum = Math.max(maxSum, currSum);
                }
            }
            System.out.println(maxSum);
        }
    }
}
