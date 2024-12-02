package Stack;
import java.util.*;

public class Reverse {
    public static void Function(Stack<Integer>s,int target){
        if(s.size()==0){
            s.push(target);
            return;
        }
       int top= s.pop();
        Function(s, target);
        s.push(top);
    }
    public static void PushBottom(Stack<Integer>s){
        if(s.size()==0){
            return;
        }
    int target= s.pop();
    PushBottom(s);
    Function(s, target);

    }
    public static void main(String[] args) {
        Stack<Integer>s=new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        PushBottom(s);
        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
            
        }

    }
}
