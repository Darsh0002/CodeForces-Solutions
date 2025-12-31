import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class _1742B_Increasing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            long[] arr = new long[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextLong();
            }
            Set<Long> set = new HashSet<>();
            boolean canRearrange = true;
            for (int i = 0; i < n; i++) {
                if (set.contains(arr[i])) {
                    System.out.println("NO");
                    canRearrange = false;
                    break;
                }
                set.add(arr[i]);
            }

            if (canRearrange) System.out.println("YES");
        }
    }
}
