import java.util.Scanner;

public class _1360E_Polygon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();

        while (tc-- > 0) {
            int n = sc.nextInt();
            char[][] grid = new char[n][n];

            for (int i = 0; i < n; i++) {
                String s = sc.next();
                grid[i] = s.toCharArray();
            }

            boolean ok = true;
            for (int i = 0; i < n - 1; i++) {
                for (int j = 0; j < n - 1; j++) {
                    if (grid[i][j] == '1') {
                        // A '1' is invalid ONLY if BOTH the cell below and the cell to the right are '0'
                        if (grid[i + 1][j] == '0' && grid[i][j + 1] == '0') {
                            ok = false;
                            break;
                        }
                    }
                }

                if (!ok) break;
            }

            System.out.println(ok ? "YES" : "NO");
        }
    }
}
