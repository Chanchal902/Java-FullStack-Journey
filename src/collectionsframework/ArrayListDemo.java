package collectionsframework;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<Integer> num = new ArrayList<Integer>();
        num.add(100);  //Adds an element to the end of the list
        num.add(24);
        num.add(36);
        num.add(55);
        num.add(32);
        System.out.println("Element 1 At Index 0: " + num.get(0));  // returns the element at index 0 position
        System.out.println("Element 2 At Index 1: " + num.get(1));
        System.out.println("Element 3 At Index 2: " + num.get(2));
        System.out.println("Element 4 At Index 3: " + num.get(3));
        System.out.println("Element 5 At Index 4: " + num.get(4));
        num.set(2, 99);  // replaces the element at index 2
        System.out.println("New Element 3 At Index 2: " + num.get(2));
        num.remove(1);  // removes the element
        num.remove(3);
        System.out.println("Index 1: " + num.get(1));
        System.out.println("Index 2: " + num.get(2));
        Collections.sort(num);  // sorting
        for (int i = 0; i < num.size(); i++) {   //size() -> returns the number of elements of an ArrayList
            System.out.println(num.get(i));
        }
        for (int x : num) {   // for each loop
            System.out.println(x + 100);
        }

    }
}
