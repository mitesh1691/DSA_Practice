package _2_Array;//Given 2D array calculate the sum of diagonal elements.
//        myArray2D= {{1,2,3},{4,5,6},{7,8,9}};
//        sumDiagonal(myArray2D) ----> 15

public class _32_sum_of_diagonal_elements {
    public int sumDigonal (int[][] arr){
        int sum = 0;
        for (int i =0; i<arr.length; i++){
             sum = sum + arr[i][i];
        }
        return sum;
    }
    public static void main(String[] args) {
        _32_sum_of_diagonal_elements obj = new _32_sum_of_diagonal_elements();
        int intArr[][] = {{1,2,3},{4,5,6},{7,8,9}};
        int result = obj.sumDigonal(intArr);
        System.out.println(result);
    }
}
