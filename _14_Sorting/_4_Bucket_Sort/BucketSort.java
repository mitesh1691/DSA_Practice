package _14_Sorting._4_Bucket_Sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;

public class BucketSort {
    int [] arr;

    public BucketSort(int[] arr){
        this.arr = arr;
    }

//    method to print array
    public void printArray(int[] arr){
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

//    Method to print Buckets
    public void printBucket(ArrayList<Integer>[] buckets){
        // creating an array of arraylists (every array index is an arraylist)
        for(int i = 0; i < buckets.length; i++){
            System.out.println("\nBucket Number - " + i + ": ");
            for (int j = 0; j < buckets[i].size(); j++){
                System.out.print(buckets[i].get(j) + " ");
            }
        }

    }

//    Bucket Sorting
    public void bucketSort(){
        // finding out the total no of buckets using formula: square root of array length
        // converting the float obtained by Math.ceil to Int using (int)
        int numberOfBuckets = (int) Math.ceil(Math.sqrt(arr.length));
        // finding maximum value in the array
        int maxValue = Integer.MIN_VALUE;
        for(int value: arr){
            if(value > maxValue ){
                maxValue = value;
            }
        }

        // creating array of buckets where each index is an arraylist
        ArrayList<Integer>[] buckets = new ArrayList[numberOfBuckets];
        for(int i = 0; i < buckets.length; i++){
            // initializing the array list
            // creating the array list for every index of the array buckets
            buckets[i] = new ArrayList<Integer>();
        }

        // adding elements from the array to the buckets
        for(int value: arr){
            // converting to float before performing operations, then taking ceil value then again converting to int
            int bucketNumber = (int) Math.ceil(((float) value * numberOfBuckets) / (float) maxValue);
            // calculate the bucket number for the values to understand the below statement
            // because of ceil function the value get rounded upwards so the buckets will -
            // normally start from 1 and so on
            // that's why bucketNumber -1 is used
            // for example if bucketNumber obtained is 1 (because of ceil) element will be added to bucket 0
            // if `Math.floor` is used this problem can be solved
            buckets[bucketNumber - 1].add(value);
        }

        // printing the buckets before sorting
        System.out.println("\n\nPrinting buckets before sorting...");
        printBucket(buckets);

        //sorting the buckets
        for(ArrayList<Integer> bucket: buckets){
            // for every arraylist in the array buckets, sort the arraylist
            Collections.sort(bucket);
        }

        // printing the buckets after sorting
        System.out.println("\n\nPrinting buckets after sorting...");
        printBucket(buckets);

        // combining all the buckets into an array
        int index = 0;
        for(ArrayList<Integer> bucket: buckets){
            // for every arraylist in the arrray bucket perform this
            // for every value in the arraylist of the array, add every element of the
            // -arraylist to the original array
            for(int value : bucket){
                arr[index] = value;
                index++;
            }
        }
    }
}