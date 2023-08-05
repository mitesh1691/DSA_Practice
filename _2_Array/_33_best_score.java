package _2_Array;//Given an array, write a function to get first, second best scores from the array.
//        Array may contain duplicates.
//        myArray = {84,85,86,87,85,90,85,83,23,45,84,1,2,0}
//        firstSecond(myArray) ----> 90 87

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class _33_best_score {
    static String firstsecond(Integer[] myArray) {
        Integer [] arr = myArray;
        Arrays.sort(arr, Collections.reverseOrder());
        int first = arr[0];
        Integer second = null;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != first) {
                second = arr[i];
                break;
            }
        }
        return first + ", " + second;
    }

    public static void main(String[] args) {
        Integer[] intArr = {84, 85, 86, 87, 85, 90, 85, 83, 23, 45, 84, 1, 2, 0};
        String result = firstsecond(intArr);
        System.out.println(result);
    }
}
