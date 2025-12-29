import java.util.ArrayList;

import java.util.List;

// SO THE QUESTION IS GENERATE ALL THE BINARY STRINGS OF LENGTH N 
// THEN YOU WILL GET ONE more Named Generate Paranthesis Which is Eexactly same asthese 
public class Numerical1 {
    public static void function(List<Integer> list, list<list<Integer>> ArrayList, int n, int idx) {
        // Here i will Be Defing Base Case
        if (idx == n) {
            ArrayList.add(list);
            return;
        }

        list.add(0);
        function(list, ArrayList, n, idx + 1);
        list.remove((list.size() - 1));
        function(list, ArrayList, n, idx + 1);
        // Here you might be Having Doubt But Assure it Once
        list.remove(list.size() - 1);

    }

    public static void main(String[] args) {
        list<Integer> list = new ArrayList<>();
        list<list<Integer>> ArrayList = new ArrayList<>();

    }

}
