import java.util.Scanner;

public class _275A_LightsOut {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a1 = sc.nextInt();
        int a2 = sc.nextInt();
        int a3 = sc.nextInt();
        int b1 = sc.nextInt();
        int b2 = sc.nextInt();
        int b3 = sc.nextInt();
        int c1 = sc.nextInt();
        int c2 = sc.nextInt();
        int c3 = sc.nextInt();

        System.out.print((a1 + a2 + b1) % 2 == 0 ? 1 : 0);
        System.out.print((a1 + a2 + a3 + b2) % 2 == 0 ? 1 : 0);
        System.out.print((a2 + a3 + b3) % 2 == 0 ? 1 : 0);
        System.out.println();
        System.out.print((a1 + b1 + b2 + c1) % 2 == 0 ? 1 : 0);
        System.out.print((a2 + b1 + b2 + b3 + c2) % 2 == 0 ? 1 : 0);
        System.out.print((a3 + b2 + b3 + c3) % 2 == 0 ? 1 : 0);
        System.out.println();
        System.out.print((b1 + c1 + c2) % 2 == 0 ? 1 : 0);
        System.out.print((c1 + b2 + c2 + c3) % 2 == 0 ? 1 : 0);
        System.out.print((b3 + c2 + c3) % 2 == 0 ? 1 : 0);
        System.out.println();
    }
}
