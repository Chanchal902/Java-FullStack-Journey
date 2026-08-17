package collectionsframework;

import java.util.List;
import java.util.LinkedList;
import java.util.Collections;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> cars = new LinkedList<String>();
        var truck = new LinkedList<String>();
        List<String> vehicle = new LinkedList<String>();
        cars.add("nano");
        cars.add("BMW");
        cars.add("Yamaha");
        System.out.println(cars.get(0));
        System.out.println(cars.get(1));
        System.out.println(cars.get(2));
        cars.addFirst("honda");
        cars.addFirst("rolls royal");
        cars.addLast("farari");
        System.out.println("---------------------");
        for (int i = 0; i < cars.size(); i++) {
            System.out.println(cars.get(i));
        }
        System.out.println("------sorting------");
        Collections.sort(cars);
        for (int i = 0; i < cars.size(); i++) {
            System.out.println(cars.get(i));
        }
        cars.remove(3);
        cars.removeFirst();
        cars.removeLast();
        System.out.println("---------------------");
        for (int i = 0; i < cars.size(); i++) {
            System.out.println(cars.get(i));
        }
        System.out.println("------yeah!------");
        System.out.println(cars.getFirst());
        System.out.println(cars.getLast());
        System.out.println("-----next phase!------");
        truck.add("Powerful");
        System.out.println(truck.get(0));
        vehicle.add("cycle");   // vehicle can access the methods available through the List interface
        vehicle.set(0, "motorbikes");
        System.out.println(vehicle.get(0));

    }
}
