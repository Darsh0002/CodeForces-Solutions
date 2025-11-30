import java.util.Scanner;

public class _2158A_Suspension {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();

        while (tc-- > 0) {
            int n = sc.nextInt();
            int y = sc.nextInt();
            int r = sc.nextInt();

            int ans = r + (y / 2);

            System.out.println(Math.min(n, ans));
        }
    }
}