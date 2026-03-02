import java.util.Scanner;

public class _1155A_ReverseSubstring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String s = sc.next();

        char prevMax = s.charAt(0);
        int prevMaxIdx = 0;

        for (int i = 1; i < n; i++) {
            if (s.charAt(i) < prevMax) {
                System.out.println("YES");
                System.out.println((prevMaxIdx + 1) + " " + (i + 1));
                return;
            }

            if (s.charAt(i) > prevMax) {
                prevMaxIdx = i;
                prevMax = s.charAt(i);
            }
        }

        System.out.println("NO");
    }
}
