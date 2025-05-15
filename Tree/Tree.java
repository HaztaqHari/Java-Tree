class tree{
    Node root;
    tree()
    {
        root=null;
    }
    class Node{
        int data;
        Node left,right;
        Node(int d)
        {
            data=d;
            left=right=null;
        }
    }
    public void insert(int d)
    {
        root=insertNode(root,d);
    }
    public Node insertNode(Node root,int d)
    {
        if(root==null){
        Node newnode =new Node(d);
        return newnode;
        }
        else{
            if(d<root.data){
                root.left=insertNode(root.left, d);
            }
            else{
                 
                root.right=insertNode(root.right, d);
            }
        }
        return root;
    }
    public void display(){
        if(root==null)
        {
            System.out.print("Tree is Empty");
        }
        else{
            
        }
    }
}