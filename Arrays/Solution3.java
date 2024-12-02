package Arrays;

public class Solution3 {
    public static int Function(int nums[]){
        int hash[] = new int[nums.length+1];
        for(int i=0;i<nums.length;i++){
            hash[nums[i]]++;
        }
        for(int i=0;i<nums.length;i++){
            if(hash[nums[i]]==1){
               System.out.println(nums[i]);
            }
        }
       return -1;
    }
    public static void main (String []args){
        int nums[]={2,2,1};
        Function(nums);
       
    }
}
