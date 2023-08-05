package _2_Array;

public class _26_find_element_array {
    public void searchElement(int [] arr, int valueTOBeSearched){
        for ( int i= 0; i< arr.length; i++){
            if( arr[i] == valueTOBeSearched){
                System.out.println("This value is found at the location: " + i);
                return;
            }
        }
        System.out.println("value not found");
    }
    public static void main(String[] args) {
        _26_find_element_array obj = new _26_find_element_array();
        int [] intArr = {1,2,3,4,5,6};
        obj.searchElement(intArr, 6);
        obj.searchElement(intArr, 7);
    }
}
