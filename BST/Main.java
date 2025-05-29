package BST;

public class Main {
    public static void main(String[] args){
        BinarySearchTree tree = new BinarySearchTree();

        tree.insert(10);
        tree.insert(5);

        System.out.println("Root: " + tree.root.data);
    }
}
