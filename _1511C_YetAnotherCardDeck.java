import java.util.Arrays;
import java.util.Scanner;

public class _1511C_YetAnotherCardDeck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = 1;
        while (tc-- > 0) {
            int n = sc.nextInt();
            int q = sc.nextInt();

            // store first position of every color
            int[] firstPos = new int[51];
            Arrays.fill(firstPos, -1);

            for (int i = 1; i <= n; i++) {
                int color = sc.nextInt();

                if (firstPos[color] == -1)
                    firstPos[color] = i; // 1-indexed
            }

            while (q-- > 0) {
                int color = sc.nextInt();
                int ans = firstPos[color];

                System.out.print(ans + " ");

                // Update the positions of all colors that are above the queried color
                for (int i = 1; i <= 50; i++) {
                    if (firstPos[i] < ans) {
                        firstPos[i]++;
                    }
                }
                firstPos[color] = 1; // Move the queried color to the top
            }
        }
    }
}
