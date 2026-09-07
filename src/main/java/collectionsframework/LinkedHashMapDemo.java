package collectionsframework;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.LinkedHashSet;

public class LinkedHashMapDemo {
    public static void main(String[] args) {
        LinkedHashMap<Integer, Integer> n = new LinkedHashMap<Integer, Integer>();
        n.put(1, 9000);
        n.put(4, 8560);
        n.put(2, 10000);
        n.put(6, 7123);
        n.put(5, 1465);
        n.put(3, 63524);
        n.put(null, 6633);
        n.put(7, null);
        n.put(8, null);
        System.out.println(n.get(null));
        System.out.println(n.get(8));
        n.remove(null);
        System.out.println(n.containsValue(10000));
        System.out.println(n.containsKey(8));
        System.out.println(n.size());
        System.out.println("----------------");
        for (Integer x : n.keySet()) {
            System.out.println(x);
        }
        System.out.println("----------------");
        for (Integer i : n.values()) {
            System.out.println(i);
        }
        System.out.println("-----------------");
        for (Integer it : n.keySet()) {
            System.out.println(it + " -> " + n.get(it));
        }
    }
}
