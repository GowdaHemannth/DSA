package Arrays; 
public class SubArrays{
    public static void Subarrays(int numbers[]){
       
        for(int i=0;i<numbers.length;i++){
            
       {
            for( int j=i;j<numbers.length;j++){
                for(int k=i;k<=j;k++){
                   System.out.println(numbers[k] +"");
                 
                  
                }
                
                System.out.println();
            }
            System.out.println();
        }
        }
        

        
    }
    public static void main(String[] args) {
        int numbers[]={2,4,6,8,10};
        Subarrays(numbers);

    }
}