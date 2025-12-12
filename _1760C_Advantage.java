import java.util.Scanner;

public class _1760C_Advantage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tc = sc.nextInt();

        while (tc-- > 0) {
            int n = sc.nextInt();
            int largest = Integer.MIN_VALUE;
            int secondLargest = Integer.MIN_VALUE;

            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();

                if (arr[i] > largest) {
                    secondLargest = largest;
                    largest = arr[i];
                } else if (arr[i] > secondLargest) {
                    secondLargest = arr[i];
                }
            }

            for (int i = 0; i < n; i++) {
                if (arr[i] != largest) System.out.print(arr[i] - largest + " ");
                else System.out.print(arr[i] - secondLargest + " ");
            }
            System.out.println();
        }
            sc.close();
    }
}
