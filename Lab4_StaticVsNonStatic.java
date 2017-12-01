
package labwork_JavaProgramming;

public class Lab4_StaticVsNonStatic {
    static int x = 0;
    int y = 0;

    public Lab4_StaticVsNonStatic() {
        System.out.println("New Object Created!");
        x++;
        y++;
        show();
    }
    public void show(){
        System.out.println("Static variable count: " + x);
        System.out.println("Non-Static variable count: " + y + "\n");
    }
   
    public static void main(String[] args) {
        Lab4_StaticVsNonStatic obj1 = new Lab4_StaticVsNonStatic();
        Lab4_StaticVsNonStatic obj2 = new Lab4_StaticVsNonStatic();
        Lab4_StaticVsNonStatic obj3 = new Lab4_StaticVsNonStatic();
        
    }
}


