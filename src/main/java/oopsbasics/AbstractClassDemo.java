package oopsbasics;

abstract class Base {
    void skills() {
        System.out.println("Speaking skills!");
    }  // non-abstract method

    Base() {
        System.out.println("CONSTRUCTOR!");
    }

    abstract void talent();  //abstract method

    abstract void confidence(int a);  //abstract method
}

//1. overridding oopsbasics.Base class abstract method in oopsbasics.Derived class [concrete class]
class Derived extends Base {
    @Override
    void talent() {
        System.out.println("Good at Painting!");
    }

    @Override
    void confidence(int a) {
        System.out.println("Low confidence!");
    }
}

//2. Making oopsbasics.Derived1 class an abstract class
abstract class Derived1 extends Base {
    abstract void talent();  // not necessary bcz talent() and confidence() are already declared as abstract in the base class

    abstract void confidence(int a);
}

public class AbstractClassDemo {
    public static void main(String[] args) {
        Base obj = new Derived();//can assign reference of an abstract class but cannot create an object of an abstract class
        obj.talent();
        obj.confidence(22);
        obj.skills();

        //oopsbasics.Base obj1=new oopsbasics.Base();  you cannot create an object of an abstract class
        //oopsbasics.Base obj2=new oopsbasics.Derived1();  you cannot create an object of an abstract class
    }
}
