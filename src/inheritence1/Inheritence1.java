package inheritence1;
import java.util.*;
class a1{
    int a,b,c;
    a1(){
        a=10;b=20;
    }
    void area(){
        c=a*b;
    }
    void display(){
        System.out.println("Ashish");
        
        System.out.println("Area " + c);
    }
}
class a2 extends a1{
    
    int a,b,c;
    a2(){
        a=10;b=20;
    }
    void peri(){
        c=2*(a+b);
    }
    void display(){
        area();
        super.display();
        System.out.println("Perimeter " + c);
    }
    
}
        
public class Inheritence1 {
    public static void main(String[] args) {
        a2 obj=new a2();
        obj.peri();
        obj.display();
    }
    
}
