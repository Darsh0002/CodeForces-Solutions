import java.util.Scanner;

public class _313A_llyaBankAccount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String num = sc.next();
        int n = num.length();
        if (num.charAt(0) != '-') {
            System.out.println(num);
            return;
        }

        char last = num.charAt(n - 1);
        char secLast = num.charAt(n - 2);
        if (last < secLast) {
            // keep last
            if ((num.substring(0, n - 2) + last).equals("-0"))
                System.out.println(0);
            else
                System.out.println(num.substring(0, n - 2) + last);
        } else {
            // remove last
            System.out.println(num.substring(0, n - 1));
        }
    }
}
