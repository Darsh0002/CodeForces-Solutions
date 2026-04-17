import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class _1703D_DoubleStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while (tc-- > 0) {
            int n = sc.nextInt();
            String[] strings = new String[n];

            Set<String> set = new HashSet<>();

            for (int i = 0; i < n; i++) {
                strings[i] = sc.next();
                set.add(strings[i]);
            }

            for (String s : strings) {
                boolean found = false;
                for (int i = 0; i < s.length(); i++) {
                    String sub = s.substring(0, i + 1);
                    if (set.contains(sub)) {
                        String sub2 = s.substring(i + 1);
                        if (set.contains(sub2)) {
                            found = true;
                            break;
                        }
                    }
                }

                System.out.print(found ? "1" : "0");
            }
            System.out.println();
        }
    }
}
