import java.util.Queue;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.ArrayList;

public class Subtree {
    static class Node{
        int data;
        Node Left;
        Node Right;
        Node(int data){
            this.data=data;
            this.Right=null;
            this.Left=null;
        }
    }

// Returning true if subtree of a tree is well structured else returning false
public static boolean isIdentical(Node node,Node Subroot){
    if(node==null&&Subroot==null){
        return true;
    }
    else if(node==null||Subroot==null||node.data!=Subroot.data){
        return false;


    }
    if(!isIdentical(node.Left, Subroot.Right)){
        return false;
    }
   if(!isIdentical(node.Right, Subroot.Right)){
        return false;

    }
    return true;
}
public static boolean isSubtree(Node root,Node Subroot){
if(root==null){
    return false;
}
if(root.data==Subroot.data){
    if(isIdentical(root,Subroot)){
        return true;
    }
}
boolean leftAns=isSubtree(root.Left, Subroot);
boolean rightAns=isSubtree(root.Right, Subroot);
return leftAns||rightAns;
}

static class Info{
    Node node;
    int HD;
    
    public  Info(Node node,int HD){
        this.node=node;
        this.HD=HD;
    }
}
// TopView of a binary tree 
public static void TopView(Node root){
    Queue<Info>Q=new LinkedList<>();
    HashMap<Integer,Node>H=new HashMap<>();
  int min=0;
  int max=0;
    Q.add(new Info(root, 0));
    Q.add(null);
    while(!Q.isEmpty()){
        Info curr=Q.remove();
        if(curr==null){
            if(Q.isEmpty()){
                break;
            }else{
                Q.add(null);
            }
        }else{
            if(!H.containsKey(curr.HD)){
                H.put(curr.HD, curr.node);
           }
           if(curr.node.Left!=null){
               Q.add(new Info(curr.node.Left,curr.HD-1 ));
               min=Math.min(min, curr.HD-1);
           }
           if(curr.node.Right!=null){
               Q.add(new Info(curr.node.Right, curr.HD+1));
               max=Math.max(max, curr.HD+1);
           }
            
        }

        // now checking whether the map contains the particular key or not 
       
    }
    for(int i=min;i<=max;i++){
        System.out.println(H.get(i).data);
    }
    
    
    


    
}
// Printing the values of the Kth Level 
     
public static void Klevel(Node root,int Level,int k){
    if(Level==k){
        System.out.println(root.data);
        return;
    }
    Klevel(root.Left, Level+1, k);
    Klevel(root.Right, Level+1, k);

}

 // Right  view of an Binary Tree 
public static List<Integer> View(Node root){
    List<Integer>A=new ArrayList<>();
    RightView(root,0,A);
    return A;

}
public static void RightView(Node root,int level,List<Integer>A){
if (root==null){
    return;
}
if(level==A.size()){
    A.add(root.data);
}
RightView(root.Right, level+1, A);
RightView(root.Left, level+1, A);
}

// Here in the Question we will be given a  node and we have to tell that node is present or not and also Print the Path

public static ArrayList<Integer> Function(Node Subroot,int x){
    ArrayList<Integer>Ans=new ArrayList<>();
    GetPath(Ans,Subroot,x);
    return Ans;
}

public static boolean GetPath(ArrayList<Integer>Ans,Node Subroot,int x){
    if(Subroot==null){
        return false;
    }
    Ans.add(Subroot.data);
    if(Subroot.data==x){
        return true;

    }
   
   
    if( GetPath(Ans, Subroot.Left, x)|| GetPath(Ans, Subroot.Right, x)){
        return true;
    }
    Ans.remove(Ans.size()-1);

    return false;

}
    public static void main(String[] args) {
        Node root=new Node(1);
        root.Left=new Node(2);
        root.Right=new Node(3);
        root.Left.Left=new Node(4);
        root.Left.Right=new Node(5);
       root .Right.Left=new Node(6);
       root.Right.Right=new Node(7);
       
      Node Subroot=new Node(8);
      Subroot.Left=new Node(9);
      Subroot.Right=new Node(10);
      Subroot.Left.Left=new Node(11);
      Subroot.Left.Right=new Node(12);
      Subroot.Left.Right.Left=new Node(13);
      Subroot.Left.Right.Right=new Node(14);
    

      // TopView(root);
     //  Klevel(root, 1, 3);
      
     // RightSide View of an BinaryTree
//System.out.println(View(root)); 
     
// Finding out the path of the Given Node
System.out.println(Function(Subroot, 17));
    }
}
