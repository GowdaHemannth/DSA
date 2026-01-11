package BinarySearch;

public class FirstAndLastOccurance {
    static int Occurance(int arr[],int Ele,int Start,int End,int res){
        
        while(Start<=End){
            int mid=Start+(End-Start)/2;
            if(Ele==arr[mid]){
                End=mid-1;
                res=mid;

            }
            else if(Ele>arr[mid]){
                Start=mid+1;

            }
            else{
            End=mid-1;
            }

        }
        return res;
    
    }
    static int Last(int arr[],int Ele,int Start,int End,int res){
        while(Start<=End){
            int mid=Start+(End-Start)/2;
            if(Ele==arr[mid]){
               Start=mid+1;
                res=mid;

            }
            else if(Ele>arr[mid]){
                Start=mid+1;

            }
            else{
            End=mid-1;
            }

        }
        return res;
    
    }

    
    public static void main(String[] args){
        int arr[]={1,2,4,5,5,6,7,8,9};
        int Ele=5;
        int Start=0;
        int End=arr.length-1;
        int res=-1;
   int s=Occurance(arr, Ele, Start, End, res);
   int h=Last(arr, Ele, Start, End, res);
   System.out.println(h-s+1);

    }
    
}
