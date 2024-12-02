package Queue;

import java.util.LinkedList;
import java.util.*;

public class Deque1 {
    public static void main(String[] args) {
        Deque<Integer>d=new LinkedList<>();
        d.addFirst(1);
        d.addFirst(2);
        d.addLast(3);
        System.out.println(d);
    }
    
}
