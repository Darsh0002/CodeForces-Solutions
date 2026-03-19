import java.util.Scanner;

public class _2178B_ImpostSus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tc = sc.nextInt();
        while (tc-- > 0) {
            String s = sc.next();
            int n = s.length();
            StringBuilder sb = new StringBuilder(s);

            int count = 0;
            if (sb.charAt(0) == 'u') {
                count++;
                sb.setCharAt(0, 's');
            }
            if (sb.charAt(n - 1) == 'u') {
                count++;
                sb.setCharAt(n - 1, 's');
            }

            for (int i = 1; i < n - 1; i++) {
                char curr = sb.charAt(i);
                char next = sb.charAt(i + 1);

                if (curr == 'u' && next == 'u') {
                    sb.setCharAt(i + 1, 's');
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
