import java.util.Arrays;
import java.util.Scanner;

public class _1669G_FallDown {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while (tc-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();

            char[][] grid = new char[n][m];
            for (int i = 0; i < n; i++) {
                grid[i] = sc.next().toCharArray();
            }

            char[][] ans = new char[n][m];
            for (char[] r : ans) Arrays.fill(r, '.');

            for (int col = 0; col < m; col++) {
                int stones = 0;
                for (int row = 0; row < n; row++) {
                    if (grid[row][col] == '*') {
                        stones++;
                    } else if (grid[row][col] == 'o') {
                        ans[row][col] = 'o';
                        buildAnswer(stones, ans, row - 1, col);
                        stones = 0;
                        continue;
                    }

                    if (row == n - 1) {
                        buildAnswer(stones, ans, row, col);
                    }
                }
            }

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    System.out.print(ans[i][j]);
                }
                System.out.println();
            }
            System.out.println();
        }
    }

    private static void buildAnswer(int stones, char[][] ans, int row, int col) {
        while (stones > 0) {
            ans[row--][col] = '*';
            stones--;
        }
    }
}
