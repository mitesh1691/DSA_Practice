package _13_Hashing.Open_Addressing._2_Quadratic_Probing;

import java.util.ArrayList;

public class quadraticProbing {
    String[] hashTable;
    int usedCellNumber;

//  Constructor - creating hash table
    public quadraticProbing(int size){
        hashTable = new String[size];
        usedCellNumber = 0;
    }

//    Hash function - sum of ASCII of the string then mod of sum and size of array
    public int modASCIIHashFunction(String word, int sizeofarr){
        char[] ch;
        ch = word.toCharArray();
        int sum = 0;
        for(int i=0; i<word.length(); i++){
            sum += ch[i];
        }
        return sum % sizeofarr;
    }

    //    Get load factor
    public double getLoadFactor(){
        double loadFactor = usedCellNumber * 1.0 / hashTable.length;
        return loadFactor;
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
            insertInHashtable(s);
        }
    }

//    Insert in hash table
    public void insertInHashtable(String word){
        double loadFactor = getLoadFactor();
        if(loadFactor >= 0.75){
            rehashKeys(word);
        }
        else {
            int index = modASCIIHashFunction(word, hashTable.length);
            int counter = 0;
            for(int i = index; i < index + hashTable.length; i++){
                // formula for quadratic probing and wrap around function combined
                int newIndex = (index + (counter * counter)) % hashTable.length;
                if(hashTable[newIndex] == null){
                    hashTable[newIndex] = word;
                    System.out.println(word + " has been inserted successfully at location: " + newIndex);
                    break;
                }
                else {
                    System.out.println("Index " + newIndex + " is already occupied. trying next one..");
                }
                counter++;
            }
            usedCellNumber++;
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
            // quadratic probing formula can also be used as used in insertion
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
            // quadratic probing formula can also be used as used in insertion
            if (hashTable[newIndex] != null && hashTable[newIndex].equals(word)) {
                hashTable[newIndex] = null;
                System.out.println(word + " has been deleted from the hashtable");
                return;
            }
        }
        System.out.println(word + " not found in the hashtable");
    }
}
