package _2_Array;

public class _28_contains_duplicate {
    public boolean isUnique(int [] arr){
        for ( int i =0; i<arr.length; i++){
            for (int j = i+1; j<arr.length; j++){
                if (arr[i] == arr[j]){
                    return false;
                }
            }
        }
        return true;
    }
    public static void main(String[] args) {
        _28_contains_duplicate obj = new _28_contains_duplicate();
//        int [] intArr = {1,2,3,4,5,6,7};
        int [] intArr = {1,2,3,4,5,6,6};
        boolean result = obj.isUnique(intArr);
        System.out.println(result);
    }
}
