import java.util.*;

public class _451B_SortArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        long[] a = new long[n];

        for (int i = 0; i < n; i++)
            a[i] = sc.nextLong();

        int l = 0;

        // find first decreasing
        while (l + 1 < n && a[l] <= a[l + 1])
            l++;

        // already sorted
        if (l == n - 1) {
            System.out.println("yes");
            System.out.println("1 1");
            return;
        }

        int r = l;

        // extend decreasing segment
        while (r + 1 < n && a[r] > a[r + 1])
            r++;

        // boundary checks
        if ((l > 0 && a[l - 1] > a[r]) || (r < n - 1 && a[l] > a[r + 1])) {
            System.out.println("no");
            return;
        }

        // check remaining increasing
        for (int i = r + 1; i < n - 1; i++) {
            if (a[i] > a[i + 1]) {
                System.out.println("no");
                return;
            }
        }

        System.out.println("yes");
        System.out.println((l + 1) + " " + (r + 1));
    }
}