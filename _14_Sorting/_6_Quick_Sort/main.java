package _14_Sorting._6_Quick_Sort;

public class main {
    public static void main(String[] args) {
        int[] arr = {10, 5, 30, 15, 50, 6};
        int[] arr1 = {1, 3, 5, 2, 7, 8, 100, 0};
        QuickSort qs = new QuickSort();
        qs.quickSort(arr1);
        qs.quickSort(arr);
        qs.printArray(arr);
        qs.printArray(arr1);
    }
}
