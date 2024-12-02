public class Sum {
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
        static int num;
        static int sum;
        static int max;
        // Function to calculate the count of Nodes
        public static int Count(Node root){
           if(root==null){
            return 0;
           }
           num++;
         
           int l=Count(root.Left);
           int R=Count(root.Right);
           return num;
        }
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
        // Finding the diameter of the tree  we need to use Hiegth Function as weell
        public static int Diameter(Node root){
            if(root==null){
                return 0;
            }
            int lefDiam=Diameter(root.Left);
            int leftHieght=Hieght(root.Left);
            int rightDia=Diameter(root.Right);
            int rightHieght=Hieght(root.Left);
            int selfDiam=leftHieght+rightHieght+1;
            return Math.max( selfDiam,Math.max(rightDia, lefDiam));
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
      
        
    
    public static void main(String[] args) {
        Node root=new Node(1);
         root.Left=new Node(2);
         root.Right=new Node(3);
         root.Left.Left=new Node(4);
         root.Left.Right=new Node(5);
        root .Right.Left=new Node(6);
        root.Right.Right=new Node(7);
        
       Node Subroot=new Node(3);
       Subroot.Left=new Node(6);
       Subroot.Right=new Node(7);
  

    }
}
