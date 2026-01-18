import java.util.*;

public class _2185C_shiftedMEX {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) return;
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            Set<Integer> uniqueElements = new HashSet<>();
            for (int i = 0; i < n; i++) {
                uniqueElements.add(sc.nextInt());
            }

            // Convert set to list and sort
            List<Integer> sortedUnique = new ArrayList<>(uniqueElements);
            Collections.sort(sortedUnique);

            int maxMex = 0;
            int currentChain = 0;

            for (int i = 0; i < sortedUnique.size(); i++) {
                // If this is the first element or it continues the sequence
                if (i > 0 && sortedUnique.get(i) == sortedUnique.get(i - 1) + 1) {
                    currentChain++;
                } else {
                    currentChain = 1;
                }
                maxMex = Math.max(maxMex, currentChain);
            }

            // If n=0, the MEX is 0, but the constraints say n >= 1
            System.out.println(maxMex);
        }
        sc.close();
    }
}