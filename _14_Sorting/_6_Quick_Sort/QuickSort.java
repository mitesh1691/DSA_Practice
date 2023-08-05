package _14_Sorting._6_Quick_Sort;

import java.util.Random;

public class QuickSort {

    public void quickSort(int[] arr){
        quickSort(arr, 0, arr.length - 1);
    }
    public void quickSort(int[] arr, int lowIndex, int highIndex){
        if(lowIndex >= highIndex){
            return;
        }

//        int pivotIndex = arr[highIndex];
        int pivot = new Random().nextInt(highIndex - lowIndex) + lowIndex;
        int pivotIndex = arr[pivot];
        swap(arr, pivot, highIndex);

        int leftPointer = partition(arr, lowIndex, highIndex, pivotIndex);

        quickSort(arr, lowIndex, leftPointer - 1);
        quickSort(arr, leftPointer + 1, highIndex);
    }

    private int partition(int[] arr, int lowIndex, int highIndex, int pivotIndex) {
        int leftPointer = lowIndex;
        int righPointer = highIndex - 1;

        while(leftPointer < righPointer) {
            while (arr[leftPointer] <= pivotIndex && leftPointer < righPointer) {
                leftPointer++;
            }
            while (arr[righPointer] >= pivotIndex && leftPointer < righPointer) {
                righPointer--;
            }
            swap(arr, leftPointer, righPointer);
        }

        if(arr[leftPointer] > arr[highIndex]){
            swap(arr, leftPointer, highIndex);
        }
        else {
            leftPointer = highIndex;
        }
        return leftPointer;
    }

    //    Method to swap the elements
    public void swap(int[] arr, int index1, int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

//    Method to print array
    public void printArray(int[] arr){
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
