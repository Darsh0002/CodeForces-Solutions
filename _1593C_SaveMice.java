import java.util.Arrays;
import java.util.Scanner;

public class _1593C_SaveMice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();

            int[] pos = new int[k];
            for (int i = 0; i < k; i++) {
                pos[i] = sc.nextInt();
            }

            Arrays.sort(pos);
            int i = k - 1;

            int saved = 0;
            int cat = 0;
            while (i >= 0 && cat < pos[i]) {
                int req = n - pos[i];
                saved++;

                cat += req;
                i--;
            }
            System.out.println(saved);
        }
    }
}
