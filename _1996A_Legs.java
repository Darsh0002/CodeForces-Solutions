import java.util.Scanner;

public class _1996A_Legs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();

            int ans = 0;

            if (n >= 4) {
                ans = n / 4;
            }

            n = n % 4;

            ans += n/2;

            System.out.println(ans);
        }
    }
}
