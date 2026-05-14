import java.util.*;

public class _2224B_MexMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) return;
        int tc = sc.nextInt();

        while (tc-- > 0) {
            int n = sc.nextInt();
            int[] input = new int[n];
            int maxVal = -1;

            for (int i = 0; i < n; i++) {
                input[i] = sc.nextInt();
                if (input[i] > maxVal) maxVal = input[i];
            }

            int[] freq = new int[n + 1];
            ArrayList<Integer> larger = new ArrayList<>();
            boolean removedMax = false;

            for (int x : input) {
                // Remove exactly one instance of maxVal
                if (x == maxVal && !removedMax) {
                    removedMax = true;
                    continue;
                }

                if (x < n) freq[x]++;
                else larger.add(x);
            }

            int[] reArranged = new int[n];
            reArranged[0] = maxVal;
            int idx = 1;

            // 1. Build the unique MEX streak (0, 1, 2...)
            int curr = 0;
            while (curr < n && freq[curr] > 0) {
                reArranged[idx++] = curr;
                freq[curr]--;
                curr++;
            }

            // 2. Dump duplicate elements < n
            for (int j = 0; j < n; j++) {
                while (freq[j] > 0) {
                    reArranged[idx++] = j;
                    freq[j]--;
                }
            }

            // 3. Dump elements >= n
            for (int val : larger) {
                reArranged[idx++] = val;
            }

            // Calculate Results
            long ans = (long) maxVal * n; // Sum of prefix MAX values
            boolean[] vis = new boolean[n + 2];
            int mex = 0;

            for (int k = 0; k < n; k++) {
                if (reArranged[k] <= n) {
                    vis[reArranged[k]] = true;
                }
                while (vis[mex]) {
                    mex++;
                }
                ans += mex; // Add prefix MEX value
            }

            System.out.println(ans);
        }
    }
}