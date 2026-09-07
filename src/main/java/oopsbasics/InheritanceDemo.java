package oopsbasics;

class Person {
    void add(int a, int b) {
        System.out.println("---IN BASE CLASS---");
        System.out.println("Addition of " + a + " and " + b + " is " + (a + b));
    }
}

class Students extends Person {
    private void subtract(int x, int y) {
        System.out.println("---IN DERIVED CLASS 1---");
        System.out.println("Subtraction of " + x + " and " + y + " is " + (x - y));
    }
}

class Teacher extends Students {
    void result() {
        System.out.println("---IN DERIVED CLASS 2---");
        System.out.println("Addition and Subtraction done!");
    }
}

public class InheritanceDemo {
    public static void main(String[] args) {
        Students obj = new Students();
        //obj.subtract(7,4);     cannot access because of private access modifier as A subclass cannot directly access the private members of its superclass.
        obj.add(6, 7);

        Teacher obj1 = new Teacher();  //Derived class object instantiation
        obj1.add(5, 3); // inherits the method of parent class (oopsbasics.Person)
        //obj1.subtract(12,7);
        obj1.result();
    }
}
