package Heaps;
import java.util.PriorityQueue;
import java.util.Comparator;

public class Priority {
    static class Student implements Comparable<Student>{
        String name;
        int  rank;

        public Student(String name, int rank){
            this.rank=rank;
            this.name=name;
        }
        @Override
        public int compareTo(Student s2){
            return this.rank-s2.rank;
        }

    }
    public static void main(String []args){
        PriorityQueue<Student>PQ=new PriorityQueue<>();
        PQ.add(new Student("Hemanth ",10000));
        PQ.add(new Student("Sudarsh ",1000));
        PQ.add(new Student("Kavya ",100));
        PQ.add(new Student("ASHU ",10));

        while(!PQ.isEmpty()){
            System.out.println(PQ.peek().name + " "  +PQ.peek().rank );
            PQ.remove();

        }

    }
    
}
