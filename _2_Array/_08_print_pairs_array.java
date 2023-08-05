class main{
    public int printpairs (int [] array){
        for (int i = 0; i<array.length; i++){
            for (int j = 0; j<array.length; j++){
                System.out.println(array[i] + ", " + array[j]);
            }
        }
        return 0;
    }


}
public class _08_print_pairs_array {
    public static void main(String[] args) {
        main obj = new main();
        int [] arrayyes = {1,3,4,5};
        int result = obj.printpairs(arrayyes);

    }
}
