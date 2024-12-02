package Recursion;

public class PowerCalcu {
    public static int  Power(int x,int n){
    if(n==0){
        return 1;
    }
      int c= Power(x,n-1);
      int h= c*x;
      return h;

    }


    public static void main(String[] args) {
        @SuppressWarnings("unused")
        int x;
        @SuppressWarnings("unused")
        int n;
    int result=    Power(x=2,n=5);
    System.out.println(result);

    }
}
