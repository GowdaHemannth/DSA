package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class Example5 {
    public static void Function(Queue<Integer>q,int arr[]){
      
        Queue<Integer>a=new LinkedList<>();
        for(int i=0;i<arr.length;i++){
            while(!q.isEmpty()){
                a.add(q.remove());
    
            }
            q.add(arr[i]);
            while(!a.isEmpty()){
                q.add(a.remove());
    
            }


    
        }
        }
       
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        Queue<Integer>q=new LinkedList<>();
        Function(q,arr);
        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
        
    }
    
}
