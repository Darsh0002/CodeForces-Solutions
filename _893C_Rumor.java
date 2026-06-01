import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class _893C_Rumor {
    private record Pair(int gold, int idx) {
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        Pair[] characters = new Pair[n + 1];

        for (int i = 1; i <= n; i++) {
            int g = sc.nextInt();
            characters[i] = new Pair(g, i);
        }

        Arrays.sort(characters, 1, n + 1, (a, b) -> a.gold - b.gold);

        List<List<Integer>> adj = new ArrayList<>();

        for (int i = 0; i < n + 1; i++) {
            adj.add(new ArrayList<>());
        }

        for (int i = 0; i < m; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();

            adj.get(x).add(y);
            adj.get(y).add(x);
        }

        System.out.println(minGoldToSpend(n, m, characters, adj));
    }

    private static long minGoldToSpend(int n, int m, Pair[] characters, List<List<Integer>> adj) {
        long spend = 0;

        boolean[] vis = new boolean[n + 1];

        for (int i = 1; i <= n; i++) {
            if (!vis[characters[i].idx]) {
                spend += characters[i].gold;
                dfs(characters[i].idx, vis, adj);
            }
        }

        return spend;
    }

    private static void dfs(int idx, boolean[] vis, List<List<Integer>> adj) {
        vis[idx] = true;

        for (int node : adj.get(idx)) {
            if (!vis[node]) dfs(node, vis, adj);
        }
    }
}
