package _13_Hashing.Open_Addressing._3_Double_Hashing;

import java.util.ArrayList;

public class doubleHashing {
    String[] hashTable;
    int usedCellNumber;

    //  Constructor - creating hash table
    public doubleHashing(int size){
        hashTable = new String[size];
        usedCellNumber = 0;
    }

    //    Hash function 1 - sum of ASCII of the string then mod of sum and size of array
    public int modASCIIHashFunction(String word, int sizeofarr){
        char[] ch;
        ch = word.toCharArray();
        int sum = 0;
        for(int i = 0; i < word.length(); i++){
            sum += ch[i];
        }
        return sum % sizeofarr;
    }

//  Helper function for hash function 2: add all the digits of an integer together
    private int addAllDigitsTogether(int sum) {
        int value = 0;
        while (sum > 0) {
            value += sum % 10;
            sum = sum / 10;
        }
        return value;
    }

//    Second Hash Function
    public int secondHashFunction(String x, int sizeofarr) {
        char ch[];
        ch = x.toCharArray();
        int sum = 0;
        for (int i=0; i<x.length(); i++) {
            sum += ch[i];
        }
        while (sum > hashTable.length) {
            sum = addAllDigitsTogether(sum);
        }
        return sum % sizeofarr;
    }


    //    Get load factor
    public double getLoadFactor(){
        double loadFactor = usedCellNumber * 1.0 / hashTable.length;
        return loadFactor;
    }

//    Insert in hash table
    public void insertInHashTable(String value) {
        double loadFactor = getLoadFactor();
        if (loadFactor >= 0.75) {
            rehashKeys(value);
        } else {
            int x = modASCIIHashFunction(value, hashTable.length);
            int y = secondHashFunction(value, hashTable.length);
            for (int i = 0; i<hashTable.length; i++) {
                int newIndex = (x + i*y) % hashTable.length;
                if (hashTable[newIndex] == null) {
                    hashTable[newIndex] = value;
                    System.out.println(value +" inserted at location:" +newIndex);
                    break;
                } else {
                    System.out.println(newIndex +" is occupied. Tryin next empty index..");
                }

            }
            usedCellNumber++;
        }
    }

    //    Rehashing - creating new hash table with twice the size
    public void rehashKeys(String word){
        usedCellNumber = 0;
        ArrayList<String> data = new ArrayList<String>();
        for(String s : hashTable){
            if(s != null) {
                data.add(s);
            }
        }
        data.add(word);
        hashTable = new String[2 * hashTable.length];
        for(String s : data){
            insertInHashTable(s);
        }
    }

    //    Display Hash table
    public void displayHashTable(){
        if(hashTable == null){
            System.out.println("Hashtable does not exists !!");
            return;
        }
        else{
            System.out.println("-----------HashTable-----------");
            for(int i = 0; i < hashTable.length; i++){
                System.out.println("index: " + i + ", key: " + hashTable[i]);

            }
        }
    }

    //    Search Hash table
    public boolean searchHashTable(String word){
        int index = modASCIIHashFunction(word, hashTable.length);
        for(int i = index; i < index + hashTable.length; i++){
            int newIndex = i % hashTable.length;
            if (hashTable[newIndex] != null && hashTable[newIndex].equals(word)){
                System.out.println(word + " found in hashtable at location: " + newIndex);
                return true;
            }
        }
        System.out.println(word + " not found in the hash table");
        return false;
    }

    //    Delete hash table
    public void deleteKeyHashTable(String word) {
        int index = modASCIIHashFunction(word, hashTable.length);
        for (int i = index; i < index + hashTable.length; i++) {
            int newIndex = i % hashTable.length;
            if (hashTable[newIndex] != null && hashTable[newIndex].equals(word)) {
                hashTable[newIndex] = null;
                System.out.println(word + " has been deleted from the hashtable");
                return;
            }
        }
        System.out.println(word + " not found in the hashtable");
    }
}
