import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class _977B_TwoGram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String s = sc.next();

        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < n - 1; i++) {
            String sub = s.substring(i, i + 2);
            map.put(sub, map.getOrDefault(sub, 0) + 1);
        }

        int maxFreq = 0;
        String ans = "";
        for (String pair : map.keySet()) {
            if (map.get(pair) > maxFreq) {
                maxFreq = map.get(pair);
                ans = pair;
            }
        }

        System.out.println(ans);
    }
}
