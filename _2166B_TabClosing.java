import java.util.Scanner;

public class _2166B_TabClosing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long a = sc.nextLong();
            long b = sc.nextLong();
            long n = sc.nextLong();

            if (b * n > a && b < a) {
                System.out.println(2);
            } else {
                System.out.println(1);
            }
        }
    }
}
