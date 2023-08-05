package _13_Hashing.Direct_Chaining;

import _13_Hashing.Direct_Chaining.directChaining;

public class main {
    public static void main(String[] args) {
//        directChaining obj = new directChaining(15);
//        obj.insertHashTable("the");
//        obj.insertHashTable("quick");
//        obj.insertHashTable("brown");
//        obj.insertHashTable("fox");
//        obj.insertHashTable("over");
//
//        obj.displayHashTable(); // no collision because of the size

        directChaining obj = new directChaining(13);
        obj.insertHashTable("the");
        obj.insertHashTable("quick");
        obj.insertHashTable("brown");
        obj.insertHashTable("fox");
        obj.insertHashTable("over");

//        obj.displayHashTable(); // collision because of the size

//        obj.searchHashTable("ox");
//        obj.searchHashTable("fox");

        obj.deleteKeyHashTable("fox");
        obj.displayHashTable();
        System.out.println("\n \n");

        obj.deleteKeyHashTable("mitesh");
        obj.displayHashTable();

    }
}
