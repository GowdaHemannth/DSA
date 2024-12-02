package SlidingWindow;

public class Example3 {
    // Function to find out the Maximum ones Found in the array
    public static int Function(int arr[]){
        int MaxLength=0;
        int l=0;int r=0;
        while(r<arr.length){
            if(arr[l]==1){
                MaxLength=Math.max(MaxLength, r-l+1);
                r=r+1;
            }
            if(arr[r]==0){
                l=r+1;
                r=r+1;
            }

        }
        return MaxLength;
    }
    public static void main(String[] args) {
        int arr[]={1,1,1,0,0,0,1,1,1,1,0};
      int n=  Function(arr);
      System.out.println(n);
    }
    
}
