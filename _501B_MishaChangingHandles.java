import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class _501B_MishaChangingHandles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        Map<String, String> map = new HashMap<>();

        while (t-- > 0) {
            String oldHandle = sc.next();
            String newHandle = sc.next();

            if (map.containsKey(oldHandle)) {
                String oldest = map.get(oldHandle);
                map.remove(oldHandle);
                map.put(newHandle, oldest);
            } else {
                map.put(newHandle, oldHandle);
            }
        }
        System.out.println(map.size());
        for (String key : map.keySet()) {
            System.out.println(map.get(key) + " " + key);
        }
    }
}
