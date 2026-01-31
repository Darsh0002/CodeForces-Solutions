import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class _1766A_ExtremelyRound {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        List<Integer> list = new ArrayList<>();
        for (int j = 0; j <= 6; j++) {
            for (int i = 1; i <= 9; i++) {
                list.add((int) (i * Math.pow(10, j)));
            }
        }

        while (t-- > 0) {
            int n = sc.nextInt();

            int count = 0;
            for (int i = 0; i < 64; i++) {
                if (list.get(i) <= n)
                    count++;
                else
                    break;
            }
            System.out.println(count);
        }
    }
}
