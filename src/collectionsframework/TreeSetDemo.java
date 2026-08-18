package collectionsframework;

import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet<String> name = new TreeSet<String>();
        name.add("rohan");
        name.add("chanchal");
        name.add("rini");
        name.add("raina");
        name.add("harshh");
        System.out.println(name);  // sorted order automatically
        name.remove("rohan");
        System.out.println("After removing rohan , new set = " + name);
        System.out.println(name.contains("rini"));
        System.out.println(name.contains("jitesh"));
        for (String s : name) {
            System.out.println(s);
        }
        System.out.println("TreeSet Size= " + name.size());
        name.clear();
        System.out.println(name);
    }
}
