package _14_Sorting._7_Heap_Sort;

public class HeapSort {
    int[] arr;

    // Initializing the array
    public HeapSort(int[] arr){
        this.arr = arr;
    }

    // Heap Sort Method
    public void heapSort(){
        BinaryHeap bh = new BinaryHeap(arr.length);

        // inserting elements in heap
        for(int i = 0; i < arr.length; i++){
            bh.insertInHeap(arr[i]);
        }

        // extracting values from heap and adding that value in the array
        // (extracting root node which has the lowest value in the tree)
        // as the newly added value in the tree is lowest it will sort the array automatically
        for(int i = 0; i < arr.length; i++){
            arr[i] = bh.extractHeadOfHeap();
        }
    }

    //    Method to print array
    public void printArray(int[] arr){
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
