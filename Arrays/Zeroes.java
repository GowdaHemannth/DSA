package Arrays;
import java.util.*;
public class Zeroes {
    public static void Function(int nums[] ){
       ArrayList<Integer>temp=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
           if(nums[i]!=0){
                temp.add(nums[i]);
           }
        }
        for(int i=0;i<temp.size();i++){
            nums[i]=temp.get(i);
        }
        for(int i=temp.size();i<nums.length;i++){
            nums[i]=0;
        }

    }
    public static void main(String[] args) {
        int nums[]={1,2,4,0,0,0,7};
        Function(nums);
        for(int i=0;i<nums.length;i++){
            System.out.println(nums[i]);
        }
        
    }
}
