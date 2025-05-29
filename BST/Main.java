package BST;

public class Main {
    public static void main(String[] args){
        BinarySearchTree tree = new BinarySearchTree();

        tree.insert(10);
        tree.insert(5);
        tree.insert(7);
        tree.insert(42);
        tree.insert(22);
        tree.insert(12);
        tree.insert(16);
        tree.insert(8);


        System.out.println("Root: " + tree.root.data);
        tree.preOrder();
        System.out.println();
        tree.inOrder();
        System.out.println();
        tree.postOrder();
    }
}
