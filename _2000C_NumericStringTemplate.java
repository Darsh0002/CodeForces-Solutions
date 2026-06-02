import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class _2000C_NumericStringTemplate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();

        while (tc-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            int m = sc.nextInt();

            while (m-- > 0) {
                String s = sc.next();
                int len = s.length();

                if (len != n) {
                    System.out.println("NO");
                    continue;
                }

                int[] map = new int[26];
                Arrays.fill(map, Integer.MAX_VALUE);
                HashMap<Integer, Character> revMap = new HashMap<>(); // Tracks Int -> Char

                boolean ok = true;
                for (int i = 0; i < n; i++) {
                    char c = s.charAt(i);
                    int curr = arr[i];

                    if (map[c - 'a'] == Integer.MAX_VALUE) {
                        // If the character is new, but the number is already mapped to another character
                        if (revMap.containsKey(curr)) {
                            ok = false;
                            break;
                        }
                        map[c - 'a'] = curr;
                        revMap.put(curr, c);
                    } else if (map[c - 'a'] != curr) {
                        ok = false;
                        break;
                    }
                }

                if (ok) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            }
        }
    }
}
