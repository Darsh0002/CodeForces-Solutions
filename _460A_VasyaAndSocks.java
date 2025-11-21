import java.util.Scanner;

public class _460A_VasyaAndSocks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int ans = n;
        while (n >= m) {
            ans += n / m;
            n = (n / m) + (n % m);
        }
        System.out.println(ans);
    }
}

