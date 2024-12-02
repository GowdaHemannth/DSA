package Arrays;

public class Solution {
    public static int missingNumber(int nums[]){
        int N=nums.length;
        int hash[] = new int[N + 1];
        for(int i=0;i<N;i++){
            hash[nums[i]]++;
        }
           for(int i=0;i<=N;i++){
            if(hash[i]==0){
                return i;
            }
           }
           return -1;
    }
    public static void main(String[]args){
        int nums[]={0,1,3};
       
     int result=missingNumber(nums);
     System.out.println(result);
    }
    
}
