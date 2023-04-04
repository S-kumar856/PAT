import java.util.*;
import java.util.Scanner;




class A{
    String name = "in class A";
    public void welcome(){
        System.out.println("welcome to a class A");
    }
}

class B extends A{

}
public class p4{
    public static void main(String[] args) {
        B ob = new B();
        System.out.println(ob.name);
        ob.welcome();
    }
}




