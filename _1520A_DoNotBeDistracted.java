import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class _1520A_DoNotBeDistracted {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();

            Set<Character> set = new HashSet<>();

            int i = 0;
            while (i < n) {
                if (set.contains(s.charAt(i))) {
                    System.out.println("NO");
                    break;
                } else {
                    set.add(s.charAt(i++));
                    while (i < n && s.charAt(i) == s.charAt(i - 1)) i++;
                }
            }
            if (i == n) System.out.println("YES");
        }
    }
}
