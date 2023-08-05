package _8_Binary_Tree._1_usingLinkedList;

public class Main {
    public static void main(String[] args) {
        binaryTreeLL bt = new binaryTreeLL(); // creates binary tree, returns nothing as root is null
//        binaryNode N1 = new binaryNode();
//        N1.value = "N1";
//        binaryNode N2 = new binaryNode();
//        N2.value = "N2";
//        binaryNode N3 = new binaryNode();
//        N3.value = "N3";
//        binaryNode N4 = new binaryNode();
//        N4.value = "N4";
//        binaryNode N5 = new binaryNode();
//        N5.value = "N5";
//        binaryNode N6 = new binaryNode();
//        N6.value = "N6";
//        binaryNode N7 = new binaryNode();
//        N7.value = "N7";
//        binaryNode N8 = new binaryNode();
//        N8.value = "N8";
//        binaryNode N9 = new binaryNode();
//        N9.value = "N9";
//
//        N1.leftChild = N2;
//        N1.rightChild = N3;
//        N2.leftChild = N4;
//        N2.rightChild = N5;
//        N3.leftChild = N6;
//        N3.rightChild = N7;
//        N4.leftChild = N8;
//        N4.rightChild = N9;
//        bt.root = N1;
//
//        bt.preOrder(bt.root);
////        OR
//        System.out.println("");
//        bt.preOrder(N1);
//        System.out.println("");
//
//        bt.inOrder(bt.root);
//        System.out.println("");
//
//        bt.postOrder(bt.root);
//        System.out.println("");
//
//        bt.levelOrder();
//
//        bt.search("N5"); // found
//        bt.search("N9"); // found
//        bt.search("N10"); // not found

        bt.insert("N1");
        bt.insert("N2");
        bt.insert("N3");
        bt.insert("N4");
        bt.insert("N5");
        bt.insert("N6");
        bt.insert("N7");
        bt.insert("N8");
        bt.insert("N9");
        bt.levelOrder();

        bt.deleteNode("N1");
        bt.levelOrder(); // N9 N2 N3 N4 N5 N6 N7 N8

        bt.deleteNode("N5");
        bt.levelOrder(); // N9 N2 N3 N4 N8 N6 N7

        bt.deleteBT();
    }
}
