package Recursion;

public class Fibonnocci{
    static int Fibonn(int  n){
        //Base condition 

        if(n<2){
            return n;
        }
          return Fibonn(n-1)+Fibonn(n-2);
    }
    public static void main(String[] args) {
        System.out.println(Fibonn(4));
    }
}