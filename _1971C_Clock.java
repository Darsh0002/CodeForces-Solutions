import java.util.Scanner;

public class _1971C_Clock {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while (tc-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int d = sc.nextInt();

            int cnt = 0;
            for (int i = Math.min(a, b); i < Math.max(a, b); i++) {
                if (i == c || i == d) cnt++;
            }

            System.out.println((cnt == 1) ? "YES" : "NO");
        }
    }
}
