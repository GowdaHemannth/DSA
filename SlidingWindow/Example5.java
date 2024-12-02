package SlidingWindow;

public class Example5 {
    public static  int Function(String str) {
       
        int count=0;
        for(int i=0;i<str.length();i++){
            int hash[]=new int[3];
            for(int j=i;j<str.length();j++){
                char r=str.charAt(j);
                hash[r-'a']=1;
                if(hash[0]+hash[1]+hash[2]==3){
                     count =count+1;
                }
            }
          
        }
        return count;
        
    }
    public static void main(String[] args) {
        String str="bbacba";
        System.out.println(Function(str));
    }
    
}
