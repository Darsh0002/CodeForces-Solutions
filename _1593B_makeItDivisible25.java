import java.util.Scanner;

public class _1593B_makeItDivisible25 {

    static int solve(String s, String target) {

        int n = s.length();
        int pos2 = -1, pos1 = -1;

        // find second digit from right
        for(int i = n-1; i>=0; i--){
            if(s.charAt(i) == target.charAt(1)){
                pos2 = i;
                break;
            }
        }

        if(pos2 == -1) return Integer.MAX_VALUE;

        // find first digit before it
        for(int i = pos2-1; i>=0; i--){
            if(s.charAt(i) == target.charAt(0)){
                pos1 = i;
                break;
            }
        }

        if(pos1 == -1) return Integer.MAX_VALUE;

        // deletions needed
        return (n-pos1-2);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();

        while(tc-- > 0){

            String s = sc.next();

            int ans = Integer.MAX_VALUE;

            ans = Math.min(ans, solve(s,"00"));
            ans = Math.min(ans, solve(s,"25"));
            ans = Math.min(ans, solve(s,"50"));
            ans = Math.min(ans, solve(s,"75"));

            System.out.println(ans);
        }
    }
}
