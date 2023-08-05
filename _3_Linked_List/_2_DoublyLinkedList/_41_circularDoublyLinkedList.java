package _3_Linked_List._2_DoublyLinkedList;

public class _41_circularDoublyLinkedList {
    public _39_doublyNode head;
    public _39_doublyNode tail;
    public int size;

//    create CDLL
    public _39_doublyNode createCDLL(int nodeValue){
        head = new _39_doublyNode();
        _39_doublyNode newNode = new _39_doublyNode();
        newNode.value = nodeValue;
        head = newNode;
        tail = newNode;
        newNode.prev = newNode;
        newNode.next = newNode;
        size = 1;
        return head;
    }

//    Insert CDLL
    public void insertCDLL(int nodeValue, int location){
        _39_doublyNode newNode = new _39_doublyNode();
        newNode.value = nodeValue;
        if(head == null){
            createCDLL(nodeValue);
            return;
        } else if (location == 0) {
            newNode.next = head;
            newNode.prev = tail;
            head.prev = newNode;
            tail.next = newNode;
            head = newNode;
        } else if (location >= size) {
            newNode.next = head;
            newNode.prev = tail;
            head.prev = newNode;
            tail.next = newNode;
            tail = newNode;
        }
        else {
            _39_doublyNode tempNode = head;
            int index = 0;
            while (index < location - 1){
                tempNode = tempNode.next;
                index++;
            }
            newNode.prev = tempNode;
            newNode.next = tempNode.next;
            tempNode.next = newNode;
            newNode.next.prev = newNode;
        }
        size++;
    }

//    Traverse CDLL
    public void traverseCDLL(){
        if(head != null){
            _39_doublyNode tempNode = head;
            for (int i =0; i<size; i++){
                System.out.print(tempNode.value);
                if( i != size -1){
                    System.out.print(" --> ");
                }
                tempNode = tempNode.next;
            }
        }
        else {
            System.out.println("the CDLL does not exists");
        }
        System.out.println("");
    }

//    Reverse traversal CDLL
    public void reverseTraversalCDLL(){
        if(head != null){
            _39_doublyNode tempNode = tail;
            for (int i = 0; i<size; i++){
                System.out.print(tempNode.value);
                if(i != size -1){
                    System.out.print(" <-- ");
                }
                tempNode = tempNode.prev;
            }
        }
        else {
            System.out.println("the CDLL does not exists!!");
        }
        System.out.println("");
    }

//    Searching a node CDLL
    public boolean searchCDLL(int nodeValue){
        if(head!= null){
            _39_doublyNode tempNode = head;
            for (int i=0; i<size; i++){
                if(tempNode.value == nodeValue){
                    System.out.println("the node is found at location:" + i);
                    return true;
                }
                tempNode = tempNode.next;
            }
        }
        System.out.println("Node not found!");
        return false;
    }

//    delete a node CDLL
    public void deleteNodeCDLL(int location){
        if(head == null){
            System.out.println("the CDLL does not exists!!");
            return;
        } else if (location == 0) {
            if(size == 1){
                head.prev = null;
                head.next = null;
                head = null;
                tail = null;
                size--;
                return;
            }
            else{
                head = head.next;
                head.prev = tail;
                tail.next = head;
                size--;
            }
        } else if (location >= size -1) {
            if(size == 1){
                head.prev = null;
                head.next = null;
                head = null;
                tail = null;
                size--;
                return;
            }
            else {
                tail = tail.prev;
                tail.next = head;
                head.prev = tail;
                size--;
            }
        }
        else {
            _39_doublyNode tempNode = head;
            for(int i = 0; i< location - 1; i++){
                tempNode = tempNode.next;
            }
            tempNode.next = tempNode.next.next;
            tempNode.next.prev = tempNode;
            size--;
        }
    }

//    delete entire CDLL
    public void deleteCDLL(){
       _39_doublyNode tempNode = head;
       for(int i = 0; i<size; i++){
           tempNode.prev = null;
           tempNode = tempNode.next;
       }
       tail.next = null;
       head = null;
       tail = null;
       System.out.println("the CDLL has been deleted");
    }


    public static void main(String[] args) {
        _41_circularDoublyLinkedList cdll = new _41_circularDoublyLinkedList();
        cdll.createCDLL(5);
        System.out.println(cdll.head.value);

        cdll.insertCDLL(6,1);
        cdll.insertCDLL(7,2);
        cdll.insertCDLL(8,3);
        System.out.println(cdll.head.value);
        System.out.println(cdll.head.next.value);
        System.out.println(cdll.head.next.next.value);
        System.out.println(cdll.head.next.next.next.value);

        cdll.traverseCDLL();

        cdll.reverseTraversalCDLL();

        cdll.searchCDLL(7);
        cdll.searchCDLL(8);
        cdll.searchCDLL(6);
        cdll.searchCDLL(5);
        cdll.searchCDLL(9);

        cdll.deleteCDLL();
        cdll.traverseCDLL();
    }
}
