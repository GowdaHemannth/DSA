package Arrays;

public class SubArraySum {
    public static void Subarraysum(int numbers[]){
        int  sum=0;
        for(int i=0;i<numbers.length;i++){
           for(int j=i;j<numbers.length;j++){
            for(int k=i;k<=j;k++){
              sum=sum+numbers[k];
               System.out.println("The sum is" + " "+ sum);
            }
            sum=0;
            System.out.println();
           }
        }System.out.println();
    }
    public static void main(String[] args) {
        int numbers[]={2,4,6,8,10};
        Subarraysum(numbers);
    }
}
