package _2_Array;

class main1{
    public int printpairs (int [] array){
        for (int i = 0; i<array.length; i++){
            for (int j = i+1; j<array.length; j++){
                System.out.println(array[i] + ", " + array[j]);
            }
        }
        return 0;
    }


}

public class _09_unordered_pairs_array {
    public static void main(String[] args) {
        main1 obj = new main1();
        int [] arrayyes = {1,3,4,5};
        int result = obj.printpairs(arrayyes);
    }
}
