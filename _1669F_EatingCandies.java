import java.util.Scanner;

public class _1669F_EatingCandies {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];

            int[] prefix = new int[n];
            int[] suffix = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
                prefix[i] = arr[i] + (i > 0 ? prefix[i - 1] : 0);
            }

            suffix[n - 1] = arr[n - 1];
            for (int i = n - 2; i >= 0; i--) {
                suffix[i] = suffix[i + 1] + arr[i];
            }

            int ans = 0;

            for (int i = 0; i < n; i++) {
                int idx = binarySearch(suffix, prefix[i], n);

                // valid split: no overlap
                if (idx != -1 && idx > i) {
                    int candies = (i + 1) + (n - idx);
                    ans = Math.max(ans, candies);
                }
            }

            System.out.println(ans);
        }
    }

    private static int binarySearch(int[] nums, int target, int n) {
        int low = 0, high = n - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (nums[mid] == target)
                return mid;
            else if (nums[mid] > target)
                low = mid + 1;     // move right
            else
                high = mid - 1;    // move left
        }
        return -1;
    }
}
