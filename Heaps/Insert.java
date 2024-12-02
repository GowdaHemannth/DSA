package Heaps;
import java.util.*;

public class Insert {
     static class Heap{
        ArrayList<Integer>arr=new ArrayList<>();

        public void add(int data){
           arr.add(data);
           int x=arr.size()-1;
           int p=(x-1)/2;

           while(arr.get(x)<arr.get(p)){
            int temp=arr.get(x);
            arr.set(x, arr.get(p));
            arr.set(p, temp);
            x=p;
            p=(x-1)/2;
           }
        }
        public int peek(){
            return arr.get(0);
        }
       



        // 2nd Problem How To remove element from Heap;
         private void heapify(int i){
            int left=2*i+1;
            int right=2*i+2;
            int minIdx=i;

            if(left<arr.size()&&arr.get(minIdx)>arr.get(left)){
                minIdx=left;
            }

            if(right<arr.size()&&arr.get(minIdx)>arr.get(right)){
                minIdx=right;

            }
            if(minIdx!=i){
                // Now Swapping 
                int temp=arr.get(i);
                arr.set(i, arr.get(minIdx));
                arr.set(minIdx,temp);
                heapify(minIdx);
            }
         }
        // Deleting the Element 
        public int remove(){
            int data=arr.get(0);

         
           

        
            int temp=arr.get(0);
            arr.set(0,arr.get(arr.size()-1));
            arr.set(arr.size()-1,temp);

            arr.remove(arr.size()-1);

           
            heapify(0);
            return data;


        }
                public boolean isEmpty() {
                   return arr.size()==0;
                }
             }
            public static void main(String[] args) {
                Heap h=new Heap();
                h.add(4);
                h.add(3);
                h.add(2);
                h.add(1);
                while(!h.isEmpty()){
            System.out.println(h.peek());
                h.remove();
        }
        
        
    }
    
}
