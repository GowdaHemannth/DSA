package SlidingWindow;

import java.util.HashMap;

public class Example4 {
    // Here the qustion states that  maximum fruits
    public static int Function(int arr[]){
        int n=arr.length;
        int l =0;
        int r=0;
        int MaxLength=0;
        int k=2;
        HashMap<Integer,Integer>Hash=new HashMap<>();
        while(r<n){
            

            Hash.put(arr[r],Hash.getOrDefault(arr[r], 0)+1);

            if(Hash.size()>k){
                        while(Hash.size()>2){
                                   Hash.put(arr[l],Hash.getOrDefault(arr[l],0)-1);
                                      if(Hash.get(arr[l])==0){
                                         Hash.remove(arr[l]);
                }  
                l++;                  
                }
            }
            else{
                int length=r-l+1;
                MaxLength=Math.max(MaxLength, length);
               
            }
            r=r+1;
        }
        return MaxLength;
    }
    public static void main(String[] args) {
        int arr[]={3,3,3,1,2,2,1,2,3,4};
        int n=Function(arr);
        System.out.println(n);
    }
    
}
