import java.util.Scanner;

public class _1624B_MakeAP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while (tc-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            if ((2 * b - c > 0) && (2 * b - c) % a == 0) {
                System.out.println("YES");
            } else if (((a + c) % 2 == 0) && ((a + c) / 2) % b == 0) {
                System.out.println("YES");
            } else if ((2 * b - a > 0) && (2 * b - a) % c == 0) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
