import java.util.Arrays;
import java.util.Scanner;

public class _1355B_YoungExplorers {
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

            int l = 0, r = 0, groups = 0;

            for (; r < n; r++) {
                if (r - l + 1 >= arr[r]) {
                    groups++;
                    l = r + 1;
                }
            }

            System.out.println(groups);
        }
    }
}
