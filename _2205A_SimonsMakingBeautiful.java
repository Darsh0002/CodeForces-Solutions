import java.util.Scanner;

public class _2205A_SimonsMakingBeautiful {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();

        while (tc-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];

            int max = Integer.MIN_VALUE;
            int maxIdx = -1;
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
                if (max < a[i]) {
                    max = a[i];
                    maxIdx = i;
                }
            }

            // swap maximum element with first element
            int temp = a[maxIdx];
            a[maxIdx] = a[0];
            a[0] = temp;

            for (int i = 0; i < n; i++) {
                System.out.print(a[i] + " ");
            }
            System.out.println();
        }
    }
}
