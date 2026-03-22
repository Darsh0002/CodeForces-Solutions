import java.util.Scanner;

public class _1324C_FrogJumps {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while (tc-- > 0) {
            String s = sc.next();
            int n = s.length();

            int maxDiff = 0; // max diff between two R's
            int prev = 0;

            for (int i = 0; i < n; i++) {
                if (s.charAt(i) == 'R') {
                    maxDiff = Math.max(maxDiff, i + 1 - prev);
                    prev = i + 1;
                }
            }
            maxDiff = Math.max(maxDiff, n + 1 - prev); // count n+1 th position
            System.out.println(maxDiff);
        }
    }
}
