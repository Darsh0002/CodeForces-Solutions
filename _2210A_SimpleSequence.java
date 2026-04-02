import java.util.Scanner;

public class _2210A_SimpleSequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while (tc-- > 0) {
            int n = sc.nextInt();

            for (int i = n; i >= 1; i--) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
