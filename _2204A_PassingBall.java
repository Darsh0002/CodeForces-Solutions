import java.util.Scanner;

public class _2204A_PassingBall {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while (tc-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();

            System.out.println(s.indexOf('L') + 1);
        }
    }
}
