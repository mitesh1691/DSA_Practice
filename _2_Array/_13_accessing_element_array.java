package _2_Array;

public class _13_accessing_element_array {
    public static void main(String[] args) {
        SingleDimensionArray obj = new SingleDimensionArray(10);
        obj.printarr();
        obj.insert(0, 0);
        obj.insert(1, 3);
        obj.insert(2, 5);
        obj.insert(1, 7);
        obj.insert(5, 10);
        obj.insert(9, 11);
        obj.insert(16, 15);
        obj.printarr();

        var firstElement = obj.arr[0];
        System.out.println(firstElement);
        var fifthElement = obj.arr[5];
        System.out.println(fifthElement);
        var lastElement = obj.arr[9];
        System.out.println(lastElement);
//        var elementThatDoesNotExists = obj.arr[15];
    }
}
