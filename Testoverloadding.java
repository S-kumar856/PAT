
class multiplier{
    static int multli(int a,int b){
        return a*b;
    }
    static int multli(int a, int b, int c){
        return a*b*c;
    }

}

public class Testoverloadding {
    public static void main(String[] args) {
        System.out.println(multiplier.multli(4, 4));
        System.out.println(multiplier.multli(4, 4, 4));
    }
                                            
}
