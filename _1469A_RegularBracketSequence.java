import java.util.Scanner;

public class _1469A_RegularBracketSequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tc = sc.nextInt();

        while (tc-- > 0) {
            String s = sc.next();

            System.out.println(RBS(s) ? "YES" : "NO");
        }
    }

    private static boolean RBS(String s) {
        int n = s.length();
        if (n % 2 != 0 || s.charAt(0) == ')' || s.charAt(n - 1) == '(')
            return false;

        int minOpen = 0; // minimum possible '('
        int maxOpen = 0; // maximum possible '('

        for (char c : s.toCharArray()) {
            if (c == '(') {
                minOpen++;
                maxOpen++;
            } else if (c == ')') {
                minOpen--;
                maxOpen--;
            } else { // '?'
                minOpen--;     // assume ')'
                maxOpen++;     // assume '('
            }

            if (maxOpen < 0)
                return false;

            if (minOpen < 0)
                minOpen = 0;
        }

        return minOpen == 0;
    }
}
