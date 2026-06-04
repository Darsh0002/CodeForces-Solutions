import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class _1167C_NewsDistribution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        List<List<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < n + 1; i++) {
            adj.add(new ArrayList<>());
        }

        for (int i = 0; i < m; i++) {
            int k = sc.nextInt();
            int[] grp = new int[k];
            for (int j = 0; j < k; j++) {
                grp[j] = sc.nextInt();
            }

            addInAdjacencyList(grp, adj, k);
        }

        boolean[] vis = new boolean[n + 1];
        int[] ans = new int[n + 1];

        for (int i = 1; i <= n; i++) {
            if (!vis[i]) {

                List<Integer> component = new ArrayList<>();

                dfs(i, vis, adj, component);

                int size = component.size();

                for (int node : component) {
                    ans[node] = size;
                }
            }
        }
        for (int i = 1; i < n + 1; i++) {
            System.out.print(ans[i] + " ");
        }
        System.out.println();
    }

    private static void dfs(int node, boolean[] vis,
                            List<List<Integer>> adj,
                            List<Integer> component) {

        vis[node] = true;
        component.add(node);

        for (int next : adj.get(node)) {
            if (!vis[next]) {
                dfs(next, vis, adj, component);
            }
        }
    }

    private static void addInAdjacencyList(int[] grp, List<List<Integer>> adj, int k) {
        for (int i = 1; i < k; i++) {
            int u = grp[i - 1];
            int v = grp[i];

            adj.get(u).add(v);
            adj.get(v).add(u);
        }
    }
}
