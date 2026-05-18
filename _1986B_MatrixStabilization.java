import java.util.Scanner;

public class _1986B_MatrixStabilization {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tc = sc.nextInt();

        while (tc-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();

            int[][] arr = new int[n][m];

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    arr[i][j] = sc.nextInt();
                }
            }

            for (int j = 0; j < m; j++) {
                for (int i = 0; i < n; i++) {
                    int up = (i - 1 >= 0) ? arr[i - 1][j] : Integer.MIN_VALUE;
                    int down = (i + 1 < n) ? arr[i + 1][j] : Integer.MIN_VALUE;
                    int left = (j - 1 >= 0) ? arr[i][j - 1] : Integer.MIN_VALUE;
                    int right = (j + 1 < m) ? arr[i][j + 1] : Integer.MIN_VALUE;

                    int curr = arr[i][j];

                    if (curr > up && curr > down && curr > left && curr > right) {
                        arr[i][j] = Math.max(up, Math.max(down, Math.max(left, right)));
                    }
                }
            }

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    System.out.print(arr[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}
