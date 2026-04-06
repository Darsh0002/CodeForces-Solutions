import java.util.*;

public class _1697B_Promo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int q = sc.nextInt();

        List<Integer> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            arr.add(num);
        }

        arr.sort(Collections.reverseOrder());

        while (q-- > 0) {
            int x = sc.nextInt();
            int y = sc.nextInt();

            PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());

            for (int i = 0; i < x; i++) {
                pq.add(arr.get(i));

                if(pq.size() > y) pq.poll();
            }

            long val = 0;
            while (!pq.isEmpty())
                val += pq.poll();

            System.out.println(val);
        }
    }
}
