package _4_Stack._2_usingLinkedLIst;

public class stack {
    linkedList ll; // Declare linked list using linkedList class
    // constructor
    public stack(){
        // instantiate linked list inside the constructor - it means that we are creating stack
        ll = new linkedList();
    }

//    Push method:
    public void push(int value){
        ll.insertInLinkedList(value, 0);
        System.out.println("Inserted " + value + " in stack");
    }

//    isEmpty:
    public boolean isEmpty(){
        if(ll.head == null){
            return true;
        }
        else {
            return false;
        }
    }

//    POP:
    public int pop(){
        int result = -1;
        if((isEmpty())){
            System.out.println("the stack is empty");
        }
        else {
            result = ll.head.value;
            ll.deletionOfNode(0);
        }
        return result;
    }

//     Peek:
    public int peek(){
        if((isEmpty())){
            System.out.println("the stack is empty");
            return -1;
        }
        else {
            return ll.head.value;
        }
    }

//    delete:
    public void deleteStack(){
        ll.head = null;
        System.out.println("stack is deleted");
    }
}
