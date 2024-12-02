package Hashing;
import java.util.HashMap;
import java.util.Map;;

public class HashMap1 {
    public static void main(String[] args) {
        HashMap<String,Integer>H=new HashMap<>();
        // 1st operation is Addition operation
        H.put("India", 120);
        H.put("Usa",30);
        H.put("China",45);
        System.out.println(H);
         
        // 2nd Search operation
        if(H.containsKey("China")){
            System.out.println("The key exits in operation");

        }
        else{
            System.out.println("The key doesnt exist");
        }
        // How to use for loop in HashSet
        for (Map.Entry<String, Integer> entry : H.entrySet()) {
           System.out.println(entry.getKey());
           System.out.println(entry.getKey());
 
        }

        
    }
    
}
