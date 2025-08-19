package Stack;
import java.util.ArrayList;
public class Implementtation {
    static  class Stack{
      static ArrayList<Integer>list=new ArrayList<>();
      // 1st Function isEmpty Function 
      public static boolean isEmpty(){
        return list.size()==0;
      }

      // 2nd Function is Add or Push Function 
      public static void Push(int data){
        list.add(data);
      }

      // 3rd Function is Pop or Delete Function
      public static int Pop(){
        if(isEmpty()){
            return -1;
        }
        int top=list.get(list.size()-1);
        list.remove(list.size()-1);
        return top;
      }
      // 4th function is Peek
      public static int  Peek(){
        if(isEmpty()){
            return -1;
        } 
        return list.get(list.size()-1);
      }

    }
    public static void main(String[] args) {
        // creating Stack 
        Stack s=new Stack();
        s.Push(1);
        s.Push(2);
        s.Push(3);
        s.Push(4);

        while (!s.isEmpty()) {
            System.out.println(s.Peek());
            s.Pop();

            
        }
        
    }
}
