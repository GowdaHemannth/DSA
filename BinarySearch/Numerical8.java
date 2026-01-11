package BinarySearch;


// Previously we have Learnt Concept where we can Actually apply the Concept Here that 
// we can Apply THE Binary Search on Un-sorted ARRAY aSWELL
public class Numerical8 {
    static int Peek(int arr[],int Start,int End){
        while(Start<=End){
            int mid=(Start+End)/2;
            if(mid>0&&mid<=End-1){
                if(arr[mid]>arr[mid-1]&&arr[mid]>arr[mid+1]){
                    return arr[mid];
                }
                else if(arr[mid]<arr[mid+1]){
                    Start=mid+1;
                }
                else{
                    End=mid-1;
                }

            }
            else if(mid==0){
                if(arr[0]>arr[1]){
                    return arr[0];
                }
                else{
                    return arr[1];
                }

            }
            else if(mid==End){
                if(arr[End]>arr[End-1]){
                    return arr[End];
                }
                else{
                    return arr[End-1];
                }
            }

        }
        return 0;
    }
    public static void main(String [] args){
        int arr[]={5,10,8,15,25,30};
        int Start=0;
        int End=arr.length-1;
      System.out.println(Peek(arr, Start, End))  ;
        


    }
    
}
