package Recursion;

public class Duplicates{

    // Here the Main goal is to Remove the Duplicates from the String Like we are Having the String Like 'aabanb'
    // So the final output will be 'abn
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
           Function(idx +1, sb.append(ch), str, map);
        }
    }
    public static void main(String[] args) {
     StringBuilder sb=new StringBuilder();
     String str="aabnb";
   boolean map[] = new boolean[26];
  Function(0, sb, str, map);
        
    }
}