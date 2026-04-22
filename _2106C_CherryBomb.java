import java.util.Scanner;

public class _2106C_CherryBomb {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tc = sc.nextInt();
        while (tc-- > 0) {

            int n = sc.nextInt();
            int k = sc.nextInt(); // max allowed value for b[i]

            int[] a = new int[n];
            for (int i = 0; i < n; i++) a[i] = sc.nextInt();

            int[] b = new int[n];
            for (int i = 0; i < n; i++) b[i] = sc.nextInt();

            int x_min = Integer.MAX_VALUE; // minimum a[i] where b[i] = -1
            int x_max = Integer.MIN_VALUE; // maximum a[i] where b[i] = -1

            int sum = -1; // target sum (a[i] + b[i]) for known pairs
            boolean complementary = true; // flag to check consistency

            for (int i = 0; i < n; i++) {

                if (b[i] == -1) {
                    // track range of a[i] for unknown b[i]
                    x_max = Math.max(x_max, a[i]);
                    x_min = Math.min(x_min, a[i]);
                } else {
                    // determine fixed sum for valid pairs
                    if (sum == -1) {
                        sum = a[i] + b[i]; // initialize target sum
                    } else {
                        int currSum = a[i] + b[i];

                        // all known pairs must have same sum
                        if (currSum != sum) {
                            complementary = false;
                            break;
                        }
                    }
                }
            }

            // case 1: inconsistent known pairs → no solution
            if (!complementary) {
                System.out.println(0);
            }

            // case 2: no unknown values → exactly one valid configuration
            else if (x_min == Integer.MAX_VALUE && x_max == Integer.MIN_VALUE) {
                System.out.println(1);
            }

            // case 3: known sum exists → check if unknowns can satisfy it
            else if (sum != -1) {

                // invalid if sum is out of feasible range
                if (x_min + k < sum || sum < x_max) {
                    System.out.println(0);
                } else {
                    System.out.println(1);
                }
            }

            // case 4: all b[i] are unknown → count valid sums
            else {
                // number of possible sums = (max possible - min possible + 1)
                System.out.println(x_min + k - x_max + 1);
            }
        }
    }
}