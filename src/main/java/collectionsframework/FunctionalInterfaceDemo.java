package collectionsframework;

@FunctionalInterface
interface Activity {
    void hobby();

    default void interest() {
        System.out.println("My interest is same as my hobby!");
    }

    static void print() {
        System.out.println("This is static method!");
    }
}

class Work implements Activity {
    @Override
    public void hobby() {
        System.out.println("Singing");
    }
}

public class FunctionalInterfaceDemo {
    public static void main(String[] args) {
        Activity obj = new Work();
        obj.hobby();
        obj.interest();
        Activity.print();
    }
}
