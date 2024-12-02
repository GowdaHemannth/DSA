package Stack;

import java.util.Stack;

public class Example1 {
    public static void Function(Stack<Integer>s,int target){
        if(s.size()==0){
            s.push(target);
            return;
        }
       int top= s.pop();
        Function(s, target);
        s.push(top);
    }
   
    public static void main(String[] args) {
        Stack<Integer>s=new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        int target=4;
     Function(s, target);
     while (!s.isEmpty()) {
        System.out.println(s.peek());
        s.pop();

        
    }
    }
}
