package BinarySearch;

public class Numerical5 {
     // Finding The Floor and The Ceil of the Given Sorted Array
     static int  Floor(int arr[],int Start,int End,int Ele){
        int res=-1;
        while(Start<=End){
         
            
            int mid=(Start+End)/2;
            if(Ele==arr[mid]){
              res=arr[mid];
              return mid;

            }
            else if(Ele>arr[mid]){
                res=arr[mid];
                Start=mid+1;

            }
            else{
                End=mid-1;
            }
        }
        return res;
     }
     public static void main(String []args){
        int arr[]={1,2,3,4,6,10,12,19};
        int Start=0;
        int End=arr.length-1;
        int Ele=6;
      System.out.println(Floor(arr, Start, End, Ele));
   
       

     }
    
}
