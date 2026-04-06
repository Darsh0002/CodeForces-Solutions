import java.util.Scanner;

public class _1476A_Kdivisible {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();

        while (tc-- > 0) {
            long n = sc.nextLong();
            long k = sc.nextLong();

            long left = 1, right = k, ans = k;

            while (left <= right) {
                long mid = left + (right - left) / 2;

                long minSum = n - 1 + mid;
                long maxSum = mid * n;

                long count = (maxSum / k) - ((minSum - 1) / k);

                if (count > 0) {
                    ans = mid;
                    right = mid - 1; // try smaller
                } else {
                    left = mid + 1;
                }
            }

            System.out.println(ans);
        }
    }
}