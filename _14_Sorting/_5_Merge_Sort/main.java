package _14_Sorting._5_Merge_Sort;

public class main {
    public static void main(String[] args) {
        MergeSort ms = new MergeSort();
        int[] arr = {10, 5, 30, 15, 50, 6};
        int[] arr1 = {1, 3, 5, 2, 7, 8, 100, 0};
        ms.mergeSort(arr);
        ms.mergeSort(arr1);
        ms.printArray(arr);
        ms.printArray(arr1);
    }
}
