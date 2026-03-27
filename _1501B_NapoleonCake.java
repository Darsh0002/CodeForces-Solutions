import java.util.Scanner;

public class _1501B_NapoleonCake {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while (tc-- > 0) {
            int n = sc.nextInt();

            int[] arr = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            boolean[] layers = new boolean[n];
            int count = 0;
            for (int i = n - 1; i >= 0; i--) {
                count = Math.max(count, arr[i]);

                if (count > 0) {
                    layers[i] = true;
                    count--;
                }
            }

            for (boolean drenched : layers) {
                System.out.print(drenched ? "1 " : "0 ");
            }
            System.out.println();
        }
    }
}
