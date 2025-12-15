import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class _2157A_DungeonEquilibrium {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tc = sc.nextInt();

        while (tc-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            Map<Integer, Integer> map = new HashMap<>();
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
                map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
            }

            int ans = 0;
            for (int key : map.keySet()) {
                int freq = map.get(key);
                if (key > freq) {
                    ans += freq;
                } else if (key < freq) {
                    ans += freq - key;
                }
            }
            System.out.println(ans);
        }
        sc.close();
    }
}
