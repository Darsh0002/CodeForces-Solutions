import java.util.*;

public class _1904B_CollectingGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while (tc-- > 0) {
            int n = sc.nextInt();

            List<Pair> arr = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                long num = sc.nextLong();
                arr.add(new Pair(num, i));
            }

            arr.sort((a, b) -> (int) (a.val - b.val));

            long[] pre = new long[(int) n];
            pre[0] = arr.get(0).val;
            for (int i = 1; i < n; i++) {
                pre[i] = pre[i - 1] + arr.get(i).val;
            }

            long[] ans = new long[(int) n];

            for (int i = 0; i < n; i++) {
                int cur = i;
                long score = pre[i];

                while (true) {
                    int idx = getIndexOf(score, arr, n);

                    // stop if no progress
                    if (idx <= cur) break;

                    cur = idx;
                    score = pre[cur];
                }

                ans[(int) arr.get(i).idx] = cur;
            }

            for (int i = 0; i < n; i++) {
                System.out.print(ans[i] + " ");
            }
            System.out.println();
        }
    }

    private static int getIndexOf(long score, List<Pair> arr, int n) {
        int i = 0, j = n - 1;
        int ans = -1;
        while (i <= j) {
            int mid = i + (j - i) / 2;

            if (arr.get(mid).val <= score) {
                ans = mid;
                i = mid + 1;
            } else {
                j = mid - 1;
            }
        }
        return ans;
    }

    static class Pair {
        long val, idx;

        Pair(long val, long idx) {
            this.val = val;
            this.idx = idx;
        }
    }
}
