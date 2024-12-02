package Backtracking;

public class Example3 {
    public static void Function(String str,String ans){
        if(str.length()==0){
            System.out.println(ans);
        }
        for(int i=0;i<str.length();i++){
           char curr=str.charAt(i);
            // next step removal
             String Newstr=str.substring(0, i)+str.substring(i+1);
            Function(Newstr, ans+curr);
        }
    }
    public static void main(String[] args) {
        String str="abc";
        Function(str, "");

    }
    
}
