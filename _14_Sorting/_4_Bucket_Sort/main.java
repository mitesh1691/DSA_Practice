package _14_Sorting._4_Bucket_Sort;

public class main {
    public static void main(String[] args) {
        int[] arr = {9,7,5,4,2,1,3,6,8};
        BucketSort bs = new BucketSort(arr);
        bs.printArray(arr);
        bs.bucketSort();
        System.out.println();
        bs.printArray(arr);
    }
}
