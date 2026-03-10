import java.util.Scanner;

public class _1691B_ShoeShuffling {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();

        while (tc-- > 0) {

            int n = sc.nextInt();
            int[] arr = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            int[] ans = new int[n];
            boolean notPossible = false;

            int i = 0;

            while (i < n) {

                int j = i + 1;
                while (j < n && arr[j] == arr[i]) j++;

                if (j - i == 1) {
                    notPossible = true;
                    break;
                }

                rotateGroup(ans, i, j);

                i = j;
            }

            if (notPossible) {
                System.out.println(-1);
            } else {
                for (int x : ans) {
                    System.out.print(x + " ");
                }
                System.out.println();
            }
        }
    }

    private static void rotateGroup(int[] ans, int start, int end) {

        for (int i = start; i < end - 1; i++) {
            ans[i] = i + 2;
        }

        ans[end - 1] = start + 1;
    }
}