 abstract class fruits{
    abstract void colour();
    
}
    class apple extends fruits{
        void colour(){
            System.out.println("apple is a red in colour");
        }
    }
    class mango extends fruits{
        void colour(){
            System.out.println("mango is a yellow");
        }
    }
    class banana extends fruits{
        void colour(){
            System.out.println("banana is sweet");
        }
    }

public class abstract1 {
    public static void main(String[] args) {
        mango m = new mango();
        apple a = new apple();
        banana b = new banana();
        m.colour();
        a.colour();
        b.colour();
    }
    
}
