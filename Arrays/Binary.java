package Arrays;

// Revised 
public class Binary {
    public static int BinarySearch(int numbers[],int key){
        int start=0; 
        int end=numbers.length-1;
       
        while(start<=end){
            int mid=(start+end)/2;
                 if(numbers[mid]==key){
                 // if only one element found
                   return mid;
                 }
                 if(numbers[mid]<key){
                   //right side
                   start=mid+1;
                 }
                 else{
                    end=mid-1;
                 }
        } 
        return -1;
    }
    public static void main(String[] args) {
        int numbers[]={2,4,6,8,10,12,14};
        int key=10;
        BinarySearch(numbers, key);
        System.out.println("The index of the key found in  " + BinarySearch(numbers,10));
    }
}
