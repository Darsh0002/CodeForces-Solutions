import java.util.Scanner;

public class _584A_olesyaRodion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int t = sc.nextInt();

        if (t == 10) {
            if (n == 1) {
                System.out.println(-1);
                return;
            }
            System.out.print(1);
            for (int i = 1; i < n; i++) System.out.print(0);
        } else {
            System.out.print(t);
            for (int i = 1; i < n; i++) System.out.print(0);
        }
    }
}
