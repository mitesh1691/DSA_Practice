package _13_Hashing.Open_Addressing._3_Double_Hashing;

public class main {
    public static void main(String[] args) {
        doubleHashing obj = new doubleHashing(13);
        obj.insertInHashTable("the");
        obj.insertInHashTable("quick");
        obj.insertInHashTable("brown");
        obj.insertInHashTable("fox");
        obj.insertInHashTable("over");
        obj.insertInHashTable("lazy");


        System.out.println("");

        obj.displayHashTable();


        obj.searchHashTable("fox");
        obj.searchHashTable("ox");

        obj.deleteKeyHashTable("ox");
        obj.displayHashTable();

        System.out.println(obj.usedCellNumber);
    }
}
