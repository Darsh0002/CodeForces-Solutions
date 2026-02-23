import java.util.Scanner;

public class _1744C_trafficLight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();

        while (tc-- > 0) {
            int n = sc.nextInt();
            char c = sc.next().charAt(0);
            String signals = sc.next();

            System.out.println(minimalSeconds(c, signals + signals, n + n));
        }
    }

    private static int minimalSeconds(char curr, String s, int n) {
        if (curr == 'g') return 0;
        int ans = 0;

        // find last 'g'
        int j = n - 1;
        while (j >= 0 && s.charAt(j) != 'g') {
            j--;
        }
        int d = 0;

        j--;
        while (j >= 0) {
            d++;
            if (s.charAt(j) == curr) {
                ans = Math.max(ans, d);
            } else if (s.charAt(j) == 'g') {
                d = 0;
            }
            j--;
        }
        return ans;
    }
}