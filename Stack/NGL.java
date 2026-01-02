import java.util.ArrayList;
import java.util.Collection;
import java.util.Stack;

public class NGL {
    public static void Function(int arr[],Stack<Integer>s,ArrayList<Integer>a){
        // here 1st step should be starting from inital For Loop
        int n=arr.length;
        for(int i=0;i<n;i++){
            // 2nd step if a Stack empty and reason for inserting 1st elemsnt is we Now 1st elesmtn 
            // Niether have smmaleest or greatest
            if(s.isEmpty()){
                a.add((-1));
            }else if(s.size()!=0 &&s.peek()>arr[i]){
                a.add(s.peek());

            }else if(s.size()!=0 &&s.peek()<=arr[i]){
                   while (s.size()!=0 &&s.peek()<=arr[i]) {
                    s.pop();
                    
                   }
                   if(s.isEmpty()){
                    a.add(-1);
                   }
                   if(s.peek()>arr[i]){
                    a.add(s.peek());
                   }
            }
            s.push(arr[i]);
        }
        Collection.reverse(a);
    }
    public static void main(String[] args) {
        
    }
    
}
