package GreedyAlgo;
import java.util.*;

import java.util.Comparator;

public class FractionalKnapsack {
    public static void main(String[] args) {
        int value[]={60,100,120};
        int Weight[]={10,20,30};
        int W=50;
        double ratio[][]= new double[value.length ][2];
        //  0th column Index is Stored 1st Column ratio of value and Double are stored ;
        for(int i=0;i<value.length;i++){
            ratio[i][0]=i;
            ratio[i][1]=value[i]/(double)Weight[i];
        }

        // Since  we Need ratio in the Decreasing Order i mean Sorted Order we Need to Solve these;
        Arrays.sort(ratio,Comparator.comparingDouble(o->o[1]));

        // Now the Actual COde for these Numerical 
        int Capacity=W;
        int finalVal=0;
     // Since the Ratio is Stored in the Ascending order Now we will Take it From Backwards
     for(int i=ratio.length-1;i>=0;i--){
       int idx=(int )ratio[i][0];
       if(Capacity>=Weight[idx]){
        Capacity=Capacity-Weight[idx];
        finalVal=finalVal+value[idx];
       }
       else{
        finalVal=finalVal+(int)(ratio[i][1]*Capacity);
        Capacity=0;
        break;

       }


    }
    System.out.println(finalVal);
    
}
}
