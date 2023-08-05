package _2_Array;

import java.util.Arrays;

public class _14_array_traversal {
//    code from array insertion

    public static void main(String[] args) {
        SingleDimensionArray obj = new SingleDimensionArray(10);

        obj.printarr();
        obj.insert(0, 0);
        obj.insert(1, 3);
        obj.insert(2, 5);
        obj.insert(1, 7);
        obj.insert(5, 10);
        obj.insert(9, 11);
        obj.insert(16, 15);
        obj.printarr();

        obj.traverseArray();


    }
}
