package _2_Array;

public class _24_missing_number {
    public static void missingnum(int[] intarr){
        int sum1 = 0;
        int sum2 = 0;
        sum1 = 10*(10+1)/2;
        for (int i: intarr) {
            sum2 += i;
        }
        int difference = sum1 - sum2;
        System.out.println("The missing number in the given array is: " + difference);
    }
    public static void main(String[] args) {
        int intarr[] = {1,2,3,4,5,6,8,9,10};
        _24_missing_number.missingnum(intarr);

    }
}
