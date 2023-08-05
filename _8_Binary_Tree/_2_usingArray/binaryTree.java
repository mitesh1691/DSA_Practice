package _8_Binary_Tree._2_usingArray;

public class binaryTree {
    String[] arr;
    int lastUsedIndex;

//    Creation
    public binaryTree(int size){
        arr = new String[size + 1];
        this.lastUsedIndex = 0;
        System.out.println("A blank tree with the size " + size + " has been created");
    }

//    Insertion
    public boolean isFull(){
        if(lastUsedIndex == arr.length-1){
            return true;
        }
        else {
            return false;
        }
    }
    public void insert(String value){
        if(!isFull()){
            arr[lastUsedIndex + 1 ] = value;
            lastUsedIndex++;
            System.out.println("the value " + value + " has been inserted");
        }
        else {
            System.out.println("The BT is full");
        }
    }

//    Traversal
    public void preOrder(int index){
        if(index > lastUsedIndex){
            return;
        }
        else {
            System.out.print(arr[index] + " ");
            preOrder(index * 2);
            preOrder(index * 2 + 1);
        }
    }

    public void inOrder(int index){
        if(index > lastUsedIndex){
            return;
        }
        else {
            inOrder(index * 2);
            System.out.print(arr[index] + " ");
            inOrder(index * 2 + 1);
        }
    }

    public void postOrder(int index){
        if(index > lastUsedIndex){
            return;
        }
        else {
            postOrder(index * 2);
            postOrder(index * 2 + 1);
            System.out.print(arr[index] + " ");
        }
    }

    public void levelOrder(){
        for(int i = 1; i<=lastUsedIndex; i++){
            System.out.print(arr[i] + " ");
        }
    }

//    Search
    public int search(String value){
        for(int i = 1; i<= lastUsedIndex; i++){
            if(arr[i] == value){
                System.out.println("the value " + value + " exists at the location " + i);
                return i;
            }
        }
        System.out.println("the value does not exists in the binary tree");
        return -1;
    }

//    Deleting a node
    public void delete(String value){
        int location = search(value);
        if( location == -1){ // search method returns -1 if the value is not in the array
            return;
        }
        else {
            arr[location] = arr[lastUsedIndex];
            lastUsedIndex--;
            System.out.println("the node successfully deleted");
        }
    }

    // Deleting the tree
    public void deleteTree(){
        try {
            arr = null;
            System.out.println("The BT has been successfully deleted");
        }
        catch (Exception e){
            System.out.println("There was an error while deleting the tree");
        }
    }


}
