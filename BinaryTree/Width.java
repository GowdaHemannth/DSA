import java.util.LinkedList;
import java.util.Queue;;
public class Width {
     static class Node{
        int data;
        Node Left;
        Node Right;
       
        public Node(int  data){
            this.data=data;
           this.Left=null;
           this.Right=null;
          
        }
        
       
    }
    static class Info{
        Node node;
        int HD;
        
        public  Info(Node node,int HD){
            this.node=node;
            this.HD=HD;
        }
    }
   
    public static int Function(Node root){
        Queue<Info>q=new LinkedList<>();
        int ans=0;
        q.add(new Info(root, 0));
       while(!q.isEmpty()){
        int size=q.size();
        int First=0;
        int Last=0;
        int min=q.peek().HD;
        for(int i=0;i<size;i++){
            int curr_id=q.peek().HD-min;
            if(i==0){
                First=curr_id;

            }
            if(i==size-1){
             Last=curr_id;
            }
            Node Info=q.peek().node;
            q.remove();
            if(Info.Left!=null){
                q.add(new Info(Info.Left, curr_id*2+1));
            }
            if(Info.Right!=null){
                q.add(new Info(Info.Right, curr_id*2+2));
            }
        }
        ans=Math.max(ans,Last-First+1);
       }
       return ans;
         
    }
    // Balanced tree or not 
    public static boolean Balanced(Node Subroot){
      
      return DFS(Subroot)!=-1;
     
    }
    public static int DFS(Node Subroot){
        if(Subroot==null){
            return 0;
        }

        int LH=DFS(Subroot.Left);
         if(LH==-1){
            return -1;
         }

        int RH=DFS(Subroot.Right);
        if(RH==-1){
            return -1;
         }

        if(Math.abs(LH-RH)>1){
            return -1;

        }
        return Math.max(LH, RH)+1;
    }

    // Question 10 that is Comman Ansestor for the Given Binary Tree
    public static Node AnsestorFinder(Node root,Node p,Node q){

        if(root==null||root==p||root==q){
            return root;
        }

        Node Left=AnsestorFinder(root.Left, p, q);
        Node Right=AnsestorFinder(root.Right, p, q);

        if(Left==null){
            return Right;
        }
        else if(Right==null){
            return Left;

        }
        else{
            return root;
        }
    }

    // Function to find out the Node 
    public static Node FindTree(Node Subroot,int value){
        if(Subroot==null||Subroot.data==value){
            return Subroot;
        }
     Node t=    FindTree(Subroot.Left, value);
     if( t!=null){
           return null;
     }
     return FindTree(Subroot.Right, value);

    }
   
    public static void main(String[] args) {
    Node root=new Node(3);
    root.Left = new Node(5);
    root.Right = new Node(1);
    root.Left.Left = new Node(6);
    root.Left.Right = new Node(2);
    root.Right.Left = new Node(0);
    root.Right.Right = new Node(8);
    root.Left.Right.Left = new Node(7);
    root.Left.Right.Right = new Node(4);
   // System.out.println(Function(root));
   Node Subroot=new Node(3);
   Subroot.Left = new Node(5);
   Subroot.Right = new Node(1);
  
 
   Subroot.Right.Left = new Node(0);
    Subroot.Right.Right = new Node(8);
  //  System.out.println(Balanced(Subroot));
  


        
    }
    
}
