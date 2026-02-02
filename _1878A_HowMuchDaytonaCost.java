import java.util.Scanner;

public class _1878A_HowMuchDaytonaCost {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] arr = new int[n];
            boolean kExists = false;

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();

                if (arr[i] == k) kExists = true;
            }

            if (kExists) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
