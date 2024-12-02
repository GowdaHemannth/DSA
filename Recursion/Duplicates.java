package Recursion;

public class Duplicates{
    public static void Function(int idx,StringBuilder sb,String str,boolean map[]){
        if(idx==str.length()){
         System.out.println(sb);
         return;
        }
        char ch=str.charAt(idx);
        if(map[ch-'a']==true){
            Function(idx +1, sb, str, map);
        }
        else  {
           map[ch-'a']=true;
           Function(idx +1, sb.append(str), str, map);
        }
    }
    public static void main(String[] args) {
        
    }
}