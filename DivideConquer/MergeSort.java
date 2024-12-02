package DivideConquer;

public class MergeSort {
    public static void Function(int arr[],int si,int ei){
        if(si>=ei){
            return;
        }

        int mid=(si+ei)/2;
        // Left side of an array
        Function(arr, si, mid);
        // right side of an array
        Function(arr, mid+1, ei);
        merge(arr,si,mid,ei);

    }
    public static void merge(int arr[],int si,int mid,int ei){
        int temp[]=new int[ei-si+1];
        int i=si; //left iterator
        int j=mid+1; // right iterator
        int k=0;
        while(i<=mid&&j<=ei){
            if(arr[i]<arr[j]){
                temp[k]=arr[i];
                i++;k++;
            }
            else{
               temp[k]=arr[j];
                j++;k++;
            }
        }
        // now if right part got over then copt the remianing lest part to the temp array
        while(i<=mid){
            temp[k++]=arr[i++];
        }
        // now if the left part got over and then add the right part to the array
        while(j<=ei){
            temp[k++]=arr[j++];
        }
        // now copy the values from the temporary array to the original 
        for( k=0, i=si;k<temp.length;k++,i++){
            arr[i]=temp[k];

        }
    }
    public static void main(String[] args) {
        int arr[]={6,3,9,5,2,8};
        Function(arr, 0, arr.length-1);
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
