package BinarySearch;
// Here We are Going TO Search an Element in Nearley Sorted Array;

public class Numeical4 {
    static int Sorted(int arr[],int Start,int End,int Ele){
        while(Start<=End){
            int mid=(Start+End)/2;

            if(Ele==arr[mid]){
                return mid;
            }
            else if(Ele==arr[mid-1]&&mid-1<=Start){
                return mid-1;
            }
            else if(Ele==arr[mid+1]&&mid+1<=End){
                return mid+1;
            }
            
            if(Ele>arr[mid]){
                Start=mid+2;
            }
            else{
                End=mid-2;
            }

        }
        return 0;
    }
    public static void main(String[] args){
        int arr[]={10,30,20,40,50};
        int Start=0;
        int n=arr.length-1;
        int End=n;
        int Ele=20;
        System.out.println(Sorted(arr, Start, End, Ele));
    }
    
}
