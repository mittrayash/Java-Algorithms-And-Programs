package labwork_JavaProgramming;

interface Vehicle{
    public void wheels();
    default public void mileage(){
        System.out.println("Mileage : 23 kmpl");
    };
    public static int square(int x){
        return x*x;
    }
}
class Bike implements Vehicle{

    @Override
    public void wheels() {
        System.out.println("Wheels: 2"); //To change body of generated methods, choose Tools | Templates.
    }
    public void mileage(){
        System.out.println("Mileage : 38 kmpl");
    }   
}
class Car implements Vehicle{

    @Override
    public void wheels() {
        System.out.println("Wheels: 4"); //To change body of generated methods, choose Tools | Templates.
    }
}
public class Lab5_Interfaces{
    public static void main(String[] args) {
        Car obj = new Car();
        System.out.println("This is class Car: ");
        obj.wheels();
        obj.mileage();
        System.out.println("-----------------------");
        System.out.println("This is class Bike");
        Bike obj1 = new Bike();
        obj1.wheels();
        obj1.mileage();
        System.out.println("-----------------------");
        System.out.println("This is a static method");
        System.out.println(Vehicle.square(2));
    }
}