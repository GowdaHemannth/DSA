package Recursion;

public class Pattern {
    public static void Function(int r, int c){
 
        if(r==0){
   
            return;
        }
        if(c<r){
            System.out.print("*");
            Function(r, c+1);
        }
        else{
            System.out.println();
            Function(r-1, 0);
        }

    }
    public static void main(String[] args) {
        Function(4, 0);
    }
}
