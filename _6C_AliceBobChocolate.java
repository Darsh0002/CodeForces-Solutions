import java.util.Scanner;

public class _6C_AliceBobChocolate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = 1;
        while (tc-- > 0) {
            int n = sc.nextInt();

            int[] a = new int[n];

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }

            int i = 0, pref = 0, j = n-1, suf = 0, countAlice = 0, countBob=0;

            while (i <= j) {
                if (pref <= suf) {
                    pref += a[i];
                    countAlice++;
                    i++;
                } else {
                    suf += a[j];
                    countBob++;
                    j--;
                }
            }

            System.out.println(countAlice + " " + countBob);
        }
    }
}
