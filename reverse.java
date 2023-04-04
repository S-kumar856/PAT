import java.util.Stack;

public class reverse {
    public static void main(String[] args) {
        Stack s1 = new Stack<>();
        s1.push(10);
        s1.push(20);
        s1.push(30);
        s1.push(40);
        Stack s2 = new Stack<>();
        s2.push(s1.pop());
        s2.push(s1.pop());
        s2.push(s1.pop());
        s2.push(s1.pop());
    }
    
}
