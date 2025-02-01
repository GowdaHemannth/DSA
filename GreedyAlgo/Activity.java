package GreedyAlgo;
import java.util.*;

public class Activity {
    public static void main(String[] args) {
        int start[]={1,3,0,5,8,5};
        int end[]={2,4,6,7,9,9};
        // Here if The start and end Arryas are not sorted in the Sense means we need to Sort Them off

        int Activities[][]=new int[start.length][3];
        for (int i=0;i<start.length;i++){
            Activities[i][0]=i;
            Activities[i][1]=start[i];
            Activities[i][2]=end[i];


        }
        
        int MaxCount=0;
        ArrayList<Integer>AS= new ArrayList<>();

        // Now Add the First Element 
        MaxCount=1;
        AS.add(0);

        int Lastend=end[0];
        for(int i=1;i<end.length;i++){
            if(start[i]>=Lastend){
                MaxCount++;
                AS.add(i);
                Lastend=end[i];
            }
        }

        for(int i=0;i<AS.size();i++){
            System.out.println("A"+ AS.get(i)+ " ");

        }
        System.out.println();

        
    }
    
}
