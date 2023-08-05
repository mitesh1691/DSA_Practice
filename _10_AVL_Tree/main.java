package _10_AVL_Tree;

public class main{
    public static void main(String[] args) {
        avlTree avl = new avlTree();

        avl.insert(5);
        avl.insert(10);
        avl.insert(15);
        avl.insert(20);
        avl.levelOrder();

        avl.deleteNodeavl(5);
        System.out.println();
        avl.levelOrder();

        System.out.println();

        avl.deleteAVL();
    }
}
