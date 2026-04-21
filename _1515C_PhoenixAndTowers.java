import java.util.PriorityQueue;
import java.util.Scanner;

public class _1515C_PhoenixAndTowers {
    private record Tower(int height, int idx) {
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while (tc-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int x = sc.nextInt();

            System.out.println("YES");

            // minHeap
            // it will always give the tower with minimum height
            PriorityQueue<Tower> heap = new PriorityQueue<>((a, b) -> a.height - b.height);

            for (int i = 1; i <= m; i++) {
                heap.add(new Tower(0, i));
            }

            for (int i = 0; i < n; i++) {
                int h = sc.nextInt();

                Tower t = heap.poll();
                System.out.print(t.idx + " ");

                // update height
                heap.add(new Tower(h + t.height, t.idx));
            }
            System.out.println();
        }
    }
}
