package Arrays;

public class LeftRotation {
    public static void Function(int nums[], int n){
       
        int temp[]=new int[nums.length];
         temp[n-1]=nums[0];
         
        for( int i=1;i<nums.length;i++){
            temp[i-1]=nums[i];
        }
            for( int j=0;j<temp.length;j++){
                System.out.println(temp[j]);
            }
            System.out.println();
        
    }
    public static void main(String[] args) {
        int nums[]={2,4,6,8,10};
       int n=5;
        Function(nums,n);
       
    }
    
}
