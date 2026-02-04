import java.util.*;

public class _1722C_WordGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            Map<String, List<Integer>> map = new HashMap<>();

            int person = 0;
            while (person < 3) {
                for (int i = 0; i < n; i++) {
                    String s = sc.next();
                    map.putIfAbsent(s, new ArrayList<>());
                    map.get(s).add(person);
                }
                person++;
            }

            int[] points = new int[3];

            for (String s : map.keySet()) {
                List<Integer> all = map.get(s);
                int total = all.size();

                if (total == 1) {
                    points[all.get(0)] += 3;
                } else if (total == 2) {
                    points[all.get(0)] += 1;
                    points[all.get(1)] += 1;
                }
            }

            for (int i = 0; i < 3; i++) {
                System.out.print(points[i] + " ");
            }
            System.out.println();
        }
    }
}
