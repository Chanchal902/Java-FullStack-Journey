package collectionsframework;

import java.util.HashSet;

public class HashSetDemo {
    public static void main(String[] args) {
        HashSet<Integer> number = new HashSet<Integer>();
        //add , remove , size , contains , clear
        number.add(56);
        number.add(12);
        number.add(69);
        number.add(2);
        number.add(51);
        number.add(12);
        System.out.println(number.getClass());
        System.out.println(number.contains(22));
        System.out.println(number.contains(69));
        number.remove(69);
        System.out.println(number.contains(69));
        System.out.println("size= " + number.size());  // size() -> duplicate elements are not counted
        System.out.println("HashSet= " + number);
        for (int x : number) {    // for-each loop
            System.out.println(x);
        }

        number.clear();
        System.out.println(number.contains(12));  // clear() -> removes all the element


    }
}
