package oopsbasics;

class Animal {
    void sound() {
        System.out.println("Different ANIMALS produce different sounds");
    }

}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("oopsbasics.Dog Barks");
    }

    void food() {
        System.out.println("oopsbasics.Dog eats meat");
    }
}

class Cat extends Animal {
    void food() {
        System.out.println("oopsbasics.Cat eats mouse");
    }

    @Override
    void sound() {
        System.out.println("oopsbasics.Cat meows");
    }
}

public class PolymorphismDemo {
    public void numberOfAnimal(int a) {
        System.out.println("Total number of Animals are " + a);
    }

    public void numberOfAnimal(int a, int b) {
        System.out.println("Remaining Animals are " + (a - b));
    }

    public static void main(String[] args) {

        // run-time polymorphism
        Animal obj = new Dog(); // actual object -> oopsbasics.Dog , reference -> oopsbasics.Animal
        obj.sound(); // override method of oopsbasics.Dog will be called
        //obj.food(); -> not allowed

        Animal obj1 = new Cat();  // actual object -> oopsbasics.Cat , reference -> oopsbasics.Animal
        obj1.sound();
        //obj1.food(); -> not allowed

        // compile-time polymorphism
        PolymorphismDemo obj2 = new PolymorphismDemo();
        obj2.numberOfAnimal(3);
        obj2.numberOfAnimal(7, 4);
    }
}
