package _14_Sorting._3_Insertion_Sort;

public class InsertionSort {
    public void insertionSort(int[] arr){
        for(int i = 1; i < arr.length; i++){
            int temp = arr[i]; // store value of i into temporary variable
            int j = i - 1; // j is 1 value less than i
            while(j >= 0 && arr[j] > temp){ // loop till beginning of array OR till arr[j] is larger than our value stop when it becomes smaller
                arr[j + 1] = arr[j]; // shift the value of j to j+1
                j--; // decrementing j to the beginning of the array
            }
            arr[j+1] = temp; // if the value is greater than j place it after j
        }
    }

    public void printArray(int[] arr){
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
