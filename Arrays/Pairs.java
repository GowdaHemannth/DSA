package Arrays;

public class Pairs {
    public static void Pairsprint (int numbers[]){
        for(int i=0;i<numbers.length;i++){
            for(int j=i+1;j<numbers.length;j++){
                System.out.println("(" + numbers[i] +" ," + numbers[j] +")");

            }
            System.out.println("");
        }
    }
    public static void main(String[] args) {
        int numbers[]={2,4,6,8,10};
        Pairsprint(numbers);
    }
    
}
