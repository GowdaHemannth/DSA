package SlidingWindow;

public class Twopoints{
    public static int Function( int arr[]){
        int Lsum=0; int Rsum=0;
        int k=4;
        int Maxsum=0;
        for(int i=0;i<k;i++){
            Lsum=Lsum+arr[i];
        }
        Maxsum=Lsum;

        int Right=arr.length-1;
        for(int i=k-1;i>=0;i++){
            Lsum=Lsum-arr[i];
            Rsum=Rsum+arr[Right];
            
            Maxsum=Math.max(Maxsum, Lsum+Rsum);
            
            Right=Right-1;


        }
        return Maxsum;
       
       

    }
    public static void main(String[] args) {
        int arr[]={6,2,3,4,7,2,1,7,1};
    int n=  Function(arr);
    System.out.println(n);
    

    }
    
}