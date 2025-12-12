import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class _1703B_ICPCballoons {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int tc = sc.nextInt();

        while (tc-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();

            Set<Character> solved = new HashSet<>();

            int balloons=0;
            for (int i = 0; i < n; i++) {
                char c = s.charAt(i);

                if(solved.contains(c)) balloons++;
                else balloons+=2;

                solved.add(c);
            }

            System.out.println(balloons);
        }
    }
}
