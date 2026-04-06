import java.util.*;

public class _1206B_MakeProductEqualOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        long cost = 0;
        int neg = 0, zero = 0;

        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();

            if (x > 0) {
                cost += x - 1;
            }
            else if (x < 0) {
                cost += Math.abs(x + 1);
                neg++;
            }
            else {
                cost += 1;
                zero++;
            }
        }

        if (neg % 2 == 1 && zero == 0) {
            cost += 2;
        }

        System.out.println(cost);
    }
}