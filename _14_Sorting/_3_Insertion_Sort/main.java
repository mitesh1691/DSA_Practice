package _14_Sorting._3_Insertion_Sort;

public class main {
    public static void main(String[] args) {
        InsertionSort is = new InsertionSort();
        int[] arr = {10, 3, 2, 5, 8, 4, 1, 9};
        int[] arr1 = {50, 60, 55, 45, 33, 23, 70, 90, 76};

        is.insertionSort(arr);
        is.insertionSort(arr1);

        is.printArray(arr);
        is.printArray(arr1);
    }
}
