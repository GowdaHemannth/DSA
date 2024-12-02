package ArrayList;

import java.util.ArrayList;
public class Example1 {
    public static int Function(ArrayList<Integer>Height){
        int Maxwater=0;
        for(int i=0;i<Height.size();i++){
            for(int j=0;j<Height.size();j++){
                int ht=Math.min(Height.get(i),Height.get(j));
                int widht=j-i;

                int area=ht*widht;
                Maxwater=Math.max(Maxwater, area);
            }
        }
        return Maxwater;
    }
    public static void main(String[] args) {
        ArrayList<Integer>Height=new ArrayList<>();
        Height.add(1);
        Height.add(8);
        Height.add(6);
        Height.add(2);
        Height.add(5);
        Height.add(4);
        Height.add(8);
        Height.add(3);
        Height.add(7);
     System.out.println(Function(Height));   

    }
    
}
