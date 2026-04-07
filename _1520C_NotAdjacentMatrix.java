import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class _1520C_NotAdjacentMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while (tc-- > 0) {
            int n = sc.nextInt();

            if (n == 2) {
                System.out.println(-1);
                continue;
            }

            int num = 1, limit = n * n;
            List<Integer> ans = new ArrayList<>();

            while (num <= limit) {
                ans.add(num);
                num += 2;
            }

            num = 2;
            while (num <= limit) {
                ans.add(num);
                num += 2;
            }

            int idx = 0;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print(ans.get(idx++) + " ");
                }
                System.out.println();
            }

        }
    }
}
