import java.util.*;

public class _1614B_DivanNewProject {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while (tc-- > 0) {
            int n = sc.nextInt();

            List<long[]> arr = new ArrayList<>();

            for (int i = 0; i < n; i++) {
                long num = sc.nextInt();
                arr.add(new long[]{num, i});
            }

            Collections.sort(arr, (a, b) -> (int) (b[0] - a[0]));

            long[] x = new long[n];

            long time = 0;
            long placeAt = 1;

            for (int i = 0; i < n; i += 2) {
                long num = arr.get(i)[0];
                long idx = arr.get(i)[1];

                x[(int) idx] = -placeAt;
                time += num * 2 * placeAt;

                placeAt++;
            }

            placeAt = 1;
            for (int i = 1; i < n; i += 2) {
                long num = arr.get(i)[0];
                long idx = arr.get(i)[1];

                x[(int) idx] = placeAt;
                time += num * 2 * placeAt;

                placeAt++;
            }

            System.out.println(time);
            System.out.print(0);
            for (long coordinate : x) {
                System.out.print(" " + coordinate);
            }
            System.out.println();
        }
    }
}
