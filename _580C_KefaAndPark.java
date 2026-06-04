import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class _580C_KefaAndPark {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] cats = new int[n + 1];

        for (int i = 1; i < n + 1; i++) {
            cats[i] = sc.nextInt();
        }

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

        boolean[] vis = new boolean[n + 1];

        System.out.println(dfs(1, cats[1], vis, adj, cats, m));
    }

    private static long dfs(int node, int consecutiveCats,
                            boolean[] vis,
                            List<List<Integer>> adj,
                            int[] cats,
                            int m) {

        vis[node] = true;

        // Invalid path if consecutive cats exceed limit
        if (consecutiveCats > m)
            return 0;

        // Reset consecutive count if current node has no cat
        if (cats[node] == 0)
            consecutiveCats = 0;

        List<Integer> neighbours = adj.get(node);

        // Leaf node reached
        // In a tree, a leaf has only one neighbour (its parent)
        if (neighbours.size() == 1 && vis[neighbours.get(0)])
            return 1;

        long count = 0;

        // Explore all children
        for (int next : neighbours) {
            if (!vis[next]) {

                // If next node has a cat, count increases by 1
                // If next node has no cat, it will be reset inside DFS
                count += dfs(next,
                        consecutiveCats + cats[next],
                        vis,
                        adj,
                        cats,
                        m);
            }
        }

        return count;
    }
}