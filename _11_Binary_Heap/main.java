package _11_Binary_Heap;

public class main {
    public static void main(String[] args) {
        binaryHeap bH = new binaryHeap(7);

        bH.peek(); // Binary Heap is Empty

        int a = bH.sizeOfHeap();
        System.out.println(a);

        bH.levelOrder();

//        Min heap:-
        bH.insert(10, "Min");
        bH.insert(5, "Min");
        bH.insert(15, "Min");
        bH.insert(1, "Min");
        bH.insert(4, "Min");
        bH.insert(12, "Min");
        bH.levelOrder(); // 1 4 12 10 5 15

        bH.extractHeadOfBH("Min");
        bH.levelOrder(); // 4 5 12 10 15


//        Min heap:-
//        bH.insert(10, "Max");
//        bH.insert(5, "Max");
//        bH.insert(15, "Max");
//        bH.insert(1, "Max");
//        bH.insert(4, "Max");
//        bH.insert(12, "Max");
//        bH.levelOrder(); // 15 5 12 1 4 10
//
//        bH.extractHeadOfBH("Max");
//        bH.levelOrder();

        bH.deleteBH();
    }
}
