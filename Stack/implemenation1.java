package Stack;
import java.util.*;

// Creating Stack using the Linked List 
public class implemenation1 {
    // Defining the Linked List
     static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }

     }

    static class Stack{
        static Node Head=null;
        public  static boolean isEmpty(){
            return Head==null;// if this condition satisfy return true;
        }
        // Push Function 
        public static void Push(int data){
            Node newNode=new Node(data); 
            if(isEmpty()){
                Head=newNode;
                return;

            }
            // Here many us will Confused Becuase 
            //Think Here we are Creating A Stack USing LinkedList Every Emeant Should At top 
            newNode.next=Head;
            Head=newNode;
        }
        // 2nd Function Pop function
        public static int Pop(){
            if(isEmpty()){
                return-1;
            }
            int top=Head.data;
            Head=Head.next;
            return top;
        }
        // 3rd Function Peek Function
        public static int Peek(){
            if(isEmpty()){
                return-1;
            }
            return Head.data;
        }

    }
    public static void main(String[] args) {
        Stack s=new Stack();
        s.Push(1);
        s.Push(2);
        s.Push(3);
        s.Push(4);
     
        while (!s.isEmpty()) {
            System.out.println(s.Peek());
            s.Pop();

            
        }
    }
}
