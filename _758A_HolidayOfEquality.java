import java.util.*;

public class _758A_HolidayOfEquality {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        int max = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            if (arr[i] > max) max = arr[i];
        }

        int ans = 0;
        for (int welfare : arr) ans += max - welfare;
        System.out.println(ans);

    }

}
