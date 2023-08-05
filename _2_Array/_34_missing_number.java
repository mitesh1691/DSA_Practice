package _2_Array;//Write a function to find the missing number in a given integer array of 1 to 100.
//        Example
//        myArray = {1,2,3,4,6}
//        missingNumber(myArray, 6) ------> 5

public class _34_missing_number {
    static int missingNum(int [] arr, int totalCount){
        int expectedSum = 0;
        int actualSum = 0;
        for(int i = 0; i<arr.length; i++){
            actualSum += arr[i];
        }
        for(int i = 1; i<=totalCount; i++){
            expectedSum += i;
        }
        System.out.println("expected sum is: " + expectedSum);
        return expectedSum - actualSum;
    }
    public static void main(String[] args) {
        int [] intArr = {1,2,3,4,5,6,8,9,10};
        int result = missingNum(intArr, 10);
        System.out.println(result);
    }
}
