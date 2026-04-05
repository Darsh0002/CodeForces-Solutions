import java.util.*;

public class _1906A_EasyABC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[][] grid = new char[3][3];
        for (int i = 0; i < 3; i++) {
            grid[i] = sc.next().toCharArray();
        }

        List<String> words = new ArrayList<>();
        boolean[][] visited = new boolean[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                visited[i][j] = true;
                solve(i, j, "" + grid[i][j], grid, visited, words);
                visited[i][j] = false;
            }
        }

        Collections.sort(words);
        System.out.println(words.get(0));
    }

    private static void solve(int r, int c, String curr, char[][] grid, boolean[][] visited, List<String> words) {
        if (curr.length() == 3) {
            words.add(curr);
            return;
        }

        // Check all 8 directions
        for (int dr = -1; dr <= 1; dr++) {
            for (int dc = -1; dc <= 1; dc++) {
                int nr = r + dr;
                int nc = c + dc;

                if (nr >= 0 && nr < 3 && nc >= 0 && nc < 3 && !visited[nr][nc]) {
                    visited[nr][nc] = true;
                    solve(nr, nc, curr + grid[nr][nc], grid, visited, words);
                    visited[nr][nc] = false; // Backtrack
                }
            }
        }
    }
}