import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class _412C_Pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] s = new String[n];

        for (int i = 0; i < n; i++) s[i] = sc.next();

        int m = s[0].length();

        StringBuilder ans = new StringBuilder();

        for (int j = m - 1; j >= 0; j--) {

            Set<Character> set = new HashSet<>();

            for (int i = 0; i < n; i++) {
                char c = s[i].charAt(j);
                if (c != '?') {
                    set.add(c);
                }
            }

            if (set.isEmpty()) {
                ans.append('x');
            } else if (set.size() == 1) {
                ans.append(set.iterator().next());
            } else {
                ans.append('?');
            }
        }

        System.out.println(ans.reverse());
    }
}
