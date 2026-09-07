package collectionsframework;

@FunctionalInterface
interface Skills {
    void dancing();

    default void sleeping() {
        System.out.println("Sleeping is my priority!");
    }
}

@FunctionalInterface
interface TechnicalSkills {
    void coding(int x);
}

@FunctionalInterface
interface Calculate {
    void add(int a, int b, int c);
}

public class LambdaExpressionDemo {
    public static void main(String[] args) {
        // anonymous class
        Skills obj4 = new Skills() {
            public void dancing() {
                System.out.println("Dancing is my Hobby!");
            }
        };
        obj4.dancing();

        //lambda expressions
        // 1. zero parameter lambda
        Skills obj = () -> System.out.println("Dancing is my hobby!");
        obj.dancing();

        //2. single parameter lambda
        TechnicalSkills obj1 = (int x) -> System.out.println("He is good at coding since " + x + " years of age!");
        obj1.coding(12);

        //3. multiple parameter lambda
        Calculate obj2 = (int a, int b, int c) -> System.out.println("Addition of " + a + " , " + b + " and " + c + " = " + (a + b + c));
        obj2.add(2, 3, 4);
    }
}
