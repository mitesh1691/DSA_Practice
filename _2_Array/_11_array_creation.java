package _2_Array;

import java.util.Arrays;
class SingleDimensionArray{
    int arr[] = null;
    public SingleDimensionArray(int SizeOfArray){
        arr = new int[SizeOfArray];
        for ( int i = 0; i< arr.length; i++){
            arr[i] = Integer.MIN_VALUE;
        }
    }
    public void insert(int location, int valueToBeInserted){
        try{
            if (arr[location] == Integer.MIN_VALUE){
                arr[location] = valueToBeInserted;
                System.out.println("successfully inserted");
            }
            else {
                System.out.println("This cell is already Occupied");
            }
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid index to access array");
        }
    }
    public void printarr(){
        System.out.println(Arrays.toString(arr));
    }

    public void traverseArray(){
        try{
            for (int i = 0; i< arr.length; i++){
                System.out.print(arr[i] + ", ");
            }
        } catch(Exception e){
            System.out.println("Array no longer exists");
        }
    }

    public void searchingArrayElement(int valueToBeSearched){
        for ( int i = 0; i<arr.length; i++){
            if(arr[i] == valueToBeSearched ){
                System.out.println("value is found at the index of " + i);
                return;
            }
        }
        System.out.println("element not found in array");
    }
    public void deletevalue(int valueTOBeDeleted){
        try{
            arr[valueTOBeDeleted] = Integer.MIN_VALUE;
            System.out.println("element has been deleted");
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("the value this is provided is not in the range of array");
        }
    }
}
public class _11_array_creation {
    public static void main(String[] args) {
//        creating using three steps
        int [] myarr;
        myarr = new int[3];
        myarr[0] = 1;
        myarr[1] = 2;
        myarr[2] = 3;
        System.out.println(Arrays.toString(myarr));

//        creating array all steps combined
        String [] myarr2 = {"a", "b", "c"};
        System.out.println(Arrays.toString(myarr2));
    }
}
