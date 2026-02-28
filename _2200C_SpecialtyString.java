import java.util.Scanner;
import java.util.Stack;

public class _2200C_SpecialtyString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();

            Stack<Character> st = new Stack<>();

            for (int i = 0; i < n; i++) {
                char c = s.charAt(i);
                if (c != '*') {
                    if (st.isEmpty() || st.peek() != c) {
                        st.push(c);
                    } else if (st.peek() == c) {
                        st.pop();
                    }
                }
            }

            System.out.println(st.isEmpty() ? "YES" : "NO");
        }
    }
}
