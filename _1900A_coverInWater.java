import java.util.Scanner;

public class _1900A_coverInWater {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();

            boolean threeCont = false;

            for (int i = 0; i < n - 2; i++) {
                if (s.charAt(i) == '.' && s.charAt(i + 1) == '.' && s.charAt(i + 2) == '.') {
                    threeCont = true;
                    break;
                }
            }

            if (threeCont) {
                System.out.println(2);
            } else {
                int countEmpty = 0;
                for (int i = 0; i < n; i++) {
                    if (s.charAt(i) == '.') countEmpty++;
                }
                System.out.println(countEmpty);
            }
        }
    }
}
