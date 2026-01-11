package BinarySearch;
// Here we will be finding minimum differnce from the given elemsnt Key 

public class MiniumumFromSorteed {
     
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
     static int Ciel(int arr[],int Start,int End,int Ele){
      int res=-1;
      while(Start<=End){
       
          
          int mid=(Start+End)/2;
          if(Ele==arr[mid]){
            res=arr[mid];
            return mid;

          }
          else if(Ele>arr[mid]){
          
              Start=mid+1;

          }
          else{
            res=arr[mid];
              End=mid-1;
          }
      }
      return res;
   }


    public static void main (String args[]){
        int arr[]={1,2,3,4,6,10,11,13};
        int Start=0;
        int End=arr.length-1;
        int Ele=12;

        int C= Math.abs(Floor(arr, Start, End, Ele)-Ele) ;

        int H=Math.abs(-Ciel(arr, Start, End, Ele)-Ele);
      

        //  Here I even i doubt like if e find the floor then its enough right for the minum
        // think 1,2,3,7,8,12,13
         // here key element is 11 so as we go by Logic then find floor nad finddiffernce between them then it will be 
         // 3 but 12-11 will be 1 thats minmum so to avoid these kind of situation we will be Doing the 
         // Both Flooor and Ciel 
       if(C>H){
        System.out.println(H);
       }else{
        System.out.println(C);
       }
    
    
    }
}