public class DataTypesDemo {
    public static void main(String[] args){
        //Integers
        byte age=23;  //byte -> -128 to 127 valid
        System.out.println(age);
        int x=10;
        System.out.println(x);
        long l=2645L;  //l or L for long
        System.out.println(l);
        short sh=11;
        System.out.println(sh);

        //character
        char ch='c';
        System.out.println(ch);

        //decimal
        float f=2585;  //f=2585.20 will give error -> use f=2585.20f...we use f or F(literals) when we want to distinguish double and float
        System.out.println(f);
        float g=256.45f;   //f denotes floating type
        System.out.println(g);
        double d=2585.2; // in case of double by default d is already there in java therefore no need
        System.out.println(d);

        boolean a=true;
        System.out.println(a);

        String str="abc";
        System.out.println(str);
    }
}
