package _2_Array;

public class _29_permutation {
    public boolean permutation( int [] arr1, int[] arr2){
        if ( arr1.length != arr2.length){
            return false;
        }
        int sum1 = 0;
        int sum2 = 0;
        int mul1 = 1;
        int mul2 = 1;
        for (int i = 0; i<arr1.length; i++){
            sum1 += arr1[i];
            sum2 += arr2[i];
            mul1 *= arr1[i];
            mul2 *= arr2[i];
        }
        if (sum1 == sum2 && mul1 == mul2){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        _29_permutation obj = new _29_permutation();
//        int[] intArr1 = {1, 2, 3, 4, 5};
        int[] intArr1 = {1, 2, 3, 4, 5, 6};
        int[] intArr2 = {5, 4, 3, 2, 1};
        boolean result = obj.permutation(intArr1, intArr2);
        System.out.println(result);
    }
}

