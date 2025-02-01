package GreedyAlgo;
import java.util.*;
public class Chocolo{
    public static void main(String[] args) {
  
        int n=4; int m=6;
        Integer CostHor[]={4,1,2};
       Integer  CostVer[]={2,1,3,1,4};

        // Sorting The arrys in Desecending Order
        Arrays.sort(CostHor,Collections.reverseOrder());
        Arrays.sort(CostVer,Collections.reverseOrder());

        // Location of Both Pointers 
        int h=0;
        int v=0;

        // Number of Piceis 
        int hp=1;
        int vp=1;
        int Cost=0;

        while(h<CostHor.length&&v<CostVer.length){
            // HoriZontal Cut
           if(CostVer[v]<=CostHor[h]){
            Cost=Cost+(CostHor[h]*vp);
            h++;
            hp++;


           }
           else{
            Cost=Cost+(CostVer[v]*hp);
            v++;
            vp++;

           }

        }

        while(h<CostHor.length){
               Cost=Cost+(CostHor[h]*vp);
                h++;
                hp++;

        }
       
        while(v<CostVer.length){

            Cost=Cost+(CostVer[v]*hp);
            v++;
            vp++;

        }
        System.out.println(Cost);

    }
   
   
}
