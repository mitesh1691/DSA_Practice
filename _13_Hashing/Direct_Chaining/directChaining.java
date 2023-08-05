package _13_Hashing.Direct_Chaining;
import java.util.LinkedList;

public class directChaining {
    LinkedList<String>[] hashTable; // creating an array with the data type linked list
    // array of linked list
    int maxChainSize = 5;

    //Constructor - creating hash table
    public directChaining(int size){
        hashTable = new LinkedList[size]; // initializing the array of linked list
    }

//    Hash Function - sum of ASCII of the string then mod of sum and size of array
    public int modASCIIHashFunction(String word, int sizeofarr){
        char[] ch; // creating array named ch with data type char
        ch = word.toCharArray(); // converting the string word to char array. mits = [m,i,t,s]
        int sum = 0;
        for (int i = 0; i<word.length(); i++){
            sum += ch[i]; // summing the ascii values
            // compiler automatically converts the char to ascii as we declare the datatype to int (int sum)
        }
        return sum % sizeofarr;
    }

//    Insert
    public void insertHashTable(String word){
        // creating a newindex where the word will be inserted, using hashfunction for the index value
        int newIndex =  modASCIIHashFunction(word, hashTable.length);

        // if the cell is null create new linked list node there
        if(hashTable[newIndex] == null){
            hashTable[newIndex] = new LinkedList<String>();
            hashTable[newIndex].add(word);
        }
        // linked list is already created then -
        else {
            hashTable[newIndex].add(word);
        }
    }

//    Display hash table
    public void displayHashTable(){
        if(hashTable == null){
            System.out.println("Hash table does not exists");
            return;
        }
        else {
            System.out.println("------------HashTable-------------");
            for(int i = 0; i<hashTable.length; i++){
                System.out.println("Index: " + i + ", Value: " + hashTable[i]);
            }
        }
    }

//    Search hash table
    public boolean searchHashTable(String word){
        int newIndex = modASCIIHashFunction(word, hashTable.length);

        if(hashTable[newIndex] != null && hashTable[newIndex].contains(word)){
            System.out.println(word + " found in hash table at location " + newIndex);
            return true;
        }
        else{
            System.out.println(word + " not found in hash table");
            return false;
        }
    }

//    Delete key
    public void deleteKeyHashTable(String word){
        int newIndex = modASCIIHashFunction(word, hashTable.length);
        boolean result = searchHashTable(word);
        if(result){
            hashTable[newIndex].remove(word);
            System.out.println(word + " successfully deleted from hash table");
        }
    }
}
