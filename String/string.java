package String;

public class string {
    public static void main(String[] args) {
        @SuppressWarnings("unused")
        char arr[]={'a','b','c','d'};
       
        
        
        StringBuilder sb=new StringBuilder();
        for(char ch='a';ch<='z';ch++){
            sb.append(ch + " ");
        }      
        System.out.println(sb);
    }
}
