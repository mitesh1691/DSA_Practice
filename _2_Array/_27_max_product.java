package _2_Array;

public class _27_max_product {
    public String maxProduct(int [] arr){
        int maxProduct = 0;
        String pairs = "";
        for ( int i = 0; i<arr.length; i++){
            for (int j = i+1; j<arr.length; j++){
                if (arr[i] * arr[j] > maxProduct){
                    maxProduct = arr[i] * arr[j];
                    pairs = Integer.toString(arr[i]) + ", " + Integer.toString(arr[j]);
                }
            }
        }
        return pairs;
    }
    public static void main(String[] args) {
        int [] intArr = {10, 60, 30, 40, 50};
        _27_max_product obj = new _27_max_product();
        String result = obj.maxProduct(intArr);
        System.out.println(result);
    }
}
