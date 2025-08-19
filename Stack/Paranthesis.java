package Stack;

import java.util.Stack;

public class Paranthesis {
    public static boolean Function(String str){
        Stack<Character>s=new Stack<>();
         // step 1 checking for the oprning brackets
         for(int i=0;i<str.length();i++){
            char current=str.charAt(i);
            if(current =='('||current=='{'||current=='['){
                s.push(current);
            }
            else{
                // if there is no previous opening character found means its not valid 
                if(s.isEmpty()){
                    return false;
                }
                if((s.peek()=='('&& current==')')||(s.peek()=='{'&& current=='}')||(s.peek()=='['&& current==']')){
                    s.pop();
                }
                    else{
                        return false;
                    }

                
            }

         }
       if(s.isEmpty()){
        return true;
       }
       else{
        return false;
       }

    } 
    public static void main(String[] args) {
        String str="({})[]";
     System.out.println( Function(str));  
        
       
    }
    
}
