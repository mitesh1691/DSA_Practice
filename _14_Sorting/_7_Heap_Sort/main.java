package _14_Sorting._7_Heap_Sort;

public class main {
    public static void main(String[] args) {
        int[] arr = {10, 5, 30, 15, 50, 6};
        int[] arr1 = {1, 3, 5, 2, 7, 8, 100, 0};
        HeapSort hs = new HeapSort(arr);
        HeapSort hs1 = new HeapSort(arr1);

        hs.heapSort();
        hs1.heapSort();

        hs.printArray(arr);
        hs1.printArray(arr1);
    }
}
