import java.util.Arrays;
import java.util.Scanner;

public class _1843A_SashaArrayColoring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while (tc-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            Arrays.sort(arr);
            int cost = 0;
            int i = 0, j = n - 1;
            while (i < j) {
                cost += arr[j--] - arr[i++];
            }
            System.out.println(cost);
        }
    }
}
