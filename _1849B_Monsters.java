import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

public class _1849B_Monsters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tc = sc.nextInt();

        while (tc-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] arr = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            List<Integer> ans = solve(arr, n, k);
            ans.forEach(a -> System.out.print(a + " "));
            System.out.println();
        }
    }

    private static List<Integer> solve(int[] arr, int n, int k) {
        List<Integer> ans = new ArrayList<>();

        PriorityQueue<int[]> pq = new PriorityQueue<>(
                (x, y) -> {
                    if (x[0] != y[0]) return y[0] - x[0];   // larger a first
                    return x[1] - y[1];                    // if a equal → smaller b first
                }
        );

        for (int i = 0; i < n; i++) {
            arr[i] = arr[i] % k;
            if (arr[i] == 0) ans.add(i + 1);
            else pq.add(new int[]{arr[i], i + 1});
        }

        while (!pq.isEmpty()){
            ans.add(pq.poll()[1]);
        }

        return ans;
    }
}
