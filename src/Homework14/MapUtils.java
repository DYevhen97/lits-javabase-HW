package Homework14;

import java.util.Map;
import java.util.Set;
import java.util.LinkedHashMap;
import java.util.stream.Collectors;

public class MapUtils {
    public static void main(String[] args) {

        Map<String, Integer> map = new LinkedHashMap<>();
        map.put("a", 1);
        map.put("b", 2);
        map.put("c", 3);
        map.put("d", 4);
        map.put("e", 5);
        map.put("f", 6);
        map.put("g", 7);
        map.put("h", 8);

        Set<String> set = map.keySet();
        System.out.println("Keys: " + set);

        System.out.println("key a = value " + map.get("a"));
        System.out.println("key b = value " + map.get("b"));
        System.out.println("key c = value " + map.get("c"));
        System.out.println("key d = value " + map.get("d"));
        System.out.println("key e = value " + map.get("e"));
        System.out.println("key f = value " + map.get("f"));
        System.out.println("key g = value " + map.get("g"));
        System.out.println("key h = value " + map.get("h"));

        Map<Integer, String> swapped = map.entrySet().stream().collect(Collectors.toMap(Map.Entry::getValue, Map.Entry::getKey));

        Set<Integer> set2 = swapped.keySet();
        System.out.println("New keys: " + set2);
        System.out.println("key 1 = value " + swapped.get(1));
        System.out.println("key 2 = value " + swapped.get(2));
        System.out.println("key 3 = value " + swapped.get(3));
        System.out.println("key 4 = value " + swapped.get(4));
        System.out.println("key 5 = value " + swapped.get(5));
        System.out.println("key 6 = value " + swapped.get(6));
        System.out.println("key 7 = value " + swapped.get(7));
        System.out.println("key 8 = value " + swapped.get(8));
    }
}
