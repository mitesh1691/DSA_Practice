package _8_Binary_Tree._2_usingArray;

public class main {
    public static void main(String[] args) {
//        binaryTree bt = new binaryTree(5); // A blank tree with the size 5 has been created
//        bt.insert("N1");
//        bt.insert("N2");
//        bt.insert("N3");
//        bt.insert("N4");
//        bt.insert("N5"); // the value N5 has been inserted
//        bt.insert("N6");// error - The BT is full

        binaryTree bt = new binaryTree(9);
        bt.insert("N1");
        bt.insert("N2");
        bt.insert("N3");
        bt.insert("N4");
        bt.insert("N5"); // the value N5 has been inserted
        bt.insert("N6");
        bt.insert("N7");
        bt.insert("N8");
        bt.insert("N9");

        bt.preOrder(1); //  N1 N2 N4 N8 N9 N5 N3 N6 N7
        System.out.println();
        bt.inOrder(1); // N8 N4 N9 N2 N5 N1 N6 N3 N7
        System.out.println();
        bt.postOrder(1); // N8 N9 N4 N5 N2 N6 N7 N3 N1
        System.out.println();
        bt.levelOrder(); // N1 N2 N3 N4 N5 N6 N7 N8 N9
        System.out.println();

        bt.search("N5");
        bt.search("N6");
        bt.search("N10");

        bt.delete("N5");
        bt.levelOrder(); // N1 N2 N3 N4 N9 N6 N7 N8

        bt.deleteTree();

    }
}
