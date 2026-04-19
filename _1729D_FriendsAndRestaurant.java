import java.util.Arrays;
import java.util.Scanner;

public class _1729D_FriendsAndRestaurant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while (tc-- > 0) {
            int n = sc.nextInt();

            int[][] pairs = new int[n][2]; // [total, spend] for each

            for (int i = 0; i < n; i++)
                pairs[i][1] = sc.nextInt();

            for (int i = 0; i < n; i++)
                pairs[i][0] = sc.nextInt();

            // sort based on savings(total - spend)
            Arrays.sort(pairs, (a, b) -> (a[0] - a[1]) - (b[0] - b[1]));

            int i = 0, j = n - 1, days = 0;
            while (i < j) {
                long total = pairs[i][0] + pairs[j][0];
                long spend = pairs[i][1] + pairs[j][1];

                // if sufficient than they can make group and go to restaurant
                if (total >= spend) {
                    days++;
                    i++;
                    j--;
                } else {
                    i++; // try bigger value
                }
            }
            System.out.println(days);
        }
    }
}
