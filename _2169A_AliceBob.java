    import java.util.Scanner;

    public class _2169A_AliceBob {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int tc = sc.nextInt();
            while (tc-- > 0) {
                int n = sc.nextInt();
                long a = sc.nextLong();

                long lessThanA = 0, greaterThanA = 0;
                for (int i = 0; i < n; i++) {
                    long v = sc.nextLong();

                    if (v < a) lessThanA++;
                    else if (v > a) greaterThanA++;
                }

                if (greaterThanA > lessThanA) System.out.println(a + 1);
                else {
                    System.out.println(a - 1 > 0 ? a - 1 : 1000000000);
                }
            }
        }
    }
