/**
 * Created by mohammadselimmiah on 7/06/2016.
 */
public class BinarySearchTreeDemo {

    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
        bst.insert(40);
                bst.insert(25);
                bst.insert(78);
                bst.insert(10);
                bst.insert(3);
                bst.insert(17);
                bst.insert(32);
                bst.insert(30);
                bst.insert(38);
                bst.insert(78);
                bst.insert(50);
                bst.insert(93);
                bst.insert(100);
        bst.insert(99);
        System.out.println("Inorder traversal");
        bst.printInorder();

        System.out.println("\n\nPreorder Traversal");
        bst.printPreorder();

        System.out.println("\nPostorder Traversal");
        bst.printPostorder();

        System.out.println("\nThe minimum value in the BST: " + bst.findMinimum());
        System.out.println("The maximum value in the BST: " + bst.findMaximum());

    }
}
