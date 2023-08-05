package _2_Array;

public class _16_deleting_array_element {
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

        System.out.println(obj.arr[9]);
        obj.deletevalue(9);
        System.out.println(obj.arr[9]);
    }
}
