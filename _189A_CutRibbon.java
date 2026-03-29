import java.util.Scanner;

public class _189A_CutRibbon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int[] arr = {a, b, c};

        System.out.println(countPieces(n, arr));
    }

    private static int countPieces(int n, int[] arr) {
        if (n == 0) return 0;
        if (n < 0) return Integer.MIN_VALUE;

        int max = 0;
        for (int i = 0; i < 3; i++) {
            max = Math.max(max, 1 + countPieces(n - arr[i], arr));
        }

        return max;
    }
}
