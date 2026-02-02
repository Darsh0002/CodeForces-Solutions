import java.util.Scanner;

public class _1873C_TargetPractice {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int[][] points = new int[10][10];
        countPoints(points);

        while (t-- > 0) {
            String[] s = new String[10];
            for (int i = 0; i < 10; i++) {
                s[i] = sc.next();
            }

            char[][] target = new char[10][10];

            int totalPoints = 0;
            for (int i = 0; i < 10; i++) {
                target[i] = s[i].toCharArray();
                for (int j = 0; j < 10; j++) {
                    if (target[i][j] != '.') {
                        totalPoints += points[i][j];
                    }
                }
            }
            System.out.println(totalPoints);
        }
    }

    private static void countPoints(int[][] points) {
        int startRow = 0, startCol = 0, endRow = 9, endCol = 9, point = 1;
        while (point <= 5) {
            for (int i = startRow; i <= endCol; i++) {
                points[startRow][i] = point;
            }
            startRow++;

            for (int i = startRow; i <= endRow; i++) {
                points[i][endCol] = point;
            }
            endCol--;

            for (int i = endCol; i >= startCol; i--) {
                points[endRow][i] = point;
            }
            endRow--;

            for (int i = endRow; i >= startRow; i--) {
                points[i][startCol] = point;
            }
            startCol++;

            point++;
        }
    }
}
