import java.util.Scanner;

public class _1343A_Candies {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tc=sc.nextInt();

        while (tc-- > 0){
            long n = sc.nextLong();
            long ans = 1;
            for (int k = 2; ; k++) {
                long m = (1L << k) - 1; // 2^k - 1
                if (m > n) break;
                if (n % m == 0) {
                    ans = n / m;
                    break;
                }
            }
            System.out.println(ans);
        }
    }
}
