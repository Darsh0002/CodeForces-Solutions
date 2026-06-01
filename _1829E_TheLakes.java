import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class _1829E_TheLakes {
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

            System.out.println(largestVolumeOfLake(arr,n,m));
        }
    }

    private static long largestVolumeOfLake(int[][] grid, int n, int m) {
        boolean[][] vis = new boolean[n][m];

        long ans = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (!vis[i][j] && grid[i][j] > 0) {
                    long volume = bfs(i, j, vis, grid, n, m);

                    ans = Math.max(ans, volume);
                }
            }
        }

        return ans;
    }

    private static long bfs(int startI, int startJ, boolean[][] vis, int[][] grid, int n, int m) {
        int[] x = {-1, 0, 1, 0};
        int[] y = {0, 1, 0, -1};

        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{startI, startJ});
        vis[startI][startJ] = true;

        long sum = 0;

        while (!queue.isEmpty()) {
            int[] curr = queue.poll();
            int i = curr[0];
            int j = curr[1];
            sum += grid[i][j];

            for (int d = 0; d < 4; d++) {
                int newX = i + x[d];
                int newY = j + y[d];

                if (newX >= 0 && newX < n && newY >= 0 && newY < m &&
                        grid[newX][newY] > 0 && !vis[newX][newY]) {

                    vis[newX][newY] = true;
                    queue.add(new int[]{newX, newY});
                }
            }
        }
        return sum;
    }

    private static long dfs(int i, int j, boolean[][] vis, int[][] grid, int n, int m) {
        int[] x = {-1, 0, 1, 0};
        int[] y = {0, 1, 0, -1};

        vis[i][j] = true;
        long sum = grid[i][j];

        for (int d = 0; d < 4; d++) {
            int newX = i + x[d];
            int newY = j + y[d];

            if (newX >= 0 && newX < n &&
                    newY >= 0 && newY < m &&
                    grid[newX][newY] > 0 &&
                    !vis[newX][newY]) {

                sum += dfs(newX, newY, vis, grid, n, m);
            }
        }

        return sum;
    }
}
