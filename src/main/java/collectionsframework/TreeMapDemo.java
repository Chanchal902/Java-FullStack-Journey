package collectionsframework;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo {
    public static void main(String[] args) {
        Map<Integer, Character> ch = new TreeMap<Integer, Character>();
        ch.put(1, 'D');
        ch.put(2, 'B');
        ch.put(6, 'c');
        ch.put(4, 'a');
        ch.put(5, 'F');
        ch.put(5, null);
        ch.put(0, 'A');
        ch.put(3, null);
        System.out.println(ch.get(5)); // duplicate key: old value is replaced
        System.out.println(ch.get(4));
        ch.remove(5);
        System.out.println(ch.containsKey(2));
        System.out.println(ch.containsValue('B'));
        System.out.println(ch.keySet());  // sorted order
        System.out.println(ch.size());
        System.out.println("---------------");
        for (Integer i : ch.keySet()) {
            System.out.println(i);
        }
        System.out.println("---------------");
        for (Character x : ch.values()) {
            System.out.println(x);
        }
        System.out.println("---------------");
        for (Integer it : ch.keySet()) {
            System.out.println(it + " -> " + ch.get(it));
        }
    }
}
