import java.util.Scanner;

public class _2192A_StringRotation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while (tc-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();

            StringBuilder modified = new StringBuilder();

            int i;
            for (i = n - 1; i > 0; i--) {
                if (s.charAt(i) == s.charAt(i - 1)) {
                    modified.append(s, i, n);
                    modified.append(s, 0, i);
                    break;
                }
            }

            if (i == 0) {
                modified.append(s);
            }

            int count = 1;
            for (i = 1; i < n; i++) {
                if (modified.charAt(i) != modified.charAt(i - 1)) {
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
