package _5_Queue.UsingArray.linearQueue;

public class Main {
    public static void main(String[] args) {
        queueArray newQueue = new queueArray(5);

        boolean result = newQueue.isFull();
        System.out.println(result);

        boolean result1 = newQueue.isEmpty();
        System.out.println(result1);

        newQueue.enQueue(2);
        newQueue.enQueue(3);
        newQueue.enQueue(4);
        newQueue.enQueue(5);
        newQueue.enQueue(6);
//        newQueue.enQueue(7); // returns error that the queue is full as the size of array is 5

        int result2 = newQueue.deQueue();
        System.out.println(result2); // 2
        int result3 = newQueue.deQueue();
        System.out.println(result3); // 3

        int result4 = newQueue.peek();
        System.out.println(result4);  // 4
        int result5 = newQueue.peek();
        System.out.println(result5); // 4

        newQueue.deleteQueue();
    }
}
