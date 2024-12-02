package Queue;
import java.util.*;
public class Example1 {
    static class Queue{
        static Stack<Integer>S1=new Stack<>();
        static Stack<Integer>S2=new Stack<>();
        // Function to check the Function is empty or not
        public static boolean isEmpty(){
            return S1.isEmpty();
        }
        // Adding the Function
        public static void Add(int data){
            while(!S1.isEmpty()){
                S2.push(S1.pop());
            }
            S1.push(data);
            while(!S2.isEmpty()){
                S1.push(S2.pop());
            }
        }

        // Removing the Elements 
        public static int remove(){
            if(isEmpty()){
                System.out.println("the stack is empty");
                return -1;

            }

          return  S1.pop();
        }
        
        // Peek the element 
        public static int Peek(){
            if(isEmpty()){
                System.out.println("the stack is empty");

            }
            return S1.peek();
        }

    }
    @SuppressWarnings("static-access")
    public static void main(String[] args) {
        Queue q=new Queue();
        q.Add(1);
        q.Add(2);
        q.Add(3);
        while(!q.isEmpty()){
            System.out.println(q.Peek());
            q.remove();
        }


        
    }
    
}
