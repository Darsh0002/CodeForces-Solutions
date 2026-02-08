import java.util.Scanner;

public class _2007B_IndexMaxValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while (tc-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();

            long[] nums = new long[n];
            long max = 0;
            for (int i = 0; i < n; i++) {
                nums[i] = sc.nextInt();
                max = Math.max(max, nums[i]);
            }

            while (m-- > 0) {
                char op = sc.next().charAt(0);
                int l = sc.nextInt(), r = sc.nextInt();

                if (l <= max && max <= r) {
                    if (op == '+') max++;
                    else max--;
                }

                System.out.print(max + " ");
            }
            System.out.println();
        }
    }
}
