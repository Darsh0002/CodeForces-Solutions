import java.util.Scanner;

public class _2256A_Blackboard {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tc = sc.nextInt();

        while (tc-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            int max = Math.max(a, Math.max(b, c));
            int min = Math.min(a, Math.min(b, c));
            int mid = (a + b + c) - max - min;

            if (mid + min < max) {
                max = mid + min;
            }

            System.out.println(max - min);
        }
    }
}
