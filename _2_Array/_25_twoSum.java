package _2_Array;

import java.util.Arrays;
public class _25_twoSum {
    public int[] twoSum(int [] arr, int target){
        for ( int i = 0; i < arr.length; i++){
            for (int j = i; j<arr.length; j++){
//                j = i+1 if addition of the element with same location is not allowed i.e. 4+4
                if (arr[i]+ arr[j] == target){
                    return new int[] { i, j};
                }
            }
        }
        throw new IllegalArgumentException("No solution found");
    }
    public static void main(String[] args) {
//        int [] intArr = {7,3,2,11};
        int [] intArr = {7,3,4,11};
        _25_twoSum obj = new _25_twoSum();
//        int [] result = obj.twoSum(intArr, 7);
        int [] result = obj.twoSum(intArr, 8);
        System.out.println(Arrays.toString(result));
    }
}
