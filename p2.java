import java.util.*;
import java.util.Scanner;

public class p2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
       
        try{
            System.out.println(a/b);

        }catch(Exception e ){
            System.out.println("division is not possible with 0");

        } finally{
            System.out.println("this is a final block");
        }
        System.out.println("progrm is completed");

    }

    
}
