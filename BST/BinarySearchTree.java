package BST;

public class BinarySearchTree {
    public Node root;

    BinarySearchTree(){
        root = null;
    }

    public void insert(int data){
        root = insertRec(root, data);
    }

    private Node insertRec(Node root, int data){
        if(root == null){
            root = new Node(data);
            return root;
        }

        if(data <= root.data){
            root.left = insertRec(root.left, data);
        }else if(data > root.data){
            root.right = insertRec(root.right, data);
        }return root;
    }

    public boolean search(int data){
        if(searchRec(root,data) == null){
            return false;
        }else {
            return true;
        }
    }

    private Node searchRec(Node root, int data){
        if(root == null ){
            return null;
        }

        if(data < root.data){
            return searchRec(root.left, data);
        }else if(data > root.data){
            return searchRec(root.right, data);       
        }
        else{
            return root;
        }
    }
}
