import java.util.Scanner;

public class _1873E_Aquarium {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();

        while (tc-- > 0) {
            int n = sc.nextInt();
            long x = sc.nextInt();
            int[] arr = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            System.out.println(maxHeight(arr, n, x));
        }
    }

    private static long maxHeight(int[] arr, int n, long x) {

        long ans = 1;
        long low = 1, high = 1000000001;
        while (low <= high) {
            long mid = low + (high - low) / 2;

            long water = requiredWater(mid, arr);

            if (water <= x) {
                ans = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }

        }
        return ans;
    }

    private static long requiredWater(long height, int[] arr) {
        long count = 0;
        for (int curr : arr) {
            if(curr < height) {
                count += height - curr;
            }
        }
        return count;
    }
}
