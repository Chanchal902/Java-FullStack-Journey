interface Vehicle{
    void speed(); //interface can have only abstract methods
    void color();
}
// can use multiple interface
interface Building{
     void house(int x);
}
class Around implements Vehicle,Building{
    @Override
    public void speed(){
        System.out.println("Speed of the vehicle is good!");
    }
    @Override
    public void color(){
        System.out.println("color of the vehicle is blue!");
    }
    @Override
    public void house(int x){
        System.out.println("The house costs " + x + " to me!");
    }
}
//Inheritance in interface
interface Environment extends Vehicle , Building{

}
public class InterfacesDemo {
    public static void main(String[] args){
        Vehicle obj=new Around();
        obj.speed();
        obj.color();

        Building obj1=new Around();
        obj1.house(50000);
    }
}
