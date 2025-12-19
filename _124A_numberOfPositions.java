import java.util.Scanner;

public class _124A_numberOfPositions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();

        int ans = n - a;
        if (ans - 1 > b)
            System.out.println(b + 1);
        else
            System.out.println(n - a);
    }
}
