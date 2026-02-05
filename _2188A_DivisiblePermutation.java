import java.util.Scanner;

public class _2188A_DivisiblePermutation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while (tc-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];

            int a = n, b = 1;
            for (int i = n - 1; i >= 0; i--) {
                if (i % 2 == 0) arr[i] = b++;
                else arr[i] = a--;
            }

            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }
}
