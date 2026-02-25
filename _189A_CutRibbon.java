import java.util.Scanner;

public class _189A_CutRibbon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int sum = a + b + c;
        int min = Math.min(a, Math.min(b, c));
        int max = Math.max(a, Math.max(b, c));
        int mid = sum - min - max;

        int ans = 0;
        for (int k = 0; (k * max) <= n; k++) {
            for (int j = 0; (j * mid) <= n; j++) {
                for (int i = 0; (i * min) <= n; i++) {
                    if ((min * i) + (mid * j) + (max * k) == n) {
                        ans = Math.max(ans, i + j + k);
                    }
                }
            }
        }
        System.out.println(ans);
    }
}
