package Arrays;

public class RightRotate {
    public static void Function(int nums[],int k){
       
            int temp[]=new int[k];
            for(int i=nums.length-k;i<nums.length;i++){
                temp[i-nums.length+k]=nums[i];
                
            }
            for(int i=nums.length-k-1; i>=0;i--){
                nums[i+k]=nums[i];
            }
            
            for(int i=0;i<k;i++){
                nums[i]=temp[i];
              
            }
    }
    public static void main(String[] args) {
        int nums[]={1,2,3,4,5,6};
        int k=3;
        
        Function(nums, k);
        for(int i=0;i<nums.length;i++){
            System.out.println(nums[i]);
        }
       
    }
}
