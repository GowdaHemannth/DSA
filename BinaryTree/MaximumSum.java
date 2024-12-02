public class MaximumSum {
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
   public static int  Max(Node root){
    int max[]=new int[1];
    max[0]=Integer.MIN_VALUE;
    Function(root,max);
    return max[0];
   
     
   }
    public static int Function(Node root,int max[]){
        if(root==null){
            return 0;
        }
        int Left=Math.max (0,Function(root.Left, max));
        int Right=Math.max (0,Function(root.Right, max));
        max[0]=Math.max(max[0], root.data+Left+Right);
        return  Math.max(Left, Right)+root.data;
    }
    public static void main(String[] args) {
        Node root=new Node(-10);
        root.Left=new Node(9);
        root.Right=new Node (20);
        root.Right.Left=new Node(15);
        root.Right.Right=new Node(7);
        System.out.println(Max(root));
        
        
        
    }
    
}
