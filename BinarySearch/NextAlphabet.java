package BinarySearch;
  

// hERE WE WILL BE  gIVEN sTRING IN sORTED ORDER THEN E NEED TO fIND THE nEXT aLPHABETICAL PRESENT tHEIR 
public class NextAlphabet {
    public static char FindCielChar(String str,int Start,int End,char s){
       char res = '\0';
        while(Start<=End){
            int mid=(Start+End)/2;
            if(str.charAt(mid)==s){
                Start=mid+1;

            }
            else if(str.charAt(mid)>s){
                res=str.charAt(mid);
                End=mid-1;
            }
            else{
                
                Start=mid+1;
            }

        }
        return res;

    }
    public static void main(String []args){
        String str="abcdfg";
        int Start=0;
        char s='f';
        int End=str.length()-1;
        System.out.println(FindCielChar(str, Start, End, s));

    }
    
}
