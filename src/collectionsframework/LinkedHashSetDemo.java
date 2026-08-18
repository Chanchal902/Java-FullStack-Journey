package collectionsframework;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {
    public static void main(String[] args) {
        LinkedHashSet<Character> ch = new LinkedHashSet<Character>();
        ch.add('c');
        ch.add('F');
        ch.add('a');
        ch.add('A');
        ch.add('y');
        ch.add('A');
        ch.add('e');
        System.out.println(ch.getClass());
        System.out.println("size= " + ch.size());
        System.out.println(ch);
        ch.remove('A');
        System.out.println(ch);
        System.out.println("New size= " + ch.size());
        System.out.println(ch.contains('A'));
        System.out.println(ch.contains('y'));
        for (Character c : ch) {
            System.out.println(c);
        }
        ch.clear();
        System.out.println(ch.contains('e'));
    }
}
