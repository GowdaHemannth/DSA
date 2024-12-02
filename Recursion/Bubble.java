package Recursion;

public class Bubble {
    public static void Function(int arr[],int r,int c){
        if(r==0){
            return;
        }
        if(c<r){
            if(arr[c]>arr[c+1]){
            int temp=arr[c];
            arr[c]=arr[c+1];
            arr[c+1]=temp;
           
        }
        Function(arr, r, c+1);
    }
      
        else{
            Function(arr, r-1, 0);
        }
        
    }
    public static void main(String[] args) {
        int arr[]={5,4,3,2,1};
        Function(arr,arr.length-1, 0);
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
