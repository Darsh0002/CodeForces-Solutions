import java.util.Scanner;

public class _459B_PashmakAndFlowers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int countMin = 0;
        int countMax = 0;

        for (int i = 0; i < n; i++) {
            int current = sc.nextInt();

            // Update minimum
            if (current < min) {
                min = current;
                countMin = 1;
            } else if (current == min) {
                countMin++;
            }

            // Update maximum
            if (current > max) {
                max = current;
                countMax = 1;
            } else if (current == max) {
                countMax++;
            }
        }

        int maxBeautyDiff = max - min;
        long pairs;

        // If all elements are identical, we use the combination formula nC2
        if (min == max) {
            pairs = (long) n * (n - 1) / 2;
        } else {
            pairs = (long) countMin * countMax;
        }

        System.out.println(maxBeautyDiff + " " + pairs);
    }
}