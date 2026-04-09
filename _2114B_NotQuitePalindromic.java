import java.util.Scanner;

public class _2114B_NotQuitePalindromic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt(); // number of test cases

        while (tc-- > 0) {
            int n = sc.nextInt(); // length of string
            int k = sc.nextInt(); // required good pairs

            String s = sc.next();

            int zero = 0, one = 0;

            // count number of 0s and 1s
            for (char c : s.toCharArray()) {
                if (c == '1') one++;
                else zero++;
            }

            // total pairs = n/2
            // good pairs = k
            // bad pairs = remaining pairs
            int badPairs = n / 2 - k;

            // each bad pair needs 1 zero and 1 one
            // if not enough, impossible
            if (zero < badPairs || one < badPairs) {
                System.out.println("NO");
                continue;
            }

            // use characters to form bad pairs
            zero -= badPairs;
            one -= badPairs;

            // remaining characters must form k good pairs
            // so:
            // 1. both counts must be even (to form pairs)
            // 2. total remaining chars = 2*k
            if (zero % 2 == 0 && one % 2 == 0 && (zero + one) == 2 * k) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}