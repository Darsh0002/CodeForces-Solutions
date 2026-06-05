import java.util.Scanner;

public class _1020B_Badge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        if (!sc.hasNextInt()) return;

        int n = sc.nextInt();
        int[] p = new int[n + 1];

        // 1-based indexing
        for (int i = 1; i <= n; i++) {
            p[i] = sc.nextInt();
        }

        // Test for each student as the starting point
        for (int i = 1; i <= n; i++) {
            boolean[] vis = new boolean[n + 1];
            int curr = i;

            // Traverse until we find someone who is already visited
            while (!vis[curr]) {
                vis[curr] = true;
                curr = p[curr];
            }

            System.out.print(curr + " ");
        }
        sc.close();
    }
}