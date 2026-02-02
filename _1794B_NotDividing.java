import java.util.Scanner;

public class _1794B_NotDividing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            int ops = 2 * n;

            for (int i = 0; i < n - 1; i++) {
                if (arr[i] == 1) {
                    arr[i]++;
                    ops--;

                    if (i != 0 && arr[i] == arr[i - 1]) {
                        arr[i]++;
                        ops--;
                    }
                }

                while (arr[i + 1] % arr[i] == 0 && ops > 0) {
                    arr[i + 1]++;
                    ops--;
                }
            }

            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }
}
