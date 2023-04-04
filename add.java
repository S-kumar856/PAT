import java.util.*;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class add {
    public int add1(){
        int a = 10 ;
        int b = 20 ;
        return a+b;
        // System.out.println(a+b);
    }
    public static void main(String[] args) throws FileNotFoundException {
        // File file = new File("py.py");
        // Scanner sc = new scanner(file);
        add a = new add();
        a.add1();
        System.out.println(a.add1());
    }
}
