import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class _1511C_YetAnotherCardDeck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = 1;
        while (tc-- > 0) {
            int n = sc.nextInt();
            int q = sc.nextInt();

            List<Integer> arr = new ArrayList<>();

            for (int i = 0; i < n; i++) {
                arr.add(sc.nextInt());
            }

            while (q-- > 0) {
                int color = sc.nextInt();

                for (int i = 0; i < n; i++) {
                    if (arr.get(i) == color) {
                        System.out.print((i + 1) + " ");

                        int num = arr.remove(i);
                        arr.addFirst(num);

                        break;
                    }
                }
            }
        }
    }
}
