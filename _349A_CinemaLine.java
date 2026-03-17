import java.util.Scanner;

public class _349A_CinemaLine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int tf = 0, f = 0;
        for (int i = 0; i < n; i++) {
            int ruble = sc.nextInt();

            if (ruble == 25) tf++;
            else if (ruble == 50) {
                if (tf == 0) {
                    System.out.println("NO");
                    return;
                }
                tf--;
                f++;
            } else {
                if (f >= 1 && tf >= 1) {
                    f--;
                    tf--;
                } else if (tf >= 3) {
                    tf -= 3;
                } else {
                    System.out.println("NO");
                    return;
                }
            }
        }

        System.out.println("YES");
    }
}
