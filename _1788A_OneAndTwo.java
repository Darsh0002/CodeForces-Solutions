import java.util.Scanner;

public class _1788A_OneAndTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];

            int totalTwo = 0;
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
                if (arr[i] == 2) totalTwo++;
            }

            // If total number of 2s is odd, impossible
            if (totalTwo % 2 != 0) {
                System.out.println(-1);
                continue;
            }

            int leftTwo = 0;
            for (int i = 0; i < n - 1; i++) {
                if (arr[i] == 2) leftTwo++;

                if (leftTwo == totalTwo / 2) {
                    System.out.println(i + 1); // 1-based index
                    break;
                }
            }
        }
    }
}
