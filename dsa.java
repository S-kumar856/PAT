import java.util.ArrayList;

class stack{
    ArrayList<Integer> stk = new ArrayList<Integer>();
    int size = 5;
    public void push(int element){
        if (stk.size()== size){
            System.out.println("stack is overflow");
        }else{
            stk.add(element);
        }

    }
    public void pop(){
        if(isEmpty()){
            System.out.println("stack is empty");
        }else{
            stk.remove(stk.size()-1);
        }

    }
    public int peek(){
        if(!isEmpty()){
            return stk.get(stk.size()-1);

        }else{
            System.out.println("stack is empty");
            return -1;
        }

    }
    public boolean isEmpty(){
        if(stk.size()==0){
            return true;
        }
        return false;
    }
    public void printStack(){
        System.out.println(stk);

    }
}
public class dsa {
    public static void main(String[] args) {
        stack st = new stack();
        st.push(20);
        st.push(10);
        st.push(30);
        st.push(40);
        st.push(50);
        st.printStack();
        st.pop();
        st.printStack();
        st.push(60);
        System.out.println(st.peek());
        st.printStack();

        
    }
}
