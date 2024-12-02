package ArrayList;
public class Max {
    public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList<>();
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(9);
        list.add(5);
        int Max=Integer.MIN_VALUE;
        for (int i=0;i<list.size();i++){
            if(Max<list.get(i)){
              Max=list.get(i);
            }
        }
      System.err.println(Max);
    }
    
}
