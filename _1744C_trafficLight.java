import java.util.Scanner;

public class _1744C_trafficLight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();

        while (tc-- > 0) {
            int n = sc.nextInt();
            char c = sc.next().charAt(0);
            String signals = sc.next();

            System.out.println(minimalSeconds(c, signals, n));
        }
    }

    private static int minimalSeconds(char c, String signals, int n) {
        if (c == 'g') return 0;
        int ans = 0;

        // Duplicate string to simulate circular array
        String s = signals + signals;

        for (int i = 0; i < n; i++) {

            if (signals.charAt(i) == c) {

                // find first 'g' after i
                for (int j = i + 1; j < i + n; j++) {  // search within next n steps
                    if (s.charAt(j) == 'g') {
                        ans = Math.max(ans, j - i);
                        break; // stop at first 'g'
                    }
                }

            }
        }
        return ans;
    }

}
