package _13_Hashing.Open_Addressing._1_Linear_Probing;

import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        // test code to understand wrap around
//        ArrayList<Integer> arr = new ArrayList<Integer>(7);
//        int index = 3;
//        arr.add(1);
//        arr.add(2);
//        arr.add(3);
//        arr.add(4);
//        arr.add(5);
//        arr.add(6);
//        for(int i = index; i<= index + arr.size(); i++){
//            System.out.println(i);
//        }

        linearProbing obj = new linearProbing(13);
        obj.insertInHashtable("the");
        obj.insertInHashtable("quick");
        obj.insertInHashtable("brown");
        obj.insertInHashtable("fox");
        obj.insertInHashtable("over");
        System.out.println("");

        obj.displayHashtable();

        obj.searchHashTable("fox");
        obj.searchHashTable("ox");

        obj.deleteKeyHashTable("fox");
        obj.deleteKeyHashTable("ox");
        obj.displayHashtable();

    }
}
