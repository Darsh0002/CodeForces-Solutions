import java.util.Scanner;

public class _1840A_CipherShifer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();
            char c = '#';
            StringBuilder ans = new StringBuilder();
            int i = 0;
            while (i < n) {
                if (c == '#') c = s.charAt(i);
                else if (s.charAt(i) == c) {
                    ans.append(c);
                    c = '#';
                }
                i++;
            }
            System.out.println(ans);
        }
    }
}
