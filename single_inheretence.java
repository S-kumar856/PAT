
import java.util.*;
import java.util.Scanner;

class animals{
    void eat(){
        System.out.println("eating");
    }
}
class dog extends animals{
    void bark(){
        System.out.println("barking");
    }
}
class babydog extends dog{
    void sleeping(){
        System.out.println("sleeping");
    }
}
public class single_inheretence {
   

    public static void main(String[] args) {
        babydog db =  new babydog();
        db.eat();
        db.bark();
        db.sleeping();
    }
}
    
                                                                                                                        
