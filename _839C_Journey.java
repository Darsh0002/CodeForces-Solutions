import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class _839C_Journey {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        List<List<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < n + 1; i++) {
            adj.add(new ArrayList<>());
        }

        for (int i = 0; i < n - 1; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();

            adj.get(u).add(v);
            adj.get(v).add(u);
        }

        if (n == 1) {
            System.out.println("0.000000000000000");
            return;
        }

        boolean[] vis = new boolean[n + 1];

        System.out.printf("%.15f%n", dfs(1, vis, adj));
    }

    private static double dfs(int node, boolean[] vis, List<List<Integer>> adj) {
        vis[node] = true;

        double sum = 0;
        int count = 0;

        for (int next : adj.get(node)) {
            if (!vis[next]) {
                count++;
                sum += dfs(next, vis, adj);
            }
        }

        // Base Case: If it's a leaf node, the journey stops, so 0 additional steps.
        if (count == 0) {
            return 0.0;
        }

        // Expected value formula: 1 step down + average of the branches
        return 1.0 + (sum / count);
    }
}
