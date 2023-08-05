package _2_Array;

import java.util.Arrays;

public class _22_deleting_2D_array_element {
    public static void main(String[] args) {
        _18_twoDimensionalArray obj = new _18_twoDimensionalArray(3,3);
        obj.insertValue(0,0, 10);
        obj.insertValue(0,1, 20);
        obj.insertValue(0,2, 30);
        obj.insertValue(1,1, 40);
        obj.insertValue(2,2, 50);


        obj.delete2DArray(1,1);
        obj.delete2DArray(2,3);
        System.out.println(Arrays.deepToString(obj.arr));
    }
}
