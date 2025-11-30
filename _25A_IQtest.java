import java.util.Scanner;

public class _25A_IQtest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        int countEvens = 0, countOdds = 0, even = -1, odd = -1;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();

            if (arr[i] % 2 == 0) {
                countEvens++;
                even = i + 1;
            } else {
                countOdds++;
                odd = i + 1;
            }
        }

        System.out.println(countEvens > countOdds ? odd : even);
    }
}
