import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class _1665B_ArrayCloning {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while (tc-- > 0) {
            int n = sc.nextInt();
            Map<Integer, Integer> map = new HashMap<>();
            int maxFreq = 0;

            for (int i = 0; i < n; i++) {
                int num = sc.nextInt();

                map.put(num, map.getOrDefault(num, 0) + 1);
                maxFreq = Math.max(maxFreq, map.get(num));
            }

            int count = 0;
            while (maxFreq < n) {
                count++;
                if (maxFreq * 2 > n) count += n - maxFreq;
                else count += maxFreq;
                maxFreq *= 2;
            }
            System.out.println(count);
        }
    }
}