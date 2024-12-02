package Sorting;

public class SelectionSort {
    public static void Function(int arr[]){
         for(int turns=0;turns<arr.length-1;turns++){
            int MiniPosi=turns;
            for(int j=turns+1;j<arr.length;j++){
               if(arr[MiniPosi]>arr[j]){
                MiniPosi=j;
               }
            }
            // Swapping the elements
            int temp=arr[MiniPosi];
             arr[MiniPosi]=arr[turns];
             arr[turns]=temp;
         }
    }
    public static void main(String[] args) {
        int arr[]={5,4,3,2,1};
        Function(arr);
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
