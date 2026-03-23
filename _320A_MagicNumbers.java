import java.util.Scanner;

public class _320A_MagicNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        int n = s.length();

        boolean valid = true;

        int i = 0;

        while (i < n) {
            if (s.charAt(i) == '1') {
                i++;
            } else if (s.charAt(i) == '4') {
                if (i - 1 >= 0 && s.charAt(i - 1) == '1') {
                    i++;
                } else if (i - 2 >= 0 && s.charAt(i - 2) == '1') {
                    i++;
                } else {
                    valid = false;
                    break;
                }
            } else {
                valid = false;
                break;
            }
        }
        System.out.println(valid ? "YES" : "NO");
    }
}
