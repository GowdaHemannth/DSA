package Stack;
import java.util.*;
import java.util.ArrayList;

public class Example2 {
    // Question number 2 next largest Element Nearest to get to the right
    public static void Function(int arr[], Stack<Integer>s,ArrayList<Integer>a){
        int n=arr.length;
        for(int i=n-1;i>=0;i--){
            if(s.isEmpty()){
                a.add(-1);
            }
            else if(s.size()>0&&s.peek()>arr[i]){
                a.add(s.peek());

            }
            else if(s.size()>0&&s.peek()<=arr[i]){
                while (s.size()>0&&s.peek()<=arr[i]) {
                    s.pop();
                    
                }
                if(s.size()==0){
                    a.add(-1);
                }
                else if(s.peek()>arr[i]) {
                    a.add(s.peek());

                }
            }
            s.push(arr[i]);
        }
        Collections.reverse(a);
    }
   
    public static void main(String[] args) {
        int arr[]={1,3,4,4};
        Stack<Integer>s=new Stack<>();
        ArrayList<Integer>a=new ArrayList<>();
        Function(arr,s,a);
      System.out.println(a);
    }
    
}
