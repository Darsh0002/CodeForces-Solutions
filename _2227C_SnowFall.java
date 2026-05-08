import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class _2227C_SnowFall {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while (tc-- > 0) {
            int n = sc.nextInt();
            List<Integer> a = new ArrayList<>(); // numbers divisible by 6
            List<Integer> b = new ArrayList<>(); // numbers divisible by 2
            List<Integer> c = new ArrayList<>(); // numbers divisible by 3
            List<Integer> d = new ArrayList<>(); // neither

            for (int i = 0; i < n; i++) {
                int x = sc.nextInt();

                if (x % 6 == 0) {
                    a.add(x);
                } else if (x % 2 == 0) {
                    b.add(x);
                } else if (x % 3 == 0) {
                    c.add(x);
                } else {
                    d.add(x);
                }
            }

            for (int x : a) {
                System.out.print(x + " ");
            }
            for (int x : c) {
                System.out.print(x + " ");
            }
            for (int x : d) {
                System.out.print(x + " ");
            }
            for (int x : b) {
                System.out.print(x + " ");
            }

            System.out.println();
        }
    }
}
