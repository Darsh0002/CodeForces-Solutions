import java.util.Scanner;

public class _702A_MaxIncrease {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = 1;
        while (tc-- > 0) {
            int n = sc.nextInt();

            int[] a = new int[n];

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }

            int maxLen = 1, currLen = 1;

            for (int i = 1; i < n; i++) {
                if (a[i] > a[i - 1]) {
                    currLen++;
                    maxLen = Math.max(maxLen, currLen);
                } else {
                    currLen = 1;
                }
            }

            System.out.println(maxLen);
        }
    }
}
