import java.util.Scanner;

public class _1999D_SlavicsExam {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while (tc-- > 0) {
            String s = sc.next();
            int n = s.length();

            String t = sc.next();
            int m = t.length();

            int i = 0, j = 0;
            StringBuilder ans = new StringBuilder();

            while (i < n && j < m) {
                if (s.charAt(i) == t.charAt(j) || s.charAt(i) == '?') {
                    ans.append(t.charAt(j));
                    j++;
                } else {
                    ans.append(s.charAt(i));
                }
                i++;
            }

            while (i < n) {
                char c = s.charAt(i);
                ans.append(c == '?' ? 'z' : c);
                i++;
            }

            if (j == m) {
                System.out.println("YES");
                System.out.println(ans);
            } else {
                System.out.println("NO");
            }
        }
    }
}
