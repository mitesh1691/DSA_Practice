package _2_Array;

import java.util.Arrays;

public class _10_reversing_an_array {
    void reverse(int [] array){
        for ( int i = 0; i < array.length/2; i++){
            int last = array.length - i - 1;
            int current = array[i];
            array[i] = array[last];
            array[last] = current;
        }
        System.out.println(Arrays.toString(array));
    }
    public static void main(String[] args) {
        _10_reversing_an_array obj = new _10_reversing_an_array();
        int [] arrayyes = {1,3,4,5};
        obj.reverse(arrayyes);
    }
}
