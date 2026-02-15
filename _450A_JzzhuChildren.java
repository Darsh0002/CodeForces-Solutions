import java.util.*;

public class _450A_JzzhuChildren {
    static class Pair {
        int choco;
        int number;

        public Pair(int choco, int number) {
            this.choco = choco;
            this.number = number;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        Queue<Pair> q = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            q.add(new Pair(sc.nextInt(), i + 1));
        }

        while (q.size() != 1) {
            Pair curr = q.poll();
            if (curr.choco - m > 0) {
                q.add(new Pair(curr.choco - m, curr.number));
            }
        }

        System.out.println(q.poll().number);
    }
}
