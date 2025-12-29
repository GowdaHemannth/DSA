package Arrays;

public class LargestOrSecond {
    public static void Function(int arr[]){
        int Max=Integer.MIN_VALUE;
        for( int i=0;i<arr.length;i++){
            if(arr[i]>Max){
                Max=arr[i];
            }
        }
        int SecondLargesst=Integer.MIN_VALUE;
       for( int i=0;i<arr.length;i++){
        if(arr[i]>SecondLargesst&&arr[i]!=Max){
            SecondLargesst=arr[i];
        }
       }
       System.out.println("The largest Element is "+ Max);
       System.out.println("The second Laegest elemnt is "+ SecondLargesst);
    }
    public static void main(String[] args) {
        int arr[]={2,4,6,8,10};
        Function(arr);
    }
}
