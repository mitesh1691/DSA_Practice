package _11_Binary_Heap;

public class binaryHeap {
    int arr[];
    int sizeOfTree;

//    create Binary Heap:
    public binaryHeap(int size){
        arr = new int[size + 1];
        this.sizeOfTree = 0;
        System.out.println("Binary Heap has been created successfully!");
    }

//    Peek method:
    public boolean isEmpty(){
        if(sizeOfTree == 0){
            return true;
        }
        else{
            return false;
        }
    }

    public Integer peek(){
        if((isEmpty())){
            System.out.println("Binary Heap is Empty");
            return null;
        }
        return arr[1];
    }

//    Size of Heap:
    public int sizeOfHeap(){
        return sizeOfTree;
    }

//    Traversal
//    levelOrder Traversal:
    public void levelOrder(){
        for(int i = 1; i <= sizeOfTree; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

//    Insertion
//    Helper method : Heapify botton to top method
    public void heapifyBottomToTop(int index, String heapType){
        int parent = index / 2;
        if( index <= 1){
            return;
        }
        if(heapType == "Min"){
            if(arr[index] < arr[parent]) {
                int temp = arr[index];
                arr[index] = arr[parent];
                arr[parent] = temp;
            }
        }
        else if (heapType == "Max") {
            if(arr[index] > arr[parent]) {
                int temp = arr[index];
                arr[index] = arr[parent];
                arr[parent] = temp;
            }
        }
        heapifyBottomToTop(parent, heapType);
    }

    public void insert(int value, String heapType){
        arr[sizeOfTree + 1 ] = value;
        sizeOfTree++;
        heapifyBottomToTop(sizeOfTree, heapType);
        System.out.println("Inserted " + value +  " successfully in Heap");
    }

//    Extract a node
    //    Helper method : Heapify top to bottom method
    public void heapifyTopToBottom(int index, String heapType){
        int leftChild = index * 2;
        int rightChild = index * 2 + 1;
        int swapChild = 0;
        if(sizeOfTree < leftChild){
            return;
        }
        if(heapType == "Max"){
            if(sizeOfTree == leftChild){
                if(arr[index] < arr[leftChild]) {
                    int temp = arr[index];
                    arr[index] = arr[leftChild];
                    arr[leftChild] = temp;
                }
                return;
            }
            else {
                if(arr[leftChild] > arr[rightChild]){
                    swapChild = leftChild;
                }
                else {
                    swapChild = rightChild;
                }
                if(arr[index] < arr[swapChild]){
                    int temp = arr[index];
                    arr[index] = arr[swapChild];
                    arr[swapChild] = temp;
                }
            }
        }
        else if(heapType == "Min"){
            if(sizeOfTree == leftChild){
                if(arr[index] > arr[leftChild]) {
                    int temp = arr[index];
                    arr[index] = arr[leftChild];
                    arr[leftChild] = temp;
                }
                return;
            }
            else {
                if(arr[leftChild] < arr[rightChild]){
                    swapChild = leftChild;
                }
                else {
                    swapChild = rightChild;
                }
                if(arr[index] > arr[swapChild]){
                    int temp = arr[index];
                    arr[index] = arr[swapChild];
                    arr[swapChild] = temp;
                }
            }
        }
        heapifyTopToBottom(swapChild, heapType);
    }

    public int extractHeadOfBH(String heapType){
        if((isEmpty())){
            return -1;
        }
        else {
            int extractValue = arr[1];
            arr[1] = arr[sizeOfTree];
            sizeOfTree--;
            heapifyTopToBottom(1, heapType);
            return extractValue;
        }
    }


//    Delete binary heap
    public void deleteBH(){
        arr = null;
        System.out.println("Binary Heap has been deleted");
    }


}
