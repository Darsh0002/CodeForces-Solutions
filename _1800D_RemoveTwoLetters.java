import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class _1800D_RemoveTwoLetters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();

            Set<String> set = new HashSet<>();

            for (int i = 0; i < n - 1; i++) {
                String curr = s.substring(0, i) + (i + 2 < n ? s.substring(i + 2) : "");
                set.add(curr);
            }
            System.out.println(set.size());
        }
    }
}
