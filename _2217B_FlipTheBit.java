import java.util.Scanner;

public class _2217B_FlipTheBit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while (tc-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();

            int[] a = new int[n];
            for (int i = 0; i < n; i++) a[i] = sc.nextInt();

            int p = sc.nextInt();

            int x = a[p - 1];

            int ops = 0;
            int l = 0, r = n - 1; // l = [0,p-1] & r = [p-1,n-1]
            while (true) {
                while (l < p && a[l] == x) l++;
                if (l == p) l = p - 1;

                while (r >= 0 && a[r] == x) r--;

                // all are equal to x
                if (r < l) break;

                if (r < p) r = p - 1;

                // flip bits between [l,r]
                ops++;
                for (int i = l; i <= r; i++) {
                    if (a[i] == 1) a[i] = 0;
                    else a[i] = 1;
                }
            }
            System.out.println(ops);

        }
    }
}
