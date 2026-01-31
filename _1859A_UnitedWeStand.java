import java.util.Arrays;
import java.util.Scanner;

public class _1859A_UnitedWeStand {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            Arrays.sort(arr);

            if (arr[0] == arr[n - 1]) {
                System.out.println(-1);
                continue;
            }

            int c = n - 1;
            while (c > 1) {
                if (arr[c] == arr[c - 1]) {
                    c--;
                } else {
                    break;
                }
            }

            // 4 12 12 12 12
            //    c
            // 0  1  2  3  4

            System.out.println(c + " " + (n - c));
            for (int i = 0; i < c; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();

            for (int i = c; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }

}
