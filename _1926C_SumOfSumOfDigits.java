import java.util.Scanner;

public class _1926C_SumOfSumOfDigits {
    public static void main(String[] args) {
        int[] ans = new int[200001];

        ans[0] = 0;
        for (int i = 1; i < 200001; i++) {
            ans[i] = ans[i - 1] + sumOfDigits(i);
        }

        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();

        while (tc-- > 0) {
            int n = sc.nextInt();

            System.out.println(ans[n]);
        }
    }

    private static int sumOfDigits(int x) {
        int res = 0;
        while (x > 0) {
            res += (x % 10);
            x /= 10;
        }
        return res;
    }
}
