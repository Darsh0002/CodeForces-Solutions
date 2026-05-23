import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class _1399C_BoatsCompetition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();

        while (tc-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }

            int maxTeams = 0;

            // try all sums
            for (int sum = 2; sum <= 100; sum++) {
                int teams = makeTeams(sum, a, n);
                maxTeams = Math.max(maxTeams, teams);
            }

            System.out.println(maxTeams);
        }
    }

    private static int makeTeams(int targetSum, int[] a, int n) {
        Map<Integer, Integer> map = new HashMap<>();
        int pairs = 0;

        for (int j = 0; j < n; j++) {
            int req = targetSum - a[j];

            if (map.containsKey(req)) {
                pairs++;

                map.put(req, map.get(req) - 1);
                if (map.get(req) == 0)
                    map.remove(req);
            } else {
                map.put(a[j], map.getOrDefault(a[j], 0) + 1);
            }
        }

        return pairs;
    }
}