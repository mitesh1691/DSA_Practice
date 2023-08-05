package _15_Searching;

public class main {
    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 10, 23, 11};
        Searching obj = new Searching();
        obj.linearSearch(arr, 23);
        obj.linearSearch(arr, 50);

        int[] arr1 = {8, 9, 12, 15, 17, 19, 20, 21, 28};
        obj.binarySearch(arr1, 28);
        obj.binarySearch(arr1, 17);
        obj.binarySearch(arr1, 50);

        int[] arr2 = {8, 9, 12, 15, 17, 19};
        obj.binarySearch(arr2, 19 );
    }
}
