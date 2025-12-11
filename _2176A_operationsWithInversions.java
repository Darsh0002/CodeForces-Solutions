import java.util.Scanner;

public class _2176A_operationsWithInversions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tc = sc.nextInt();

        while (tc-- > 0) {
            int n = sc.nextInt();
            int prevMax = sc.nextInt();
            int ops = 0;

            for (int i = 1; i < n; i++) {
                int num = sc.nextInt();

                if (num < prevMax) ops++;

                prevMax = Math.max(prevMax, num);
            }

            System.out.println(ops);
        }
    }
}
