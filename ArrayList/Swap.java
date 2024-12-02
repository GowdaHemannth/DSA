package ArrayList;

import java.util.ArrayList;

public class Swap {
    public static void Function(ArrayList<Integer>st,int idx1,int idx2){
         int temp=st.get(idx1);
         st.set(idx1,st.get(idx2));
         st.set(idx2,temp);
    }
    public static void main(String[] args) {
        ArrayList<Integer>st=new ArrayList<>();
        st.add(1);
        st.add(2);
        st.add(3);
        st.add(4);
        int idx1=1;
        int idx2=3;
        Function(st, idx1, idx2);
        System.out.println(st);

    }
    
}
