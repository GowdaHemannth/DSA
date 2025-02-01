package Heaps;
import java.util.PriorityQueue;
import java.util.Comparator;
public class Soldiers {
    static class Row implements  Comparable<Row>{
        int Soldiers;
        int Idx;
        public Row(int Soldiers,int Idx){
            this.Soldiers=Soldiers;
            this.Idx=Idx;

        }
        @Override
        public int compareTo(Row r2){
            if(this.Soldiers==r2.Soldiers){
                return this.Idx-r2.Idx;
            } 
            else{
                return this.Soldiers-r2.Soldiers;
            }
        }


        

    }
    public static void main(String[] args) {
        int arr[][]={{1,0,0,0},
                     {1,1,1,1},
                     {1,0,0,0},
                     {1,0,0,0}};
                     int k=2;
                     

            PriorityQueue<Row>pq=new PriorityQueue<>();
            for(int i=0;i<arr.length;i++){
                int count=0;
                for(int j=0;j<arr.length;j++){
                    count=+ arr[i][j]==1?1:0;
                }
                pq.add(new Row(count, i));
            }  
            
            for(int i=0;i<k;i++){
                System.out.println(pq.peek().Idx);
                pq.remove();
            }
    }
    
    
}
