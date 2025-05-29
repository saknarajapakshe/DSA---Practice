package BST;

import java.util.LinkedList;
import java.util.Queue;

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

    public  boolean  search(int data){
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

    //preorder traversal
    public void preOrder(){
        preOrderRec(root);
    }

    private void preOrderRec(Node root){
        if(root != null){
            System.out.print(root.data + " ");
        preOrderRec(root.left);
        preOrderRec(root.right);
        }
    }
    
    //inorder traversal
    public void inOrder(){
        inOrderRec(root);
    }

    private void inOrderRec(Node root){
        if(root!=null){
            inOrderRec(root.left);
            System.out.print(root.data + " ");
            inOrderRec(root.right);
        }
    }

    //postOrder Traversal
    public void postOrder(){
        postOrderRec(root);
    }

    private void postOrderRec(Node root){
        if(root!=null){
            postOrderRec(root.left);
            postOrderRec(root.right);
            System.out.print(root.data + " ");
        }
    }

    public void BFS(Node root){
        if(root == null){
            return;
        }

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        while(!queue.isEmpty()){
            Node node = queue.poll();
            System.out.print(node.data + " ");
            if(node.left!=null){
                queue.add(node.left);
            }
            if(node.right!=null){
                queue.add(node.right);
            }
        }

       
    }
     public void LCA(int data1,int data2){
            boolean node = search(data1);

            if(node==false){
                System.out.println("Node " + data1 + " not found in the tree.");
                return;
            }
            boolean node2 = search(data2);
            if(node2==false){
                System.out.println("Node " + data2 + " not found in the tree.");
                return;
            }

            Node lca = LCARec(root, data1, data2);
        }

        private Node LCARec(Node root,int data1,int data2){
            if(data1<root.data && data2<root.data){
                return LCARec(root.left, data1, data2);
            }
            else if(data1>root.data && data2>root.data){
                return LCARec(root.right, data1, data2);
            }
            else return root;
        }


}
