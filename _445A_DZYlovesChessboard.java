import java.util.Scanner;

public class _445A_DZYlovesChessboard {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        for (int i = 0; i < n; i++) {
            String row = sc.next();
            StringBuilder output = new StringBuilder();
            for (int j = 0; j < m; j++) {
                if (row.charAt(j) == '.') {
                    if ((i + j) % 2 == 0) {
                        output.append('B');
                    } else {
                        output.append('W');
                    }
                } else {
                    output.append('-');
                }
            }
            System.out.println(output);
        }
    }
}