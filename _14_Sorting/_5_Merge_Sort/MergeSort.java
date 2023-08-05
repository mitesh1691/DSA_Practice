package _14_Sorting._5_Merge_Sort;

public class MergeSort {
    //merge sort method
    public void mergeSort(int[] arr){
        // base condition for the recursion
        // if split array length becomes less than 2 which is 1
        // recursion will stop because array with 1 element cannot be split furthur
        if(arr.length < 2){
            return;
        }

        // initializing variables and split arrays
        int midIndex = arr.length/2;
        int[] leftarr = new int[midIndex];
        int[] rightarr = new int[arr.length - midIndex];

        // adding elements to the split arrays
        for(int i = 0; i < midIndex; i++){
            leftarr[i] = arr[i];
        }
        for (int i = midIndex; i < arr.length; i++){
            // here 'i' is starting from the index of midIndex
            // so if rightarr[i] is taken it will add the element to the midIndex index of that array
            // hence i - midIndex is taken to reduce the index number
            // for ex - mid = 5, so i = 5 rightarr[5-5] = 0
            //rightarr[6-5] = 1 (index)
            rightarr[i - midIndex] = arr[i];
        }

        mergeSort(leftarr); // recursively calling the method till base condition is reached
        mergeSort(rightarr);

        merge(arr, leftarr, rightarr); // calling merge method
    }

    // method to merge the split arrays
    public void merge(int[] arr, int[] leftarr, int[] rightarr){
        int i = 0; // one variable for each input
        int j = 0;
        int k = 0;

        //loop will run till one of the array length is reached
        while( i < leftarr.length && j < rightarr.length){
            if(leftarr[i] <= rightarr[j]){
                arr[k] = leftarr[i];
                i++;
            }
            else {
                arr[k] = rightarr[j];
                j++;
            }
            k++;
        }

        // if one array is bigger than the other above loop will not be able--
        // to deal with that.
        // So, the loops below will add the elements of the bigger array--
        // to main array
        while(i < leftarr.length){
            arr[k] = leftarr[i];
            i++;
            k++;
        }
        while(j < rightarr.length){
            arr[k] = rightarr[j];
            j++;
            k++;
        }
    }

    //    method to print array
    public void printArray(int[] arr){
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
