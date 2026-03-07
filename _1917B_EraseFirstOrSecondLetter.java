import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class _1917B_EraseFirstOrSecondLetter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();
            StringBuilder sb = new StringBuilder(s);

            Set<String> set = new HashSet<>();

            solve(sb, set);
            System.out.println(set.size());
        }
    }

    private static void solve(StringBuilder sb, Set<String> set) {
        if (sb.isEmpty()) return;

        // remove first
        StringBuilder first = new StringBuilder(sb);
        first.deleteCharAt(0);
        set.add(first.toString());
        solve(first, set);

        // remove second
        if (sb.length() > 1) {
            StringBuilder sec = new StringBuilder(sb);
            sec.deleteCharAt(1);
            set.add(sec.toString());
            solve(sec, set);
        }
    }
}
