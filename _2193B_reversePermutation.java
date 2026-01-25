import java.util.*;

public class _2193B_reversePermutation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            Map<Integer, Integer> map = new HashMap<>();

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
                map.put(arr[i], i);
            }

            int i;
            for (i = 0; i < n; i++) {
                if (arr[i] != n - i) break;
            }

            if (i < n) {
                int pos = map.get(n - i);
                reverse(arr, i, pos);
            }

            for (int x : arr) {
                System.out.print(x + " ");
            }
            System.out.println();
        }
    }

    static void reverse(int[] arr, int l, int r) {
        while (l < r) {
            int temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;
            l++;
            r--;
        }
    }
}
