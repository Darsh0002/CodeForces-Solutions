import java.util.Scanner;

public class _2204B_RightMaximum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while (tc-- > 0) {
            int n = sc.nextInt();

            int prevMax = 0, ops = 0;
            for (int i = 0; i < n; i++) {
                int num = sc.nextInt();

                if (num >= prevMax) {
                    ops++;
                    prevMax = num;
                }
            }

            System.out.println(ops);
        }
    }
}
