import java.util.Scanner;

public class _1593D1_AllSame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            int min = Integer.MAX_VALUE;

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
                if (arr[i] < min) {
                    min = arr[i];
                }
            }

            int resultGcd = 0;
            boolean allSame = true;

            for (int i = 0; i < n; i++) {
                int diff = arr[i] - min;
                if (diff != 0) {
                    allSame = false;
                    resultGcd = gcd(resultGcd, diff);
                }
            }

            // If allSame is true, resultGcd remains 0, output -1
            System.out.println(allSame ? -1 : resultGcd);
        }
    }

    public static int gcd(int a, int b) {
        while (b != 0) {
            a %= b;
            // Swap a and b
            int temp = a;
            a = b;
            b = temp;
        }
        return a;
    }
}
