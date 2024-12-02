package Queue;

public class LinkedQueue {
    // Intialising the Node;
   static class Node{
    int data;
    Node Next;
    Node(int data){
        this.data=data;
        this.Next=null;
    }
}
    // craete a class so that we can use the Node
    static class Queue{
        static Node Head=null;
        static Node Tail=null;
        // 1st Function for Empty 
        static boolean isEmpty(){
            return Head==null&&Tail==null;
        }
        // 2nd Function for Adding the Node
        static void Add(int data){
            Node newNode =new Node(data);
            if(Head==null){
                Head=Tail=newNode;

            }else{ Tail.Next=newNode;
                Tail=newNode;}
           

                
        }
        static int  Remove(){
            if(isEmpty()){
                System.out.println("The List is Empty");
                return -1;
            }
           int Front=Head.data;
           if(Tail==Head){
            Tail=Head=null;
           }
           else{
            Head=Head.Next;
           }
           return Front;


        }
        static int Peek(){
            if(isEmpty()){
                return -1;
            }
            return Head.data;
        }

    }
    

    
    @SuppressWarnings("static-access")
    public static void main(String[] args) {
     Queue q=new Queue();
     q.Add(1);
     q.Add(2);
     q.Add(3);
     q.Add(4);
        while(!q.isEmpty()){
            System.out.println(q.Peek());
            q.Remove();
        }
        
    
    }
}
    

