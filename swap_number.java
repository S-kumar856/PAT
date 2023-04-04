// class swapNumberWithtemp{


    public static void swapnumber(int a, int b)
    {
    int temp = a;
    a=b;
    b=temp;

}
    public static void swapnumberwihtouttemp(int a, int b){
        b = b+a;
        a = b-a;
        b= b-a;
    }

public class swap_number {
    public static void main(String[] args) {
        int a = 100;
        int b = 200;
        swapnumber(a,b);
        System.out.printf("%d,%d",a, b);
    }

    private static void swapnumber(int a, int b) {
    }

    
}
