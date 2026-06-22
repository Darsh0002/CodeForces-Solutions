import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class _237A_FreeCash {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Map<Integer, Integer> map = new HashMap<>();
        int maxFreq = 0;

        for (int i = 0; i < n; i++) {
            int h = sc.nextInt();
            int m = sc.nextInt();

            int mins = (h * 60) + m;
            int seconds = mins * 60;

            map.put(seconds, map.getOrDefault(seconds, 0) + 1);
            maxFreq = Math.max(maxFreq, map.get(seconds));
        }

        System.out.println(maxFreq);
    }
}
