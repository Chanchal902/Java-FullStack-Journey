package methods;

public class MethodOverloadingDemo {
    //     int change(int x, int y){
//        System.out.println("----IN METHOD 1---");
//        if(x>y) x=99;
//        return x;
//    }
//
//     int change2(int[] arr){
//        arr[2]=66;
//        return arr[2];
//    }
    void add() {
        System.out.println("IN METHOD Add");
    }

    void add(int x) {
        System.out.println("IN METHOD " + x);
    }

    public static void main(String[] args) {
//        int a;
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter the first number:");
//        a=sc.nextInt();
//        int b;
//        System.out.println("Enter the second number:");
//        b=sc.nextInt();
//        methods.MethodOverloadingDemo obj=new methods.MethodOverloadingDemo();
//        int c=obj.change(a,b);
//        System.out.println(a + " " + b);
//
//        int[] arr=new int[a];
//        System.out.println("Enter the elements of an array:");
//        for(int i=0;i<a;i++){
//            arr[i]=sc.nextInt();
//        }
//        obj.change2(arr);
//        System.out.println("new value of arr[2]="+arr[2]);
//
        MethodOverloadingDemo obj = new MethodOverloadingDemo();
        obj.add();
        obj.add(63);

    }
}
