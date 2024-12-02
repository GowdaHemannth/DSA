package LinkedList;

public class linkedlist {
    public static class Node{
        int Data;
        Node Next;
        public Node(int Data){
            this .Data=Data;
            this.Next=null;
        }
    }
    public static Node Head;
    public static Node Tail;
    public static int size;
  
    public void addFirst(int data){
     
         // step 1 create a new node 
         Node newNode=new Node(data);
         size++;
        // what if the no nodes are present 
        if(Head==null){
            
         Head=Tail=newNode;
         return;
        }
       
        // now link the next to the head part of the nest node
        newNode.Next=Head; 
        Head=newNode;
    }
    public void AddLast(int Data){
        Node newNode=new Node(Data);
        size++;
        Tail.Next=newNode;
        Tail=newNode;
    }
    public void Print(){
        if(Head==null){
            System.out.println("ll is empty");
            return;
        }
        Node Temp=Head;
        while (Temp!=null) {
            System.out.println(Temp.Data + "");
            Temp=Temp.Next;
            
        }
      
    }
    public void Reverse(){
        Node prev=null;
        Node curr=Tail=Head;
        Node Next;
        while(curr!=null){
            Next=curr.Next;
            curr.Next=prev;
          prev=curr;
          curr=Next;

        }
        Head=prev;
    }
    public void RemoveLast(int n){ // removing the element from the last;

        int sz=0;
        Node Temp=Head;
        while(Temp!=null){
            Temp=Temp.Next;
            sz++;

        }
        if(n==sz){
            Head=Head.Next;
            return;

        }
        int i=1;
        Node Prev=Head;
        while(i<size-n+1){
            Prev=Prev.Next;
            i++;

        }
        Prev.Next=Prev.Next.Next;
        return;

    }
    public Node FindMid(Node Head){
        Node Slow=Head;
        Node Fast=Head;
        while(Fast!=null&&Fast.Next!=null){
            Slow=Slow.Next;
            Fast=Fast.Next.Next;
        }
        return Slow;

    }
    public boolean CheckPalindrome(){
        if(Head==null||Head.Next!=null){
            return true;
        }
        // 1st step is to find the middle node;

        Node Midde=FindMid(Head);

     // 2nd step reverse the reverse the elements after Mid
     Node Prev=null;
     Node curr=Midde;
     Node Next;
     while(curr!=null){
        Next=curr.Next;
        curr.Next=Prev;
        Prev=curr;
        curr=Next;


     }
     Node Right=Prev;
     Node left=Head;
     while(Right!=null){
        if(left.Data!=Right.Data){
            return false;
        }
        left=left.Next;
        Right=Right.Next;


     }
     return true;
    }
    public static void main(String[] args) {
        linkedlist ll=new linkedlist();
     
       ll.addFirst(1);
     
     
     
       ll.AddLast(2);
       
       ll.AddLast(1);
      ll.Print();
    System.out.println( ll.CheckPalindrome()) ;

}
}
