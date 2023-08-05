package _3_Linked_List._2_DoublyLinkedList;

public class _40_doublyLinkedList {
    public _39_doublyNode head;
    public _39_doublyNode tail;
    public int size;

    // creating doubly linked list
    public _39_doublyNode createDLL(int nodeValue){
        head = new _39_doublyNode(); // initializing the head
        _39_doublyNode newNode = new _39_doublyNode(); // creating newNode
        newNode.value = nodeValue;
        newNode.next = null;
        newNode.prev = null;
        head = newNode;
        tail = newNode;
        size =1;
        return head;
    }

//    Insertion in doubly linked list
    public void insertDLL(int nodeValue, int location){
        _39_doublyNode newNode = new _39_doublyNode();
        newNode.value = nodeValue;
        if(head == null){
            createDLL(nodeValue);
            return;
        } else if (location == 0) {
            newNode.prev = null;
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        } else if (location >= size) {
            newNode.next = null;
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        else{
            _39_doublyNode tempNode = head;
            int index = 0;
            while (index < location -1){
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

//    Insertion in Doubly Linked List:
    public void traverseDLL(){
        if(head != null){
            _39_doublyNode tempNode = head;
            for ( int i = 0; i<size; i++){
                System.out.print(tempNode.value);
                if(i!= size -1){
                    System.out.print(" --> ");
                }
                tempNode = tempNode.next;
            }
        }
        else {
            System.out.println("linked list does not exists!!");
        }
        System.out.println("");
    }

//    Reverse - Traversal of Doubly Linked List:
    public void reversetraverseDLL(){
        if(head != null) {
            _39_doublyNode tempNode = tail;
            for (int i = 0; i < size; i++) {
                System.out.print(tempNode.value);
                if (i != size - 1) {
                    System.out.print(" <-- ");
                }
                tempNode = tempNode.prev;
            }
        }
        else{
            System.out.println("DLL does not exists!!");
        }
        System.out.println("");
    }

//    Searching for a Node in Doubly Linked List:
    public boolean searchDLL(int nodeValue){
        if(head != null){
            _39_doublyNode tempNode = head;
            for(int i =0; i<size; i++){
                if(tempNode.value == nodeValue){
                    System.out.println("The node is found at location: " + i);
                    return true;
                }
                tempNode = tempNode.next;
            }
        }
        System.out.println("Node Not Found!!");
        return false;
    }

//    Deletion of a Node from Doubly Linked List:
    public void deleteNodeDll(int location){
        if(head == null){
            System.out.println("The DLL does not Exists!!");
            return;
        } else if (location == 0) {
            if(size == 1){
                head = null;
                tail = null;
                size--;
                return;
            }
            else{
                head = head.next;
                head.prev = null;
                size--;
            }
        } else if (location >= size-1) {
            _39_doublyNode tempNode = tail.prev;
            if(size == 1){
                head = null;
                tail = null;
                size--;
                return;
            }
            else{
                tempNode.next = null;
                tail = tempNode;
                size--;
                return;
            }
        }
        else {
            _39_doublyNode tempNode = head;
            for(int i = 0; i<location - 1; i++){
                tempNode = tempNode.next;
            }
            tempNode.next = tempNode.next.next;
            tempNode.next.prev = tempNode;
            size--;
        }
    }

//    Delete entire DLL
    public void deleteDLL(){
        _39_doublyNode tempNode = head;
        for ( int i =0; i<size; i++){
            tempNode.prev = null;
            tempNode = tempNode.next;
        }
        head = tail = null;
        System.out.println("The DLL has been deleted Successfully");
    }


    public static void main(String[] args) {
        _40_doublyLinkedList dll = new _40_doublyLinkedList();

        dll.createDLL(5);
        System.out.println(dll.head.value);

        dll.insertDLL(6,0);
        dll.insertDLL(7,1);
        dll.insertDLL(8,2);
        System.out.println(dll.head.value);
        System.out.println(dll.head.next.value);
        System.out.println(dll.head.next.next.value);
        System.out.println(dll.head.next.next.next.value);

        dll.insertDLL(9,3);
        dll.insertDLL(10,4);
        dll.insertDLL(11,5);
        dll.insertDLL(12,6);
        dll.traverseDLL();

        dll.reversetraverseDLL();

        dll.searchDLL(10);
        dll.searchDLL(5);
        dll.searchDLL(20);
        dll.traverseDLL();
        dll.deleteNodeDll(0);
        dll.traverseDLL();
        dll.deleteNodeDll(15);
        dll.traverseDLL();

        dll.deleteDLL();
        dll.traverseDLL();



    }
}
