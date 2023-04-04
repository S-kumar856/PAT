import java.util.ArrayList;

class Queue{
    ArrayList<Integer> que = new ArrayList<Integer>();
    int size = 5;
    public void push(int element){
        if (que.size()== size){
            System.out.println("queue is overflow");
        }else{
            que.add(element);
        }

    }
    public void pop(){
        if(isEmpty()){
            System.out.println("empty");
        }else{
            que.remove(0);
        }
        
    }
    
    public boolean isEmpty(){
        if(que.size()==0){
            return true;
        }
        return false;
    }
    public void printStack(){
        System.out.println(que);

    }
}
public class queue {
    public static void main(String[] args) {
        Queue q = new Queue();
        q.push(20);
        q.push(10);
        q.push(30);
        q.push(40);
        q.push(50);
        q.printStack();
        q.pop();
        q.printStack();
        q.push(0);
        // System.out.println(q.peek());
        q.printStack();

        
    }
}
