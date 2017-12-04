package labwork_JavaProgramming;
import TestPackage.Bank;
class SBI extends Bank{    
    @Override
    public int getRateOfInterest(){return 7;}    
}    
class PNB extends Bank{    
    @Override
    public int getRateOfInterest(){return 8;}    
} 
public class Lab6_Abstract {
    public static void main(String[] args) {
        Bank b;  
        b=new SBI();  
        System.out.println("Rate of Interest is: "+b.getRateOfInterest()+" %");    
        b=new PNB();  
        System.out.println("Rate of Interest is: "+b.getRateOfInterest()+" %");    
        
    }
}
