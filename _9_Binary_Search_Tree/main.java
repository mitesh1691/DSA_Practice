package _9_Binary_Search_Tree;

public class main {
    public static void main(String[] args) {
        binarySearchTree bst = new binarySearchTree(); // creating instance of the class binarySearchTree

        bst.insert(70);
        bst.insert(50);
        bst.insert(90);
        bst.insert(30);
        bst.insert(60);
        bst.insert(80);
        bst.insert(100);
        bst.insert(20);
        bst.insert(40);

        bst.preOrder(bst.root); //70 50 30 20 40 60 90 80 100
        System.out.println();
        bst.inOrder(bst.root); // 20 30 40 50 60 70 80 90 100
        System.out.println();
        bst.postOrder(bst.root); // 20 40 30 60 50 80 100 90 70
        System.out.println();

        bst.levelOrder(); // 70 50 90 30 60 80 100 20 40
        System.out.println();

        bst.searchNode(bst.root, 90);
        bst.searchNode(bst.root, 80);
        bst.searchNode(bst.root, 200);

        bst.deleteNode(bst.root, 50);
        bst.levelOrder();
        System.out.println();

        bst.deleteNode(bst.root, 70);
        bst.levelOrder();
        System.out.println();

        bst.deleteBST();
//        bst.levelOrder();

    }
}
