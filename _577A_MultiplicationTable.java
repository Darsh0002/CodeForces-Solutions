import java.util.Scanner;

public class _577A_MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();

        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (i * (x / i) == x && x / i <= n)
                count++;
        }
        System.out.println(count);
    }
}
