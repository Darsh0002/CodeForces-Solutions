import java.util.Scanner;

public class _1878C_VasilijeInCacak {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();

        while (tc-- > 0) {
            long n = sc.nextLong();
            long k = sc.nextLong();
            long sum = sc.nextLong();

            long minSum = k * (k + 1) / 2;
            long maxSum = (k * n) - k * (k - 1) / 2;

            if (sum >= minSum && sum <= maxSum)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
        sc.close();
    }
}
