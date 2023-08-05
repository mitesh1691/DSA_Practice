package _5_Queue.UsingArray.linearQueue;

public class queueArray {
    int[] arr;
    int topOfQueue;
    int beginningOfQueue;

    public queueArray(int size){
        this.arr = new int[size]; // instantiation the array in the memory
        this.beginningOfQueue = -1;
        this.topOfQueue = -1;
        System.out.println("the queue is successfully created with the size of: " + size);
    }

    public boolean isEmpty(){
        if(beginningOfQueue == -1 || beginningOfQueue == arr.length){
            return true;
        }
        else{
            return false;
        }
    }

    public boolean isFull(){
        if(topOfQueue == arr.length-1){
            return true;
        }
        else {
            return false;
        }
    }

    public void enQueue(int value){
        if ((isFull())) {
            System.out.println("The Queue is full");
        }
        if((isEmpty())){
            beginningOfQueue = 0; // initializing beginningOfQueue to 0 (it doesn't change unless an element is removed)
            topOfQueue++;
            arr[topOfQueue] = value;
            System.out.println("Successfully inserted " + value + " in the queue");
        }
        else {
            topOfQueue++;
            arr[topOfQueue] = value;
            System.out.println("Successfully inserted " + value + " in the queue");
        }
    }

    public int deQueue(){
        if((isEmpty())){
            System.out.println("the queue is empty");
            return -1;
        }
        else {
            int result = arr[beginningOfQueue];
            beginningOfQueue++;
            if(beginningOfQueue > topOfQueue){
                beginningOfQueue = topOfQueue = -1;
            }
            return result;
        }
    }

    public int peek(){
        if((isEmpty())){
            System.out.println("the queue is empty");
            return -1;
        }
        else {
            return arr[beginningOfQueue];
        }
    }

    public void deleteQueue(){
        arr = null;
        System.out.println("Queue Deleted!!!!");
    }

    

}
