import java.util.Arrays;
import java.util.Scanner;

public class _2143B_Discounts {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();

        while (tc-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] a = new int[n];
            int[] b = new int[k];

            long total = 0;

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
                total += a[i];
            }

            for (int i = 0; i < k; i++) {
                b[i] = sc.nextInt();
            }

            Arrays.sort(a);
            Arrays.sort(b);

            int i = 0;        // pointer for discounts
            int j = n - 1;    // pointer for largest price (end of array)

            // apply discounts greedily
            while (i < k) {

                // check if we have enough items for current discount
                if (j - b[i] + 1 >= 0) {

                    // remove the cheapest item in current group (free item)
                    total -= a[j - b[i] + 1];

                    // move j to next group
                    j -= b[i];
                    i++;
                } else {
                    break; // not enough items left
                }
            }
            System.out.println(total);
        }
    }
}
