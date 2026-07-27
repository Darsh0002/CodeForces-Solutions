import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class _1703F_PairsSatisfyingInequality {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tc = sc.nextInt();

        while (tc-- > 0) {
            int n = sc.nextInt();

            int[] a = new int[n + 1];

            List<Integer> good = new ArrayList<>();
            long ans = 0;

            for (int i = 1; i <= n; i++) {
                a[i] = sc.nextInt();

                if (a[i] < i) {
                    // Count previous good indices that are < a[i]
                    ans += lowerBound(good, a[i]);

                    // Store current index
                    good.add(i);
                }
            }

            System.out.println(ans);
        }
    }

    private static int lowerBound(List<Integer> list, int val) {
        int l = 0, r = list.size();

        while (l < r) {
            int mid = (l + r) / 2;

            if (list.get(mid) < val)
                l = mid + 1;
            else
                r = mid;
        }

        return l;
    }
}