package Practice;
import java.util.LinkedList;
import java.util.Queue;

public class BST {
    public Node root ;

    BST(){
        root = null;
    }

    public void insert(int data){
        root = insertRec(root, data);
    }

    private Node insertRec(Node root, int data){
        if(root==null){
            root = new Node(data);
            return root;
        }

        if(data<=root.data){
            root.left = insertRec(root.left, data);
        }
        else if(data>root.data){
            root.right = insertRec(root.right, data);
        }
        return root;
    }

    public boolean search(int data){
        if(searchRec(root, data)==null){
            return false;
        }
        else{
            return true;
        }
    }

    private Node searchRec(Node root,int data){
        if(root==null){
            return null;
        }

        if(data<root.data){
            return searchRec(root.left, data);
        } else if(data>root.data){
            return searchRec(root.right, data);
        }else {
            return root;
        }

        
       
    }
    //preorder traversal
    public void preOrder(){
        preOrderRec(root);
    }
        private void preOrderRec(Node root){
            if(root!= null){
                System.out.println(root.data);
                preOrderRec(root.left);
                preOrderRec(root.right);
            }
        }

        //inorder traversal
    public void inOrder(){
        inOrderRec(root);}

        private void inOrderRec(Node root){
            if(root!=null){
                inOrderRec(root.left);
                System.out.println(root.data);
                inOrderRec(root.right);
            }
        }

        public void BFS(Node root){
            if(root==null){
                return;
            }

            Queue<Node> queue = new LinkedList<>();
            queue.add(root);
            while(!queue.isEmpty()){
                Node node = queue.poll();
                System.out.print(node.data + " ");
                if(node.left != null){
                    queue.add(node.left);
                }
            }
        }

    }

