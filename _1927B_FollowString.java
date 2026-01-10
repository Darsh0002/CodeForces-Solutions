import java.util.*;

public class _1927B_FollowString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            Map<Integer, List<Character>> map = new HashMap<>();

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            map.put(0, new ArrayList<>());
            map.get(0).add('a');

            StringBuilder ans = new StringBuilder();

            for (int num : arr) {
                char c = map.get(num).get(0);
                ans.append(c);

                char nextChar = (char) (c + 1);
                int nextNum = num + 1;

                // update current number
                map.get(num).remove(0);
                map.get(num).add(nextChar);

                // update next number
                map.putIfAbsent(nextNum, new ArrayList<>());
                map.get(nextNum).add(c);
            }

            System.out.println(ans);
        }
    }
}
