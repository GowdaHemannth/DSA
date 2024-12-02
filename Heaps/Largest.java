package Heaps;
import java.util.*;

public class Largest {
    public static int Function(int arr[], PriorityQueue<Integer> maxHeap ,int k){
      for(int i=0;i<arr.length;i++){
        maxHeap.add(arr[i]);
        if(maxHeap.size()>k){
            maxHeap.remove();
        }

      }
      return maxHeap.peek();

    }
     
    // 3 largest Elemnts we need to Return 

    public static void  Largest(   PriorityQueue<Integer>MinHeap,int arr[],int k){

      for(int i=0;i<arr.length;i++){
        MinHeap.add(arr[i]);
        if(MinHeap.size()>k){
          MinHeap.remove();
        }

      } 
    }

    // 3rd Numerical finding the k closet Numbers 

    

    public static void main(String[] args) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Comparator.reverseOrder());
        PriorityQueue<Integer>MinHeap=new PriorityQueue<>();
        int arr[]={7,10,4,3,20,15};
        int k=3;
       //System.out.println(Function(arr, maxHeap, k)); 
       Largest(MinHeap, arr, k);
       while(!MinHeap.isEmpty()){
        System.out.println(MinHeap.peek());
        MinHeap.remove();
       }
        
        
    }
    
}
