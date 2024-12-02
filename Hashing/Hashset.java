package Hashing;
import java.util.HashSet;
import java.util.Iterator;

public class Hashset{
    public static void main(String[] args) {
        HashSet <Integer>H=new HashSet<>();
        H.add(1);
        H.add(2);
        H.add(3);
        H.add(4);
        System.out.println(H);
        
        // Searching commands can be used Here 
        if(H.contains(1)){
            System.out.println("The set contains the 1");
        }
        

        // Removing Commands 
        H.remove(1);
        if(!H.contains(1)){
            System.out.println("not");
        }
        // Iteration commands 
        @SuppressWarnings("rawtypes")
        Iterator it=H.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

    }
    
}