import java.util.HashMap;
import java.util.Map;

public class MapSample {

    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();

        map.put(1, "平澤");
        map.put(2, "吉井");
        map.put(3, "中山");
        map.put(4, "西川");
        System.out.println(map);
        System.out.println(map.get(1));
        System.out.println(map.size());
        System.out.println(map.values());
        System.out.println(map.entrySet());
        System.out.println(map.containsKey(1));
        System.out.println(map.containsValue("平澤"));
    }
}