package Arrays;

public class MaxSubSum {
    public static void Function( int numbers[]){
        int  Currsum=0;
        int MaxSum=Integer.MIN_VALUE;
        for(int i=0;i<numbers.length;i++){
           for(int j=i;j<numbers.length;j++){
            Currsum=0;
            for(int k=i;k<=j;k++){
               Currsum= Currsum+numbers[k];
               System.out.println("The sum is" + " "+ Currsum);
            }
            if(MaxSum<Currsum){
                MaxSum=Currsum;
            }
            
           
           }
          
        }
         System.out.println("The maximum sum is " + ""+ MaxSum);
    }
 
     public static void main(String[] args) {
        int numbers[]={2,4,6,8,10};
        Function(numbers);

     }
}
