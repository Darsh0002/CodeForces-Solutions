import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class _1459B_MoveTurn {
    private record Pair(int x, int y) {
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Set<Pair> set = new HashSet<>();

        solve('N', 0, 0, 0, n, set);
        solve('S', 0, 0, 0, n, set);
        solve('E', 0, 0, 0, n, set);
        solve('W', 0, 0, 0, n, set);

        System.out.println(set.size());
    }

    private static void solve(char prev, int x, int y, int second, int n, Set<Pair> set) {
        if (second == n) {
            set.add(new Pair(x, y));
            return;
        }

        if (prev == 'N') {
            y++;
            solve('E', x, y, second + 1, n, set);
            solve('W', x, y, second + 1, n, set);
        }

        if (prev == 'S') {
            y--;
            solve('E', x, y, second + 1, n, set);
            solve('W', x, y, second + 1, n, set);
        }

        if (prev == 'E') {
            x++;
            solve('N', x, y, second + 1, n, set);
            solve('S', x, y, second + 1, n, set);
        }

        if (prev == 'W') {
            x--;
            solve('N', x, y, second + 1, n, set);
            solve('S', x, y, second + 1, n, set);
        }
    }
}
