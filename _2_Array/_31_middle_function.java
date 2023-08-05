package _2_Array;

import java.util.Arrays;

//Write a function called middle that takes a list and returns a new list that contains all but the first and last elements.
//        myArray = [1, 2, 3, 4]
//        middle(myArray)  output ---> [2,3]
public class _31_middle_function {
    public int[] middle(int [] arr) {
            return Arrays.copyOfRange(arr, 1, arr.length-1);
    }
    public static void main(String[] args) {
        _31_middle_function obj = new _31_middle_function();
        int [] intArr = {1,2,3,4,5,6};
        String result = Arrays.toString(obj.middle(intArr));
        System.out.println(result);
    }
}
