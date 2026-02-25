import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class _1520D_SameDifferences {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();

        while (tc-- > 0) {
            int n = sc.nextInt();
            Map<Long, Long> map = new HashMap<>();
            long count = 0;

            for (int i = 0; i < n; i++) {
                long num = sc.nextInt();

                long diff = num - i;
                if (map.containsKey(diff)) {
                    count += map.get(diff);
                    map.put(diff, map.get(diff) + 1);
                } else {
                    map.put(diff, 1L);
                }
            }

            System.out.println(count);
        }
    }
}
