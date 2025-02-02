package BinarySearch;

public class Numerical7 {
    // Here we are Going to Find the MMInimum Differnce Between the elements in Soreted Array 
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
        int Ele=7;
        int C= Math.abs(Floor(arr, Start, End, Ele)-Ele) ;

        int H=Math.abs(-Ciel(arr, Start, End, Ele)-Ele);
      
        if(C>H){
          System.out.println(H);
      
        }else{
          System.out.println(C);

    }
    
    }
}