import java.util.Scanner;

public class _1821B_SortSubarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tc = sc.nextInt();

        while (tc-- > 0) {
            int n = sc.nextInt();

            int[] arr = new int[n];
            int[] brr = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            for (int i = 0; i < n; i++) {
                brr[i] = sc.nextInt();
            }

            // Find the first and last positions where arr and brr differ.

            int l = 0;
            while (l < n && arr[l] == brr[l]) {
                l++;
            }

            int r = n - 1;
            while (r >= 0 && arr[r] == brr[r]) {
                r--;
            }

            // If arrays are already equal
            if (l == n) {
                System.out.println("1 1");
                continue;
            }

            // Since the sorted segment in brr must be increasing, expand l and r (We have to find the longest subarray)

            // Extend to the left
            while (l > 0 && brr[l - 1] <= brr[l]) {
                l--;
            }

            // Extend to the right
            while (r < n - 1 && brr[r] <= brr[r + 1]) {
                r++;
            }

            System.out.println((l + 1) + " " + (r + 1));
        }

        sc.close();
    }
}