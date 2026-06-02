import java.util.*;

public class _1941D_RudolfBallGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();

        while (tc-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int x = sc.nextInt();

            Set<Integer> currPlayers = new HashSet<>();
            currPlayers.add(x);

            while (m-- > 0) {
                int r = sc.nextInt();
                char c = sc.next().charAt(0);

                Set<Integer> nextPlayers = new HashSet<>();

                for (int p : currPlayers) {
                    // 1-based indexing

                    int cw = (p + r) % n;
                    if (cw == 0) cw = n;

                    int ccw = (p - r + n) % n;
                    if (ccw == 0) ccw = n;

                    if (c == '0' || c == '?') {
                        nextPlayers.add(cw);
                    }
                    if (c == '1' || c == '?') {
                        nextPlayers.add(ccw);
                    }
                }
                // Move to the next state
                currPlayers = nextPlayers;
            }

            // Transfer to TreeSet to automatically sort in increasing order for output
            Set<Integer> sortedPlayers = new TreeSet<>(currPlayers);

            System.out.println(sortedPlayers.size());
            for (int player : sortedPlayers) {
                System.out.print(player + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}