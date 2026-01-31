import java.util.Scanner;

public class _1866A_AmbitiosKid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        int min = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            min = Math.min(min, Math.abs(arr[i]));
        }
        System.out.println(min);
    }
}
