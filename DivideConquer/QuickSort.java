package DivideConquer;

public class QuickSort {
    public static void Function(int arr[],int si,int ei){
        if(si>=ei){
            return;
        }
        int Pidx=Partition(arr, si, ei);
        Function(arr, si, Pidx-1);
        Function(arr,Pidx+1,ei);
      
    }
public static int Partition(int arr[],int si,int ei){
    int i=si-1;
    int pivot=arr[ei];
       // now swapping 
       for (int j=si;j<ei;j++){
        if(arr[j]<=pivot){
            i++;
           int  temp=arr[j];
            arr[j]=arr[i];
            arr[i]=temp;
        }
       }
       i++;
           int  temp=pivot;
            arr[ei]=arr[i];
            arr[i]=temp; 
            return i;
}
    public static void main(String[] args) {
        int arr[]={5,4,3,2,1};
        Function(arr,0,arr.length-1);
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
