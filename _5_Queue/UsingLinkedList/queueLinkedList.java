package _5_Queue.UsingLinkedList;

public class queueLinkedList {
    linkedList ll;

    public queueLinkedList(){
        ll = new linkedList(); // creating an instance of linkedlist class
        System.out.println("the Queue is successfully created");
    }

    public boolean isEmpty(){
        if(ll.head == null){
            return true;
        }
        else {
            return false;
        }
    }


    public void enQueue(int value){
        ll.insertInLinkedList(value, ll.size);
        System.out.println("successfully inserted " + value + " in queue");
    }

    public int deQueue(){
        int result = -1;
        if((isEmpty())){
            System.out.println("the queue is empty");
        }
        else {
            result = ll.head.value;
            ll.deletionOfNode(0);
        }
        return result;
    }

    public int peek(){
        if ((isEmpty())){
            System.out.println("the queue is empty");
            return -1;
        }
        else {
            return ll.head.value;
        }
    }

    public void deleteQueue(){
        ll.head = null;
        ll.tail = null;
        System.out.println("Queue is deleted successfully");
    }

}
