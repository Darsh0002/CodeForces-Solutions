import java.util.Scanner;

public class _102B_SumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        int count = 0;

        while (s.length() > 1) {
            String sum = sumOfDigits(s);
            count++;
            s = sum;
        }

        System.out.println(count);
    }

    private static String sumOfDigits(String x) {
        int sum = 0;

        for (int i = 0; i < x.length(); i++) {
            sum += x.charAt(i) - '0';
        }

        return String.valueOf(sum);
    }
}
