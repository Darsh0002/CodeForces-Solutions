import java.util.Arrays;
import java.util.Scanner;

public class _2189A_TableWithNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while (tc-- > 0) {
            int n = sc.nextInt();
            int h = sc.nextInt();
            int l = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            Arrays.sort(arr);

            int i = 0, j = n - 1;
            int min = Math.min(h, l);
            int max = Math.max(h, l);

            while (j>=0 && arr[j] > max) {
                j--;
            }
            int count = 0;
            while (i < j) {
                if (arr[i] <= min && arr[j] <= max) {
                    count++;
                    i++;
                    j--;
                }else {
                    break;
                }
            }
            System.out.println(count);
        }
    }
}
