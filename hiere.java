class bird{
    void searching(){
        System.out.println("birds are searching");
    }
}
    class parrot extends bird{
        void scream(){
            System.out.println("parrot are screaming");
        }
    }
    class parrot1 extends bird{
        void eating(){
            System.out.println("parror1 is eating");
        }

        // public void scream() {
        // }
    }

public class hiere {
    public static void main(String[] args) {
        parrot1 ob = new parrot1();
        parrot p = new parrot();
        ob.eating();
        p.searching();
        p.scream();
        ob.searching();
        // ob.scream();
    
    }
        
}
