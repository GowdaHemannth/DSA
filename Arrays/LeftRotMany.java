package Arrays;

public class LeftRotMany {
    public static void Function(int nums[] ,int k){
      int temp[]={nums[0],nums[1],nums[2]};
       for(int i=k;i<nums.length;i++){
        nums[i-k]=nums[i];
        
        
       }
       int j=0;
       for(int i=nums.length-k; i<nums.length;i++){
           nums[i]=temp[j];
           j++;
       }
      
    }
    public static void main(String[] args) {
        int nums[]={1,2,3,4,5,6,7};
        int k=3;
        Function(nums, k);
        for(int i=0;i<nums.length;i++){
            System.out.println(nums[i]);
        }
       
    }
}
