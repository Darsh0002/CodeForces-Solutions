import java.util.*;

public class _1433D_DistrictsConnection {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();

        while (tc-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            int diff = -1;

            // find first different gang
            for (int i = 1; i < n; i++) {
                if (arr[i] != arr[0]) {
                    diff = i;
                    break;
                }
            }

            if (diff == -1) {
                System.out.println("NO");
                continue;
            }

            System.out.println("YES");

            // connect same gang with diff
            for (int i = 1; i < n; i++) {
                if (arr[i] == arr[0]) {
                    System.out.println((diff + 1) + " " + (i + 1));
                }
            }

            // connect different gang with root
            for (int i = 1; i < n; i++) {
                if (arr[i] != arr[0]) {
                    System.out.println(1 + " " + (i + 1));
                }
            }
        }
    }
}