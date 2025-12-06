import java.util.Scanner;

public class _1695C_zeroPath {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tc = sc.nextInt();
        while (tc-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();

            int[][] grid = new int[n][m];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    grid[i][j] = sc.nextInt();
                }
            }
            System.out.println(zeroPathExists(0, 0, 0, grid, n, m) ? "YES" : "NO");
        }

    }

    private static boolean zeroPathExists(int row, int col, int sum, int[][] grid, int n, int m) {
        if (row >= n || col >= m) return false;

        sum += grid[row][col];
        if (row == n - 1 && col == m - 1) {
            return sum == 0;
        }

        boolean right = zeroPathExists(row, col + 1, sum, grid, n, m);
        if (right) return true;

        boolean down = zeroPathExists(row + 1, col, sum, grid, n, m);
        if (down) return true;

        return false;
    }

}