import java.util.*;
import java.util.Scanner;

// import javax.print.DocFlavor.STRING;

class Insta{
    String username = "hk856856@gmail.com";
    private String password = "123456789";

    // validatePassword(password_given_by_user){

    // }
    public void updatePassword(String newPassword){
        password = newPassword;
    }
    public String getPassword(){
        return password;
    }
}


public class p1 {
    public static void main(String[] args) {
        Insta i1 = new Insta();
        System.out.println(i1.username);
        System.out.println(i1.getPassword());
        i1.updatePassword("kumar");
        System.out.println(i1.getPassword());
    }
    
}
