package BinarySearch;

public class practice {
    // public static String Function(String str,int Start,int End,char s){
    //     // int mid=Start+(End-Start/2);
    //     // char ch=str.charAt(mid);
       
    // }
    public static void main(String[] args) {
        String str="abcdfg";
         int Start=0;
        char s='f';
        int End=str.length()-1;
        if(str.charAt(Start)<str.charAt(End)){
            System.out.println("Yes Styrings also Follow the greater lesser thing ");
        }

    }
    
}
