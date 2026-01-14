package BinarySearch;

public class Beautifull{
    // Here for the Question i said beautifull becuase here you will see how to apply binary earch on answers 
    // here question stated koko has finish banasa at partular time 
    // 3,6,7,11 h=8 
    // we will be taking ciel here 
    public static int Max(int arr[]){
        int max=Integer.MIN_VALUE;
        int n=arr.length;
        for(int i=0;i<n;i++){
            max=Math.max(max, arr[i]);
        }
        return max;
    }

    public static int Function(int arr[],int mid){
        int totalhors=0;
        int n=arr.length;
        for(int i=0;i<n;i++){
           totalhors += (int) Math.ceil((double) arr[i] / mid);

        }
        return totalhors;
    }

    public static void main(String[] args) {
        int arr[]={3,6,7,11};
        int h=8;
        int low=1;
        int high=Max(arr);
        while(low<=high){
            int mid=low+(high-low)/2;

            int k=Function(arr,mid);
            if(k<=h){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }

        //   Whn thisBreaks Low will be Answers
        
        
    }
}