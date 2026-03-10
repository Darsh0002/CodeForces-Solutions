import java.util.Scanner;

public class _1659A_RedVersusBlue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int r = sc.nextInt();
            int b = sc.nextInt();

            int redPerGroup = r / (b + 1);
            int extraRed = r % (b + 1);

            StringBuilder ans = new StringBuilder();

            while (r > 0) {
                ans.append("R".repeat(redPerGroup));
                r -= redPerGroup;

                if (extraRed > 0) {
                    ans.append("R");
                    extraRed--;
                    r--;
                }

                if (b > 0) {
                    ans.append("B");
                    b--;
                }
            }

            System.out.println(ans);
        }
    }
}
