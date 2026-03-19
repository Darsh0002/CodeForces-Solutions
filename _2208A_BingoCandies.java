import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class _2208A_BingoCandies {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tc = sc.nextInt();
        while (tc-- > 0) {
            int n = sc.nextInt();
            int maxFreq = 0;
            Map<Integer, Integer> map = new HashMap<>();

            int total = n * n;
            for (int i = 0; i < total; i++) {
                int color = sc.nextInt();
                map.put(color, map.getOrDefault(color, 0) + 1);

                maxFreq = Math.max(maxFreq, map.get(color));
            }

            if (maxFreq > total - n) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
            }
        }
    }
}
