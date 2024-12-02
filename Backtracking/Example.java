package Backtracking;

public class Example {
    public static void Change(int arr[],int i,int val){
        if(i==arr.length){
            return;
        }
        arr[i]=val;
        Change(arr,i+1,val+1);
        arr[i]=arr[i]-2;
        
    }
    public static void main(String[] args) {
        int arr[]=new int[5];
        
        Change(arr,0,1);
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        System.out.println();
    }
    
}
