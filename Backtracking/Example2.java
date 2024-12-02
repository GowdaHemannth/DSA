package Backtracking;

public class Example2 {
    public static void Function(String str,String ans,int i){
        if(i==str.length()){
         System.out.println(ans);
         return;
        }
        Function(str,ans+str.charAt(i),i+1);
        Function(str,ans,i+1);
    }
    public static void main(String[] args) {
        String str="abc";
        Function(str, "", 0);
    }
}
