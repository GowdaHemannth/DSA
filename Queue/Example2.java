package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class Example2 {
    static class Stack{
        static Queue<Integer>S1=new LinkedList<>();
        static Queue<Integer>S2=new LinkedList<>();
        // Function to check the Function is empty or not
        public static boolean isEmpty(){
            return S1.isEmpty();
        }
        // Adding the Function
        public static void Add(int data){
            while(!S1.isEmpty()){
                S2.add((S1.remove()));
            }
            S1.add(data);
            while(!S2.isEmpty()){
                S1.add(S2.remove());
            }
        }

        // Removing the Elements 
        public static int remove(){
            if(isEmpty()){
                System.out.println("the stack is empty");
                return -1;

            }

          return  S1.remove();
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
       Stack s=new Stack();
        s.Add(1);
      s.Add(2);
    s.Add(3);
        while(!s.isEmpty()){
            System.out.println(s.Peek());
            s.remove();
        }


        
    }
    
}
