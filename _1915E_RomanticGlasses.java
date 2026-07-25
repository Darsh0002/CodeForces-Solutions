import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class _1915E_RomanticGlasses {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();

        while (tc-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();

                if (i % 2 == 0) a[i] = -a[i];
            }

            Set<Long> seen = new HashSet<>();
            seen.add(0L);

            long curr = 0;
            boolean possible = false;
            for (int i = 0; i < n; i++) {
                curr += a[i];

                if (seen.contains(curr)) {
                    possible = true;
                    break;
                }

                seen.add(curr);
            }

            if (possible) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
