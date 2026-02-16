import java.util.Scanner;

public class _2195A_Sieve {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while (tc-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            boolean ss = false;
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();

                if (arr[i] == 67) ss = true;
            }
            System.out.println(ss ? "YES" : "NO");
        }
    }
}
