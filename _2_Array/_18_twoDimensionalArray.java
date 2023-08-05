package _2_Array;

import java.util.Arrays;

public class _18_twoDimensionalArray {
    int arr[][] = null;
//    this constructor will be called when the object is created and will set the value of all the elements in the array to be minimum integer value
//    Constructor
    public _18_twoDimensionalArray(int numberOfRows , int numberofColumns){
        this.arr = new int[numberOfRows][numberofColumns];
        for (int row = 0; row < arr.length; row++){
            for (int column = 0; column < arr[0].length; column++){
                arr[row][column] = Integer.MIN_VALUE;
            }
        }
    }
//   Inserting value in the array
    public void insertValue(int row, int column, int value){
        try{
            if ( arr[row][column] == Integer.MIN_VALUE){
                arr[row][column] = value;
                System.out.println("the value is successfully inserted");
            }
            else {
                System.out.println("this cell is already occupied");
            }
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("invalid index for 2D array");
        }
    }

//    Accessing cell value from given array
    public void accessCell(int row , int column){
        System.out.println("Accessing row number " + row + ", column number " + column);
        try{
            System.out.println("cell value is: " + arr[row][column]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid index for 2D array");
        }
    }

//    Traverse 2D Array
//    arr[0].length returns number of columns, arr.length returns rows
    public void traverse2DArray(){
        for (int row = 0; row< arr.length; row++){
            for (int column = 0; column< arr[0].length; column++){
                System.out.print(arr[row][column] + ", " );
            }
            System.out.println();
        }
    }

//    Searching for a single value from the array
    public void searchingValue(int value){
        for (int row = 0; row<arr.length; row++){
            for (int column = 0; column<arr[0].length; column++){
                if (arr[row][column] == value){
                    System.out.println("element is found at the row " + row + " and column " + column);
                    return;
                }
            }
        }
        System.out.println("Element not found");
    }

//    Deleting 2D array element
    public void delete2DArray(int row, int column){
        try{
            System.out.println("value to be deleted is " + arr[row][column] + "\n Successfully deleted");
            arr[row][column] = Integer.MIN_VALUE;
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("This index is not valid for the array");
        }
    }

    public static void main(String[] args) {
        _18_twoDimensionalArray obj = new _18_twoDimensionalArray(3,3);
//        inserting elements into 2D array
        obj.insertValue(0,0, 10);
        obj.insertValue(0,0, 20);
        System.out.println(Arrays.deepToString(obj.arr));

    }
}
