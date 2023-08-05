package _2_Array;

//Write a function to find all pairs of an integer array whose sum is equal to a given number.
//        Example
//        pairSum({2, 4, 3, 5, 6, -2, 4, 7, 8, 9},7)
//        Output : "2:5 4:3 3:4 -2:9 "
public class _36_pairs {
    public static String pairSum(int[] myArray, int sum) {
        String result = "";
        for(int i=0; i<myArray.length; i++) {
            for(int j=i+1; j<myArray.length; j++) {
                if (myArray[i]+myArray[j]==sum) {
                    result += myArray[i]+":"+myArray[j]+" ";
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int [] intArr = {2, 4, 3, 5, 6, -2, 4, 7, 8, 9};
        String result = pairSum(intArr, 7);
        System.out.println(result);
    }
}
