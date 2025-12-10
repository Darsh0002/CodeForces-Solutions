import java.util.Scanner;

public class _1742C_Stripes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while (tc-- > 0) {
            char[][] grid = new char[8][8];

            for (int i = 0; i < 8; i++) {
                grid[i] = sc.next().toCharArray();
            }

            System.out.println(lastPainted(grid));
        }
    }

    private static char lastPainted(char[][] grid) {
        // Check if any row is full 'R'
        for (int i = 0; i < 8; i++) {
            boolean allR = true;
            for (int j = 0; j < 8; j++) {
                if (grid[i][j] != 'R') {
                    allR = false;
                    break;
                }
            }
            if (allR) return 'R';
        }

        // If no full row of R exists, answer must be B
        return 'B';
    }
}
