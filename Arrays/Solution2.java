package Arrays;

public class Solution2 {
    public static int Function(int nums[]){
      int l=0; int r=0;
      int Max_length=Integer.MIN_VALUE;
      while(r<nums.length) {
        
       
            if(nums[r]==1){
                Max_length=Math.max(Max_length, r-l+1);
            }
            if(nums[r]!=1){
                l=r+1;
            }
            r++;
         
        }
        return Max_length;
      }
     
    public static void main(String [] args){
        int nums[]={1,1,0,1,1,1};
       int result= Function(nums);
       System.out.println(result);
    }
}
