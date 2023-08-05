package _5_Queue.UsingArray.circularQueue;

public class circularQueue {
    int[] arr;
    int topOfQueue;
    int beginningOfQueue;
    int size; // useful in enQueue and deQueue methods

    public circularQueue(int size){
        this.arr = new int[size]; // instantiating array with the fixed size
        this.size = size; // updating size with the size we are receiving from the size parameter
        this.topOfQueue = -1;
        this.beginningOfQueue = -1;
        System.out.println("The Circular Queue is successfully created with the size of " + size);
    }

    public boolean isEmpty(){
        if(topOfQueue == -1){
            return true;
        }
        else{
            return false;
        }
    }

    public boolean isFull(){
        if(topOfQueue+1 == beginningOfQueue){
            return true;
        } else if (topOfQueue+1 == size && beginningOfQueue == 0) {
            return true;
        }
        else {
            return false;
        }
    }

    public void enQueue(int value){
        if((isFull())){
            System.out.println("the Queue is full");
        }
        else if((isEmpty())){
            beginningOfQueue = 0;
            topOfQueue++;
            arr[topOfQueue] = value;
            System.out.println("Successfully inserted " + value + " in the queue");
        }
        else {
            if(topOfQueue+1 == size){
                topOfQueue = 0;
            }
            else {
                topOfQueue++;
            }
            arr[topOfQueue] = value;
            System.out.println("Successfully inserted " + value + " in the queue");
        }
    }

    public int deQueue(){
        if((isEmpty())){
            System.out.println("The queue is empty");
            return -1;
        }
        else {
            int result = arr[beginningOfQueue];
            arr[beginningOfQueue] = 0;
            if(beginningOfQueue == topOfQueue){
                beginningOfQueue = topOfQueue = -1;
            } else if (beginningOfQueue + 1 == size) {
                beginningOfQueue = 0;
            }
            else {
                beginningOfQueue++;
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
        System.out.println("queue successfully deleted");
    }



}
