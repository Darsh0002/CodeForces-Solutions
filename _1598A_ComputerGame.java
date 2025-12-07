import java.util.Scanner;

public class _1598A_ComputerGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tc = sc.nextInt();
        while (tc-- > 0) {
            int n = sc.nextInt();
            String first = sc.next();
            String sec = sc.next();
            int i = 0;
            for (; i < n; i++) {
                if (first.charAt(i) == '1' && sec.charAt(i) == '1') {
                    System.out.println("NO");
                    break;
                }
            }
            if(i==n) System.out.println("YES");
        }
    }
}
