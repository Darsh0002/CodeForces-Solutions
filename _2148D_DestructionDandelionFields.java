import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class _2148D_DestructionDandelionFields {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();

        while (tc-- > 0) {
            int n = sc.nextInt();
            List<Long> odds = new ArrayList<>();

            long evenSum = 0;

            for (int i = 0; i < n; i++) {
                long num = sc.nextLong();

                if ((num & 1) == 0) {
                    evenSum += num;
                } else {
                    odds.add(num);
                }
            }
            int m = odds.size();
            if (m == 0) {
                System.out.println(0);
                continue;
            }

            long oddSum = odds.getFirst(); // we will start from maximum odd number
            // once we started lawnmower we will cut all even dandelions
            // then will use smaller odd numbers for turn off, and bigger numbers for turn on

            odds.sort(Collections.reverseOrder());

            int i = 1, j = m - 1;
            while (i < j) {
                oddSum += odds.get(i);
                i++;
                j--;
            }

            System.out.println(evenSum + oddSum);
        }
    }
}
