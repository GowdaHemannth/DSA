package BinarySearch;

public class Occurance {

    // Here we are Going to Check the First and Last Ocuurance 
    static int Function(int arr[],int start,int End, int Ele,int res){
    
        while(start<=End){

            // If we Found the Elemnt then its First ocuurance will be find in the left side of it
            int mid=(start+End)/2;
            if(Ele==arr[mid]){
              res =mid;
              // If the Finding out of First Occurance of Elemnt 
              End=mid-1;
              // if It was Finding out For Last ocuurance of then Right Side of Elemnt 
              // Start=mid+1;
            }
           else  if(Ele>arr[mid]){
                start=mid+1;
            }
            else{
               
                End=mid-1;

            }
            
            
        }
        return res;
       
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,5,5,6,7,8,9};
        int start=0;
        int End=arr.length-1;
         int Ele=5;
        int res=-1;
       System.out.println(Function(arr, start, End, Ele,res));  
        
       
      
    }
    
}
