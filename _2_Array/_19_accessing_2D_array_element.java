package _2_Array;

import java.util.Arrays;

public class _19_accessing_2D_array_element {
    public static void main(String[] args) {
        _18_twoDimensionalArray obj = new _18_twoDimensionalArray(3,3);
        obj.insertValue(0,0, 10);
        obj.insertValue(0,1, 20);
        obj.insertValue(0,2, 30);
        System.out.println(Arrays.deepToString(obj.arr));

        obj.accessCell(0,2);
        obj.accessCell(0,1);
        obj.accessCell(0,4);
    }
}
