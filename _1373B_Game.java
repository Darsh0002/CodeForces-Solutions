import java.util.Scanner;

public class _1373B_Game {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            StringBuilder s = new StringBuilder(sc.next());
            int n = s.length();

            int zero = 0, one = 0;
            for (int i = 0; i < n; i++) {
                if (s.charAt(i) == '0') zero++;
                else one++;
            }

            boolean alice = true;
            while (zero > 0 && one > 0) {
                if (s.indexOf("01") != -1) {
                    int idx = s.indexOf("01");
                    s.delete(idx, idx + 2);
                    zero--;
                    one--;
                    alice = (!alice);
                } else if (s.indexOf("10") != -1) {
                    int idx = s.indexOf("10");
                    s.delete(idx, idx + 2);
                    zero--;
                    one--;
                    alice = (!alice);
                }
            }

            System.out.println(alice ? "NET" : "DA");
        }
    }
}
