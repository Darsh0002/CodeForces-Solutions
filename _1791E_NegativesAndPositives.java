import java.util.Scanner;

public class _1791E_NegativesAndPositives {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();

        while (tc-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];

            long absSum = 0;                  // Sum of absolute values
            int neg = 0;                     // Count of negative numbers
            long minNum = Long.MAX_VALUE;  // Smallest absolute value

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();

                // Count negatives
                if (arr[i] < 0) {
                    neg++;
                }

                // Treat every number as positive
                absSum += Math.abs(arr[i]);

                // Track smallest absolute value
                minNum = Math.min(minNum, Math.abs(arr[i]));
            }

            /*
             * Key Observation:
             *
             * Operation:
             * Choose adjacent elements and multiply both by -1.
             *
             * This operation changes the signs of TWO elements.
             *
             * Therefore:
             * - The parity (odd/even) of the number of negative
             *   elements NEVER changes.
             *
             * Examples:
             *
             * 2 negatives -> 0 negatives  (parity remains even)
             * 3 negatives -> 1 negative   (parity remains odd)
             *
             * So:
             * 1. If number of negatives is EVEN,
             *    we can make ALL numbers positive.
             *
             * 2. If number of negatives is ODD,
             *    we must leave exactly ONE number negative.
             *
             * To maximize the sum, the negative number should have
             * the smallest absolute value.
             */

            if (neg % 2 == 0) {

                // All numbers can become positive
                System.out.println(absSum);

            } else {

                /*
                 * One number must remain negative.
                 *
                 * Current sum assumes all numbers are positive.
                 *
                 * If x remains negative:
                 *
                 * +x becomes -x
                 *
                 * Difference = 2 * x
                 *
                 * To lose the minimum amount,
                 * choose the smallest absolute value.
                 */
                System.out.println(absSum - 2 * minNum);
            }
        }
    }
}