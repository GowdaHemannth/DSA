package Stack;
import java.util.*;


// Here we need to Find sum of All Subarry Numericals And there is Special Case To it So Here That would be 
// Expalined like 

// YOU NEED TO GET THE INDIXES 
// NEXT SMALLER ELEMENT TO LEFT={}
// NEXT SMALLER ELEMSNT TO RIGHT ={}
class Pair{
    int Value;
    int Index;
    Pair(int Value,int Index){
        this.Value=Value;
        this.Index=Index;
    }
}
public class SumofSubArray {
    public static ArrayList<Integer> NSR(int arr[],  ArrayList<Integer>A, Stack<Pair>S){
          int n=arr.length;
        for(int i=n-1;i>=0;i--){
            if(S.isEmpty()){
                A.add(n);
            }
            else if(S.size()>0&&S.peek().Value<arr[i]){
                A.add(S.peek().Index);

            }
            else if(S.size()>0&&S.peek().Value>=arr[i]){
                while (S.size()>0&&S.peek().Value>=arr[i]) {
                    S.pop();
                    
                }
                if(S.size()==0){
                    A.add(n);
                }
                else if(S.peek().Value<arr[i]) {
                    A.add(S.peek().Index);

                }
            }
            // Here these is the MAin Step  Not just For the Inital Steps for So many of them
        S.push(new Pair(arr[i], i));
        }
        Collections.reverse(A);
        return A;
    }
    public static ArrayList<Integer> NSL(int arr[],ArrayList<Integer>B, Stack<Pair>S2){
            int n=arr.length;
        for(int i=0;i<n;i++){
            if(S2.isEmpty()){
                B.add(-1);
            }
            else if(S2.size()>0&&S2.peek().Value<arr[i]){
                B.add(S2.peek().Index);

            }
            else if(S2.size()>0&&S2.peek().Value>=arr[i]){
                while (S2.size()>0&&S2.peek().Value>=arr[i]) {
                    S2.pop();
                    
                }
                if(S2.size()==0){
                    B.add(-1);
                }
                else if(S2.peek().Value<arr[i]) {
                    B.add(S2.peek().Index);

                }
            }
            // Here these is the MAin Step  Not just For the Inital Steps for So many of them
        S2.push(new Pair(arr[i], i));
        }
       
        return B;

    }

    public static void main(String[] args) {
        int arr[]={3,1,2,4};
        ArrayList<Integer>A=new ArrayList<>();
        ArrayList<Integer>B=new ArrayList<>();
        Stack<Pair>S=new Stack<>();
        Stack<Pair>S2=new Stack<>();
        A=NSR(arr, A, S);
        B=NSL(arr, B, S2);
        int sum=0;
        
        for(int i = 0; i < arr.length; i++){
            int left = i - B.get(i);
            int right = A.get(i) - i;
            sum += arr[i] * left * right;
            System.out.println(sum);
        }
        
    }
    
}
