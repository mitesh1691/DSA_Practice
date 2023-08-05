package _15_Searching;

public class Searching {

//    Linear Search
    public int linearSearch(int[] arr, int value){
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == value){
                System.out.println("The element " + value + " is found at the index: " + i);
                return i;
            }
        }
        System.out.println("The element " + value + " not found");
        return -1;
    }

//    Binary Search
    public int binarySearch(int[] arr, int value) {
        int startPointer = 0;
        int endPointer = arr.length - 1;
        int middle = (startPointer + endPointer) / 2;

        while(arr[middle] != value && startPointer <= endPointer){
            // startPointer <= endPointer is used so that the program does not go in an infinite loop
            if(value < arr[middle]){
                endPointer = middle - 1;
            }
            else{
                startPointer = middle + 1;
            }
            middle = (startPointer + endPointer) / 2;
        }
        if(arr[middle] == value){
            System.out.println("The element " + value + " is found at the index: " + middle);
            return middle;
        }
        else {
            System.out.println("The element " + value + " not found");
            return -1;
        }
    }
}

// Example: searching for 15
// S = startPointer , M = Middle , E = endPointer

// [8, 9, 12, 15, 17, 19, 20, 21, 28]
//  S              M               E       --- step 1
//  S  M       E                           --- step 2
//         S   E                           --- step 3
//         M
//             S                           --- step 4
//             M
//             E