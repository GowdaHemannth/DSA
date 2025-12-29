package Arrays;

import java.util.HashSet;

public class Practice2 {
    public static boolean Function(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]<arr[i+1]){
                return true;
            }
        }
        return false;
    }
     public static void main(String[]args){
        int arr[]={2,4,6,8,10};
       boolean result= Function(arr);
       System.out.println(result);
       HashSet<Integer>Has=new HashSet();
     
     }   
}

