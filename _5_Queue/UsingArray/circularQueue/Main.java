package _5_Queue.UsingArray.circularQueue;

public class Main {
    public static void main(String[] args) {
        circularQueue newCQ = new circularQueue(3);

        boolean result = newCQ.isEmpty();
        System.out.println(result);

        boolean result1 = newCQ.isFull();
        System.out.println(result1);

        newCQ.enQueue(2);
        newCQ.enQueue(3);
        newCQ.enQueue(4);
//        newCQ.enQueue(5); // returns error that the Queue is full because the size is 3

        int result2 = newCQ.deQueue();
        System.out.println(result2);
        int result3 = newCQ.deQueue();
        System.out.println(result3);

        int result4 = newCQ.peek();
        System.out.println(result4);
        int result5 = newCQ.peek();
        System.out.println(result5);

        newCQ.deleteQueue();
    }
}
