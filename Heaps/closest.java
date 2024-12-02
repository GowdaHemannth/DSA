package Heaps;

import java.util.Comparator;
import java.util.PriorityQueue;

public class closest {
    static class Student implements Comparable<Student>{
        int num1;
        int num2;

        public Student(int num1, int num2){
            this.num1=num1;
          this.num2=num2;
        }
        @Override
        public int compareTo(Student s2){
           return Integer.compare(this.num1, s2.num1);  // Compare based on the absolute difference
        }

        // Override toString to print num2 when printing the Student object
        @Override
        public String toString() {
            return Integer.toString(num2);  // Print num2
        }
       

    }
    public static void Function(PriorityQueue<Student> pq,int arr[],int k,int x){
        for (int i=0;i<arr.length;i++){
            pq.add(new Student(Math.abs(arr[i]-x),arr[i]));
            if(pq.size()>k){
                pq.remove();
            }
        }
    }
    public static void main(String[] args) {
        PriorityQueue<Student> pq = new PriorityQueue<>(Comparator.comparingInt((Student p) -> p.num1).reversed());

          int arr[]={5,6,7,8,9};
          int k=3;
          int x=7;
          Function(pq, arr, k, x);
          while(!pq.isEmpty()){
            System.out.println(pq.peek());
            pq.remove();
          }
     

        
        
    }
    
}
