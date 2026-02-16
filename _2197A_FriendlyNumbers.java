import java.util.*;

public class _2197A_FriendlyNumbers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc-- > 0){
            int x = sc.nextInt();
            int count = 0;

            for(long y = x; y <= x + 162; y++){
                if(y - sum(y) == x){
                    count++;
                }
            }
            System.out.println(count);
        }
    }

    static int sum(long n){
        int s = 0;
        while(n > 0){
            s += n % 10;
            n /= 10;
        }
        return s;
    }
}
