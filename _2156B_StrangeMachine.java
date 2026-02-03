import java.util.Scanner;

public class _2156B_StrangeMachine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int q = sc.nextInt();
            String s = sc.next();
            boolean bExists = false;
            for (int i = 0; i < n; i++) {
                if (s.charAt(i) == 'B') {
                    bExists = true;
                    break;
                }
            }

            while (q-- > 0) {
                int a = sc.nextInt();

                if (!bExists) {
                    System.out.println(a);
                    continue;
                }

                int i = 0, count = 0;
                while (a > 0) {
                    if (s.charAt(i) == 'A') {
                        a--;
                    } else {
                        a = a / 2;
                    }

                    i = (i + 1) % n;
                    count++;
                }
                System.out.println(count);
            }
        }
    }
}
