import java.util.Arrays;
import java.util.Scanner;

public class _456A_Laptops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[][] arr = new int[n][2];

        for (int i = 0; i < n; i++) {
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
        }

        Arrays.sort(arr, (a, b) -> a[0] - b[0]);

        int quality = arr[0][1];
        for (int[] pair : arr) {
            if (pair[1] < quality) {
                System.out.println("Happy Alex");
                return;
            } else {
                quality = pair[1];
            }
        }
        System.out.println("Poor Alex");
    }
}
