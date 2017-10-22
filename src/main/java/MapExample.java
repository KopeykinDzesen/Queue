import java.util.*;

public class MapExample {

    public static void main(String[] args) {

        Map<String, Integer> hashMap = new HashMap();
        Map<String, Integer> identityHashMap = new IdentityHashMap();
        Map<String, Integer> linkedHashMap = new LinkedHashMap();
        Map<String, Integer> treeMap = new TreeMap();
        Map<String, Integer> weakHashMap = new WeakHashMap();

        hashMap.put("str1", 1);
        hashMap.put("str2", 5);
        hashMap.put("str3", 3);
        hashMap.put("str4", 3);
        hashMap.put("str5", 4);

        System.out.println("hashMap: " + hashMap);

        identityHashMap.put("str1", 1);
        identityHashMap.put("str2", 5);
        identityHashMap.put("str3", 3);
        identityHashMap.put("str4", 3);
        identityHashMap.put("str5", 4);

        System.out.println("identityHashMap: " + identityHashMap);

        linkedHashMap.put("str1", 1);
        linkedHashMap.put("str2", 5);
        linkedHashMap.put("str3", 3);
        linkedHashMap.put("str4", 3);
        linkedHashMap.put("str5", 4);

        System.out.println("linkedHashMap: " + linkedHashMap);

        treeMap.put("str1", 1);
        treeMap.put("str5", 4);
        treeMap.put("str3", 3);
        treeMap.put("str2", 5);
        treeMap.put("str4", 3);

        System.out.println("treeMap: " + treeMap);

        weakHashMap.put("str1", 1);
        weakHashMap.put("str2", 5);
        weakHashMap.put("str3", 3);
        weakHashMap.put("str4", 4);
        weakHashMap.put("str5", 4);

        System.out.println("weakHashMap: " + weakHashMap);

    }

}
