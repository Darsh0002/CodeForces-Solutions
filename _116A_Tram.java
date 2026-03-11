import java.util.Scanner;

public class _116A_Tram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][2];

        for (int i = 0; i < n; i++) {
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
        }

        int prev = arr[0][1];
        int capacity = arr[0][1];
        for (int i = 1; i < n; i++) {
            int curr = prev - arr[i][0] + arr[i][1];
            capacity = Math.max(capacity, curr);
            prev = curr;
        }

        System.out.println(capacity);
    }
}
