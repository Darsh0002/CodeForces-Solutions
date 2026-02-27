import java.util.Scanner;

public class _2203A_TowersOfBoxes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();

        while (tc-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int d = sc.nextInt();

            // boxes in one tower
            int oneTower = (d / m) + 1;

            if (oneTower >= n) {
                System.out.println(1);
            } else {
                int total = (n / oneTower) + (n % oneTower == 0 ? 0 : 1);
                System.out.println(total);
            }
        }
    }
}
