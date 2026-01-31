import java.util.Scanner;

public class _1829B_BlankSpace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            int count = 0, max = 0;

            for (int i = 0; i < n; i++) {
                if (arr[i] == 0) {
                    count++;
                    max = Math.max(max, count);
                } else count = 0;
            }

            System.out.println(max);
        }
    }
}
