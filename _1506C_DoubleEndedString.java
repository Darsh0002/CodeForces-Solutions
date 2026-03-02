import java.util.Scanner;

public class _1506C_DoubleEndedString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            String a = sc.next();
            String b = sc.next();

            int n = a.length(), m = b.length();
            int maxLen = 0;

            for (int i = 0; i < n; i++) {
                for (int j = i; j < n; j++) {
                    int len = j - i + 1;

                    if (len <= m) {
                        String sub = a.substring(i, j + 1);

                        if (b.contains(sub)) {
                            maxLen = Math.max(maxLen, len);
                        }
                    }
                }
            }

            System.out.println(n + m - 2 * maxLen);
        }
    }
}