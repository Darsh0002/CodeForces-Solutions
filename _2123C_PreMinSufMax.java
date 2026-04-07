import java.util.Scanner;

public class _2123C_PreMinSufMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();

        while (tc-- > 0) {
            int n = sc.nextInt();
            int[] nums = new int[n];

            for (int i = 0; i < n; i++) {
                nums[i] = sc.nextInt();
            }

            int[] preMin = new int[n];
            int[] sufMax = new int[n];

            // prefix min
            preMin[0] = nums[0];
            for (int i = 1; i < n; i++) {
                preMin[i] = Math.min(preMin[i - 1], nums[i]);
            }

            // suffix max
            sufMax[n - 1] = nums[n - 1];
            for (int i = n - 2; i >= 0; i--) {
                sufMax[i] = Math.max(sufMax[i + 1], nums[i]);
            }

            for (int i = 0; i < n; i++) {
                if (nums[i] == preMin[i] || nums[i] == sufMax[i]) {
                    System.out.print(1);
                } else {
                    System.out.print(0);
                }
            }
            System.out.println();
        }
    }
}