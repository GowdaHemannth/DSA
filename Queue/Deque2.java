package Queue;
import java.util.Deque;
import java.util.LinkedList;;
public class Deque2 {
    static class dequee{
      static  Deque<Integer>d=new LinkedList<>();
      // 1st function is is Empty Function
        public static boolean isEmpty(){
            return d.isEmpty();
        }
        // 2nd Function is Push Function
        public static void Add(int data){
            d.addLast(data);
        }
        // 3rd Function is to Pop Function 
        public static int Remove(){
          return   d.removeFirst();
        }
        // 4th function is Peek Function 
        public static int Peek(){
            return d.getFirst();
        }
    }
    @SuppressWarnings("static-access")
    public static void main(String[] args) {
        dequee D=new dequee();
        D.Add(1);
        D.Add(2);
        D.Add(3);
        D.Add(4);
        D.Add(5);
         while(!D.isEmpty()){
            System.out.println(D.Peek());
            D.Remove();
         }

        
    }
    
}
