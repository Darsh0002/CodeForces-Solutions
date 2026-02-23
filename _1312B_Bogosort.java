import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class _1312B_Bogosort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while (tc-- > 0) {
            int n = sc.nextInt();

            List<Integer> arr = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                arr.add(sc.nextInt());
            }
            Collections.sort(arr, Collections.reverseOrder());
            for (int i = 0; i < n; i++) {
                System.out.print(arr.get(i) + " ");
            }
            System.out.println();
        }
    }
}
