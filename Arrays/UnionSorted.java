package Arrays;
import java.util.*;
public class UnionSorted {
    public static void Function(int nums1[],int nums2[]){
        HashSet<Integer>set=new HashSet<>();
        for(int i=0;i<nums1.length;i++){
            set.add(nums1[i]);
        }
        for(int i=0;i<nums2.length;i++){
            set.add(nums2[i]);
        }
        @SuppressWarnings("rawtypes")
        Iterator it=set.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
    public static void main(String[]args){
        int nums1[]={1,1,2,3,4,5};
        int nums2[]={2,3,4,4,5};
        Function(nums1, nums2);
    }
}
