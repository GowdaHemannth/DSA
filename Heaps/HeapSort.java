package Heaps;

public class HeapSort {

    public static void Heapify(int arr[],int i,int size){

        int Left=2*i+1;
        int Right=2*i+2;
        int Maxidx=i;

        if(Left<size&&arr[Left]>arr[Maxidx]){
            Maxidx=Left;
        }

        if(Right<size&&arr[Right]>arr[Maxidx]){
            Maxidx=Right;
        }
       
        if(Maxidx!=i){
            int temp=arr[i];
            arr[i] =arr[Maxidx];
            arr[Maxidx]= temp;
            Heapify(arr, Maxidx, size);
            
        }
    }
    public static void HeapSort(int arr[]){
        int n=arr.length;
        for(int i=n/2;i>=0;i--){
            Heapify(arr,i,n);
        }

        // 2nd Step push the largest element at the back

        for(int i=n-1;i>=0;i--){
            int temp=arr[0];
            arr[0]=arr[i];
            arr[i]=temp;
            Heapify(arr,0,i);
        }
    }
    public static void main(String[] args) {
        int arr[]={1,2,4,5,3};
        HeapSort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i] + " ");

        }
    }
    
}
