package BinarySearch;

// Its Also the Type of Numerical like Previous Ones where bwe use Binary Seacrh on Answer 
// we might think how fo i got know apply this mwthod even i dont Know just Observe

// PEEK ELEMSNT IS NOTHGING BUT THE IF I arr[i] is greater thn arr[i-1] and arr[i+1]

public class Peek {
    static int Peek(int arr[],int Start,int End){
        while(Start<=End){
            int mid=(Start+End)/2;
            // here we left Mid==0 Becuase if its First then thereis no left elesmnt for that we have Seperate Edge Case
            if(mid>0&&mid<=End-1){
                if(arr[mid]>arr[mid-1]&&arr[mid]>arr[mid+1]){
                    return arr[mid];
                }
                else if(arr[mid]<arr[mid+1]){
                    Start=mid+1;
                }
                else{
                    End=mid-1;
                }

            }
            // Here if mid==0 then we have only Right Elesmhnt
            else if(mid==0){
                if(arr[0]>arr[1]){
                    return arr[0];
                }
                else{
                    return arr[1];
                }

            }// Here WE hAve only Right Elemsnmt
            else if(mid==End){
                if(arr[End]>arr[End-1]){
                    return arr[End];
                }
                else{
                    return arr[End-1];
                }
            }

        }
        return 0;
    }
    public static void main(String [] args){
        int arr[]={5,10,8,15,25,30};
        int Start=0;
        int End=arr.length-1;
      System.out.println(Peek(arr, Start, End))  ;
        


    }
    
}
