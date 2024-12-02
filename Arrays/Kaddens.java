package Arrays;

public class Kaddens {
    public static void Kaddans(int numbers[]){
        int currsum=0;
        int Maxsum=Integer.MIN_VALUE;
        for( int i=0;i<numbers.length;i++){
            currsum=currsum+numbers[i];
            if(currsum<0){
                currsum=0;
            }
            Maxsum=Math.max(Maxsum, currsum);
        }
        System.out.println("The maxmum sum is " + Maxsum);
    }
    public static void main(String[] args) {
        int numbers[]={2,-4,6,-4,10};
        Kaddans(numbers);
    }
}
