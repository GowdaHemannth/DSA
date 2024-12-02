package Arrays;

public class PrefixSum {
   public static void Function(int numbers[]){
    int currSum=0;
    int MaxSum=Integer.MIN_VALUE;
    int prefix[]=new int[numbers.length];
    // Calculating the prefix Array
    prefix[0]=numbers[0];
    for(int i=1;i<prefix.length;i++){
        prefix[i]=prefix[i-1]+numbers[i];
    }
    for(int i=0;i<numbers.length;i++){
        for (int j=i;j<numbers.length;j++){
            currSum=  i==0?prefix[j]:prefix[j]-prefix[i-1];
            if(MaxSum<currSum){
                MaxSum=currSum;
            }
        }
    }
    System.out.println("The Maximum sum is " + MaxSum);
   }
    public static void main(String[] args) {
     int numbers[]={2,4,6,8,10};
     Function(numbers);

    }
}
