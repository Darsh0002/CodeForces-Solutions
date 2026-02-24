import java.util.*;

public class _1831B_ArrayMerging {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();

        while (tc-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            int[] b = new int[n];

            for (int i = 0; i < n; i++)
                a[i] = sc.nextInt();

            for (int i = 0; i < n; i++)
                b[i] = sc.nextInt();

            Map<Integer, Integer> m1 = getMaxFreq(a, n);
            Map<Integer, Integer> m2 = getMaxFreq(b, n);

            int ans = 0;

            for (int key : m1.keySet())
                ans = Math.max(ans, m1.get(key) + m2.getOrDefault(key, 0));

            for (int key : m2.keySet())
                ans = Math.max(ans, m2.get(key) + m1.getOrDefault(key, 0));

            System.out.println(ans);
        }
    }

    static Map<Integer, Integer> getMaxFreq(int[] arr, int n) {
        Map<Integer, Integer> map = new HashMap<>();

        int curr = arr[0];
        int count = 1;

        for (int i = 1; i < n; i++) {
            if (arr[i] == curr) {
                count++;
            } else {
                map.put(curr, Math.max(map.getOrDefault(curr, 0), count));
                curr = arr[i];
                count = 1;
            }
        }
        map.put(curr, Math.max(map.getOrDefault(curr, 0), count));
        return map;
    }
}