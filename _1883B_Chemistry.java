import java.util.*;

public class _1883B_Chemistry {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while (tc-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();

            String s = sc.next();

            int[] map = new int[26];
            for (char c : s.toCharArray()) {
                map[c - 'a']++;
            }

            int countOdds = 0;
            for (int i = 0; i < 26; i++) {
                if (map[i] == 0) continue;

                if (map[i] % 2 != 0) {
                    countOdds++;
                }
            }

            System.out.println(countOdds > k + 1 ? "NO" : "YES");
        }
    }
}
