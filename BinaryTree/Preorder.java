import java.util.Queue;
import java.util.LinkedList;
public class Preorder {
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
    static class BinaryTree{
        static int idx=-1;
        
        static int num=0;
        static int sum=0;
        public static Node buildTree(int nodes[]){
            idx++;
           if(nodes[idx]==-1){
            
            return null;
           }
           Node newNode=new Node(nodes[idx]);
           newNode.Left=buildTree(nodes);
           newNode.Right=buildTree(nodes);
           return newNode;
        }
        // Function to print PreOrder
        public static void PreOrder( Node root){
            if(root==null){
                System.out.println("-1");
                return;
            }
            
            System.out.println(root.data +" ");
           PreOrder(root.Left);
          PreOrder(root.Right);
        }
        // Function to print Inorder
        public static void Inorder(Node root){
            if(root==null){
                return ;
            }
            Inorder(root.Left);
            System.out.println(root.data);
            Inorder(root.Right);
        }
        // Function to Print PostOrder
        public static void PostOrder(Node root){
            if(root==null){
                return ;
            }
            PostOrder(root.Left);
            PostOrder(root.Right);
            System.out.println(root.data + " ");

        }
        // function to Print LevelOrder Traversel;
        public static void  LevelOrder(Node root){
            if(root==null){
                return ;
            }
           Queue<Node> q = new LinkedList<Node>();
           q.add(root);
           q.add(null);
           while(!q.isEmpty()){
            Node currNode=q.remove();
            if(currNode==null){
                System.out.println();
                if(q.isEmpty()){
                    break;
                }else{
                    q.add(null);
                }
            }
            else{
            
               sum=sum+currNode.data;
                if(currNode.Left!=null){
                    q.add(currNode.Left);
                    
                    
                }
                if(currNode.Right!=null){
                    q.add(currNode.Right);
                }
            }
           }
         

        }
        // To calculate the Hieght of Tree
        public static int Hieght(Node root){
            if(root ==null){
                return 0;
            }
          
            num++;
            int left=Hieght(root.Left);
            
            int right=Hieght(root.Right);
            

            int max=Math.max(left, right)+1;
            return max;
        }
    }

    public static void main(String[] args) {
        int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree=new BinaryTree();
     Node root=   tree.buildTree(nodes);
 //tree.PreOrder(root);
 //System.out.println();

 //tree.Inorder(root);
 //System.out.println();


//     tree.PostOrder(root);
   // int H=  tree.Hieght(root);
   // System.out.println("Hieght of the tree is "+  H);
    }
}
