import java.util.*;

public class _1914D_ThreeActivities {
    private record Pair(int friends, int day) {
    }

    private static List<Integer> findMax3(List<Integer> arr) {

        // heap to store value and its index (Top 3)
        PriorityQueue<Pair> heap = new PriorityQueue<>((a, b) -> a.friends - b.friends);

        for (int i = 0; i < arr.size(); i++) {
            heap.add(new Pair(arr.get(i), i));

            if (heap.size() > 3) heap.poll();
        }

        // List to store indices of the top 3 maximum values
        List<Integer> ans = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            ans.add(heap.poll().day);
        }

        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();

            List<Integer> a = new ArrayList<>();
            List<Integer> b = new ArrayList<>();
            List<Integer> c = new ArrayList<>();

            for (int i = 0; i < n; i++) {
                a.add(sc.nextInt());
            }
            for (int i = 0; i < n; i++) {
                b.add(sc.nextInt());
            }
            for (int i = 0; i < n; i++) {
                c.add(sc.nextInt());
            }

            // Find the indices of the top 3 maximum values for each activity
            List<Integer> maxa = findMax3(a);
            List<Integer> maxb = findMax3(b);
            List<Integer> maxc = findMax3(c);

            int ans = 0;

            // Try all combinations of the top 3 days for each activity
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    for (int k = 0; k < 3; k++) {
                        int x = maxa.get(i), y = maxb.get(j), z = maxc.get(k);

                        // Ensure all selected days are distinct
                        if (x == y || y == z || z == x) continue;

                        // Calculate the total number of friends and update the answer
                        ans = Math.max(ans, a.get(x) + b.get(y) + c.get(z));
                    }
                }
            }

            System.out.println(ans); // Output the result for the current test case
        }
    }
}