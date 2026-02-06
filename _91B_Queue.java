import java.util.Map;
import java.util.Scanner;
import java.util.Stack;

public class _91B_Queue {
    static class Pair {
        int num;
        int idx;

        public Pair(int num, int idx) {
            this.num = num;
            this.idx = idx;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] age = new int[n];
        for (int i = 0; i < n; i++) {
            age[i] = sc.nextInt();
        }

        int[] displeasure = new int[n];
        Stack<Pair> stack = new Stack<>();
        Stack<Pair> sec = new Stack<>();

        for (int i = n - 1; i >= 0; i--) {
            if (stack.isEmpty()) {
                displeasure[i] = -1;
                stack.push(new Pair(age[i], i));
            } else {
                int furthest = 0;

                while (!stack.isEmpty() && stack.peek().num < age[i]) {
                    Pair peek = stack.pop();
                    furthest = Math.max(furthest, peek.idx);
                    sec.push(peek);
                }

                stack.push(new Pair(age[i], i));
                displeasure[i] = (sec.isEmpty()) ? -1 : furthest - i - 1;

                while (!sec.isEmpty()) {
                    stack.push(sec.pop());
                }
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.print(displeasure[i] + " ");
        }
        System.out.println();
    }
}
