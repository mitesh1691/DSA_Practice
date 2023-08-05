package _2_Array;

//  Time Complexity of this code is O(N)
public class _07_sum_and_product_of_array {
    public static void spofarray(int[] array){
        int sum = 0;
        int product = 1;
        for ( int i = 0 ; i<array.length; i++){
            sum += array[i];
        }
        for ( int i = 0 ; i<array.length; i++){
            product *= array[i];
        }
        System.out.println("sum of the array is " + sum);
        System.out.println("product of the array is " + product);



    }
    public static void main(String[] args) {

        int [] custarray = {1,3,5,6};
        spofarray(custarray);



    }
}
