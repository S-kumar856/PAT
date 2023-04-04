import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
// import java.nio.file.Path;
import java.util.Scanner;
// class multiplier{
//     int a; int b; return a*b;
public class file {
     static void multiplier(int a, int b){
        System.out.println(a*b);
    }
    

    public static void main(String[] args) throws FileNotFoundException {
        File file_ob = new File("./py.py");
        Scanner sc = new Scanner(file_ob);
        int x = sc.nextInt();
        int y = sc.nextInt();
        multiplier(x,y);

        // multli m = new multli();
        
        // f.multiplier(filfile f = new file();e_ob);


    }
    
}
