package oopsbasics;

class A {
    A() {
        System.out.println("---IN BASE CLASS DEFAULT CONSTRUCTOR---");
    }

    A(int x) {
        System.out.println("---In parameterised constructor oopsbasics.A---" + x);
    }
}

class B extends A {
    B() {
        super(1000);    // To call the constructor with parameters , we use super();
        System.out.println("---IN DERIVED CLASS DEFAULT CONSTRUCTOR---");
    }

    B(int y) {
        //super(1000);
        System.out.println("---In parameterised constructor oopsbasics.B---" + y);
    }
}

public class SuperDemo {
    public static void main(String[] args) {
        //when a derived class is extended from the base class , constructor of the base class is executed first followed by the constructor of the derived class..
        B obj = new B();  // No-Argument constructor of oopsbasics.B is called

        B obj1 = new B(999);
    }
}
