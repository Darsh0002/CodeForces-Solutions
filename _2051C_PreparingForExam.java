import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class _2051C_PreparingForExam {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while (tc-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int k = sc.nextInt();

            int[] a = new int[m];
            for (int i = 0; i < m; i++) a[i] = sc.nextInt();

            int[] q = new int[k];
            Set<Integer> knows = new HashSet<>();
            for (int i = 0; i < k; i++) {
                q[i] = sc.nextInt();
                knows.add(q[i]);
            }

            if (n - k > 1) {
                System.out.println("0".repeat(m));
                continue;
            }

            StringBuilder ansString = new StringBuilder();
            for (int excluded : a) {
                int currAns = 0;
                if (knows.contains(excluded)) {
                    if (knows.size() - 1 == n - 1) currAns = 1;
                } else {
                    if (knows.size() == n - 1) currAns = 1;
                }

                ansString.append(currAns);
            }

            System.out.println(ansString);
        }
    }
}
