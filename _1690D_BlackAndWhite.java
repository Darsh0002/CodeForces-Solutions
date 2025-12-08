import java.util.Scanner;

public class _1690D_BlackAndWhite {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();

        while (tc-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();

            String stripe = sc.next();

            System.out.println(minCells(stripe, k, n));
        }
    }

    private static int minCells(String stripe, int k, int n) {
        int white = 0;
        int l = 0, r = 0;
        while (r < k) {
            if (stripe.charAt(r) == 'W') white++;

            r++;
        }
        int min = white;

        while (r < n) {
            if (stripe.charAt(l) == 'W') white--;// remove left

            l++;

            if (stripe.charAt(r) == 'W') white++;// add right

            min = Math.min(min, white);

            r++;
        }

        return min;
    }
}
