package _13_Hashing.Open_Addressing._1_Linear_Probing;

import java.util.ArrayList;

public class linearProbing {
    String [] hashTable;
    int usedCellNumber;

    //Constructor - creating hash table
    public linearProbing(int size){
        hashTable = new String[size];
        usedCellNumber = 0;
    }

//    Hash function - sum of ASCII of the string then mod of sum and size of array
    public  int modASCIIHashFunction(String word, int sizeofarr){
        char[] ch;
        ch = word.toCharArray();
        int sum = 0;
        for(int i = 0; i<word.length(); i++){
            sum += ch[i];
        }
        return sum % sizeofarr;
    }

//    Get load factor
    public double getLoadFactor(){
        double loadFactor = usedCellNumber * 1.0/ hashTable.length;
        // actual formula is total cells used / total cells, integer division error occurs
        // that's why formula is taken to be
        // usedcellnumber * 1.0 / hashtable.length
        return loadFactor;
    }

//    Rehashing - creating new hash table with twice the size
    public void rehashKeys(String word){
        usedCellNumber = 0;
        ArrayList<String> data = new ArrayList<String>();
        for( String s  : hashTable){
            if(s != null){
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
            for(int i = index; i < index + hashTable.length; i++){
                int newIndex = i % hashTable.length;
                // these two lines used to wrap around to the beginning of the array
                // check main.java and notes for better understanding of these two lines
                if(hashTable[newIndex] == null){
                    hashTable[newIndex] = word;
                    System.out.println(word + " successfully inserted at location: " + newIndex);
                    break;
                }
                else {
                    System.out.println("The cell " + newIndex + " is alredy occupied. Trying next cell");
                }
            }
            usedCellNumber++;
        }
    }

//    Display Hash table
    public void displayHashtable(){
        if (hashTable == null){
            System.out.println("Hashtable does not exists");
            return;
        }
        else {
            System.out.println("---------------HashTable-------------");
            for (int i = 0; i < hashTable.length; i++) {
                System.out.println("Index: " + i + ", Key: " + hashTable[i]);
            }
        }
    }

//    Search Hash table
    public boolean searchHashTable(String word){
        int index = modASCIIHashFunction(word, hashTable.length);
        for(int i = index; i < index + hashTable.length; i++){
            int newIndex = i % hashTable.length;
            if(hashTable[newIndex] != null && hashTable[newIndex].equals(word)){
                System.out.println(word + " found in hashtable at location: " + newIndex);
                return true;
            }
        }
        System.out.println(word + " not found in the hash table");
        return false;
    }

//    Delete hash table
    public void deleteKeyHashTable(String word){
        int index = modASCIIHashFunction(word, hashTable.length);
        for(int i = index; i < index + hashTable.length; i++){
            int newIndex = i % hashTable.length;
            if(hashTable[newIndex] != null && hashTable[newIndex].equals(word)){
                hashTable[newIndex] = null;
                System.out.println(word + " has been deleted from the hashtable");
                return;
            }
        }
        System.out.println(word + " not found in the hashtable");
    }



}
