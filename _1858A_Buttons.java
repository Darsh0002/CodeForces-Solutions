import java.util.Scanner;

public class _1858A_Buttons {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            // If c is odd, Anna gets the last move on shared buttons,
            // effectively giving her an advantage.
            if (c % 2 != 0) {
                if (a >= b) {
                    System.out.println("First");
                } else {
                    System.out.println("Second");
                }
            } else {
                // If c is even, turn order is unchanged for the private duel.
                if (a > b) {
                    System.out.println("First");
                } else {
                    System.out.println("Second");
                }
            }
        }
    }
}