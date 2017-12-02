package labwork_JavaProgramming;


class ABC{
    ABC(int a){
        System.out.print("This is the parent class.");
        System.out.println("(called by child class) a = " + a);
    }
}

public class Lab4_ThisAndSuper extends ABC {
   
    Lab4_ThisAndSuper(int a){
        super(a);
    }
    Lab4_ThisAndSuper(){
        this(10);
    }
    
    public static void main(String[] args) {
        Lab4_ThisAndSuper obj = new Lab4_ThisAndSuper();
        
    }
}

