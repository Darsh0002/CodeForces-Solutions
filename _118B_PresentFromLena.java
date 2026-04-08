import java.util.Scanner;

public class _118B_PresentFromLena {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int space = n;
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j < space; j++) {
                System.out.print("  ");
            }

            for (int j = 0; j <= i; j++) {
                if (j == 0)
                    System.out.print(j);
                else
                    System.out.print(" " + j);
            }

            for (int j = i - 1; j >= 0; j--) {
                System.out.print(" " + j);
            }

            System.out.println();
            space--;
        }

        space = 1;
        for (int i = n - 1; i >= 0; i--) {
            for (int j = 0; j < space; j++) {
                System.out.print("  ");
            }

            for (int j = 0; j <= i; j++) {
                if (j == 0)
                    System.out.print(j);
                else
                    System.out.print(" " + j);
            }

            for (int j = i - 1; j >= 0; j--) {
                System.out.print(" " + j);
            }

            System.out.println();
            space++;
        }
    }
}
