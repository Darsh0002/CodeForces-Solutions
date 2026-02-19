import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class _1895B_OlyaGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while (tc-- > 0) {
            int n = sc.nextInt();
            List<List<Long>> list = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                List<Long> curr = new ArrayList<>();
                int size = sc.nextInt();
                for (int j = 0; j < size; j++) {
                    curr.add(sc.nextLong());
                }
                list.add(curr);
            }
            // -------------------------------------------

            for (int i = 0; i < n; i++) {
                Collections.sort(list.get(i));
            }

            List<Long> firstMins = new ArrayList<>();
            list.forEach(l -> {
                firstMins.add(l.get(0));
            });

            long minimumOfFirst = Long.MAX_VALUE;
            for (long num : firstMins) {
                minimumOfFirst = Math.min(minimumOfFirst, num);
            }

            List<Long> secMins = new ArrayList<>();
            list.forEach(l -> {
                secMins.add(l.get(1));
            });
            Collections.sort(secMins);

            long sumOfSecondSmall = 0;
            for (long num : secMins) {
                sumOfSecondSmall += num;
            }

            System.out.println(sumOfSecondSmall - secMins.getFirst() + minimumOfFirst);
        }
    }
}
