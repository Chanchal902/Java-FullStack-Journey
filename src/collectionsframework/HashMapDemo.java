package collectionsframework;

import java.util.Map;
import java.util.HashMap;

public class HashMapDemo {
    public static void main(String[] args) {
        Map<Integer, String> city = new HashMap<Integer, String>();
        city.put(1, "Kolkata");
        city.put(2, "Mumbai");
        city.put(3, "Lucknow");
        city.put(4, "Jaipur");
        city.put(5, "Bhagalpur");
        city.put(6, "Mumbai");
        city.put(7, "Sabour");
        city.put(7, "mumbai");
        city.put(null, "Bilwara"); // hashMap allows one null key and multiple null values
        city.put(null, null);
        city.put(8, null);
        System.out.println(city.get(2));  //returns the value for the given key
        System.out.println(city.get(7)); //key must be unique (old value is replaced with new value)
        System.out.println(city.get(6));  // value can be duplicate
        city.remove(6);
        System.out.println(city.get(6));  // value and key -> 6 has been removed
        System.out.println(city.containsKey(7));
        System.out.println(city.containsKey(6));
        System.out.println(city.keySet());  // returns a set of all keys
        city.remove(5);
        System.out.println(city.get(5));
        System.out.println(city.keySet());
        System.out.println(city.size());
        System.out.println("----------------");
        for (Integer i : city.keySet()) {
            System.out.println(i);
        }
        System.out.println("----------------");
        for (String x : city.values()) {
            System.out.println(x);
        }
        System.out.println("----------------");
        for (Integer it : city.keySet()) {
            System.out.println(it + " -> " + city.get(it));
        }
    }
}
