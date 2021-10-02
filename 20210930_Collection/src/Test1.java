import java.lang.reflect.Array;
import java.util.*;

/**
 * @Author: 江桂煌
 * @Description: TODO
 * @DateTime: 2021/9/30 14:39
 **/
public class Test1 {

    public static int func() {
        return 0;
    }

    public static void main(String[] args) {


    }
    public static void main2(String[] args) {
        //map
        Map<String, String> map = new HashMap<>();
        map.put("hehe", "haha");
        map.put("enen", "ouou");
        System.out.println(map.get("hehe"));
        System.out.println(map.get("hehe1"));
        System.out.println(map.getOrDefault("hehe1", "??"));
        System.out.println(map.containsKey("enen"));
        System.out.println(map.containsKey("enen1"));
        System.out.println(map.containsValue("ouou"));
        System.out.println(map.containsValue("ouou1"));

        System.out.println(map.isEmpty());
        System.out.println(map.size());
        Set<Map.Entry<String, String>> entries = map.entrySet();
        System.out.println(entries);
        for (Map.Entry<String, String> entry: entries) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
    }
    public static void main1(String[] args) {
        //Collection
        Collection<Integer> collection = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            collection.add(i);

        }
        System.out.println(collection);
        System.out.println(collection.isEmpty());//false
        System.out.println(collection.size());//10
        collection.remove(4);
        System.out.println(collection.isEmpty());//false
        System.out.println(collection.size());//9
        Object[] objects = collection.toArray();
        System.out.println(Arrays.toString(objects));
        collection.clear();
        System.out.println(collection.isEmpty());//true
        System.out.println(collection.size());//0

    }
}
