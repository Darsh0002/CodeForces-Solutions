import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class _2184C_HugePile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tc = sc.nextInt();

        while (tc-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();

            Map<Integer, Integer> map = new HashMap<>();

            int ans = minTime(n, k, map);
            System.out.println(ans == Integer.MAX_VALUE ? -1 : ans);
        }
    }

    private static int minTime(int n, int k, Map<Integer, Integer> map) {
        if (n == k) return 0;

        if (n < k) return Integer.MAX_VALUE;

        if (map.containsKey(n)) return map.get(n);

        int ceil = minTime(Math.ceilDiv(n, 2), k, map);
        if (ceil != Integer.MAX_VALUE) ceil++;

        int floor = minTime(Math.floorDiv(n, 2), k, map);
        if (floor != Integer.MAX_VALUE) floor++;

        map.put(n, Math.min(ceil, floor));

        return Math.min(ceil, floor);
    }
}
