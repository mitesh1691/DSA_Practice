package _14_Sorting._2_Selection_Sort;

public class main {
    public static void main(String[] args) {
        SelectionSort ss = new SelectionSort();
        int[] arr = {10, 3, 2, 5, 8, 4, 1, 9};
        int[] arr1 = {50, 60, 55, 45, 33, 23, 70, 90, 76};

        ss.selectionSort(arr);
        ss.selectionSort(arr1);

        ss.printArray(arr);
        ss.printArray(arr1);
    }
}
