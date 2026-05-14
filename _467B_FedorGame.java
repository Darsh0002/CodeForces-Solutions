import java.util.Scanner;

public class _467B_FedorGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();

        int[] x = new int[m];
        for (int i = 0; i < m; i++) {
            x[i] = sc.nextInt();
        }
        int fedor = sc.nextInt();

        int frnds = 0;
        for (int i = 0; i < m; i++) {
            int f = fedor;
            int xi = x[i];
            int differ = 0;

            while (f > 0 || xi > 0) {
                if ((f & 1) != (xi & 1))
                    differ++;

                xi = (xi >> 1);
                f = (f >> 1);
            }

            if (differ <= k)
                frnds++;
        }
        System.out.println(frnds);
    }
}
