package _14_Sorting._1_Bubble_Sort;

public class main {
    public static void main(String[] args) {
        BubbleSort bs = new BubbleSort();
        int[] arr = {10, 5, 30, 15, 50, 6};
        int[] arr1 = {1, 3, 5, 2, 7, 8, 100, 0};
        bs.bubbleSort(arr);
        bs.bubbleSort(arr1);
        bs.printArray(arr);
        bs.printArray(arr1);

    }
}
