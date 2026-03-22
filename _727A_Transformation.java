import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class _727A_Transformation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long a = sc.nextLong();
        long b = sc.nextLong();
        List<Long> list = new ArrayList<>();
        list.add(a);
        if (!solve(a, b, list)) {
            System.out.println("NO");
        }
    }

    private static boolean solve(long a, long b, List<Long> list) {
        if (a > b) return false;
        if (a == b) {
            System.out.println("YES");
            System.out.println(list.size());
            list.forEach(num -> System.out.print(num + " "));
            return true;
        }

        long next = a * 2;
        list.add(next);
        if (solve(next, b, list)) {
            return true;
        }
        list.removeLast();

        next = a * 10 + 1;
        list.add(next);
        if (solve(next, b, list)) {
            return true;
        }
        list.removeLast();

        return false;
    }
}
