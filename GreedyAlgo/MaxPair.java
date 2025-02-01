package GreedyAlgo;
import java.util.*;

public class MaxPair {
    public static void main(String[] args) {
        int pairs[][]={{5,24},{39,60},{5,28},{27,40},{50,90}};

        Arrays.sort(pairs,Comparator.comparingDouble(o->o[1]));

        int Chain =1;
        int ChainEnd=pairs[0][1];
        for(int i=1;i<pairs.length;i++){
            if(pairs[i][0]>ChainEnd){
              Chain++;
              ChainEnd=pairs[i][1];
            }
        }
        System.out.println("The Length of the Chain is " + " " + Chain);
       
        
        
    }
    
}
