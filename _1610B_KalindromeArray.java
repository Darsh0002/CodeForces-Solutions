import java.util.Scanner;

public class _1610B_KalindromeArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while (tc-- > 0) {
            int n = sc.nextInt();

            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            boolean ans = true;

            int i = 0, j = n - 1;

            // check where first mismatch happens
            while (i <= j) {

                // our x would be one of arr[i] or arr[j]
                if (arr[i] != arr[j]) {

                    // check for both arr[i] and arr[j], if removing one of them makes array palindrome than array is kalindrome
                    if (checkPalindrome(arr[i], arr, n) || checkPalindrome(arr[j], arr, n)) {
                        break;
                    }

                    // none of them makes array kalindrome
                    ans = false;
                    break;
                }
                i++;
                j--;
            }

            System.out.println(ans ? "YES" : "NO");
        }
    }

    private static boolean checkPalindrome(int x, int[] arr, int n) {
        int i = 0, j = n - 1;

        while (i <= j) {
            while (i < n && arr[i] == x)
                i++;
            while (j >= 0 && arr[j] == x)
                j--;

            if (arr[i] != arr[j])
                return false;

            i++;
            j--;
        }
        return true;
    }
}
