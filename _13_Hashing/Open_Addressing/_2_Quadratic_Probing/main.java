package _13_Hashing.Open_Addressing._2_Quadratic_Probing;

public class main {
    public static void main(String[] args) {
        quadraticProbing obj = new quadraticProbing(13);
        obj.insertInHashtable("the");
        obj.insertInHashtable("quick");
        obj.insertInHashtable("brown");
        obj.insertInHashtable("fox");
        obj.insertInHashtable("over");
        obj.insertInHashtable("lazy");

        System.out.println("");

        obj.displayHashTable();


        obj.searchHashTable("fox");
        obj.searchHashTable("ox");

//        obj.deleteKeyHashTable("fox");
        obj.deleteKeyHashTable("ox");
        obj.displayHashTable();

        System.out.println(obj.usedCellNumber);

    }
}
