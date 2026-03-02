import java.util.Scanner;

public class _1447B_NumbersBox {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int total = n * m;

            int sum = 0,
                    min = Integer.MAX_VALUE,
                    countNeg = 0;

            for (int i = 0; i < total; i++) {
                int num = sc.nextInt();

                sum += Math.abs(num);
                min = Math.min(min, Math.abs(num));
                if (num < 0) countNeg++;
            }

            if (countNeg % 2 == 0) {
                System.out.println(sum);
            } else {
                System.out.println(sum - min * 2);
            }
        }
    }
}
