package ArrayList;
import java.util.ArrayList;
public class MultiArrayList {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>>mainList=new ArrayList<>();
        ArrayList<Integer>list=new ArrayList<>();
        list.add(1); list.add(2); list.add(3); list.add(4); list.add(5);
        mainList.add(list);

        ArrayList<Integer>list1=new ArrayList<>();
        list1.add(2);  list1.add(4);  list1.add(6);  list1.add(8);  list1.add(10);
        mainList.add(list1);

        for(int i=0;i<mainList.size();i++){
            ArrayList<Integer>currList=mainList.get(i);

            for(int j=0;j<currList.size();j++){
                System.out.println(currList.get(j) +" ");
            }
            System.out.println();
        }

    }
    
}
