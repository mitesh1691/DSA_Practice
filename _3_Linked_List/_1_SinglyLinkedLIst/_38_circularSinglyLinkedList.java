package _3_Linked_List._1_SinglyLinkedLIst;

public class _38_circularSinglyLinkedList {
    public _37_1_node head;
    public _37_1_node tail;
    public int size;
    // Creating Circular Singly Linked List
    public _37_1_node createCSLL(int nodeValue){
        head = new _37_1_node();
        _37_1_node node = new _37_1_node();
        node.value = nodeValue;
        node.next = node;
        head = node;
        tail = node;
        size = 1;
        return head;
    }

    // Insertion in Circular Singly Linked List
    public void insertCSLL(int nodeValue, int location){
        _37_1_node node = new _37_1_node();
        node.value = nodeValue;
        if(head == null){
            createCSLL(nodeValue);
        } else if (location == 0) {
            node.next = head;
            head = node;
            tail.next = head;
        } else if (location >= size) {
            tail.next = node;
            tail = node;
            tail.next = head;
        }
        else {
            _37_1_node tempNode = head;
            int index = 0;
            while (index < location -1 ){
                tempNode = tempNode.next;
                index++;
            }
            node.next = tempNode.next;
            tempNode.next = node;
        }
        size++;
    }

//    Traversal of Circular Singly Linked List:
    public void traverseCSLL(){
        if ( head != null){
            _37_1_node tempNode = head;
            for ( int i = 0; i < size; i++){
                System.out.print(tempNode.value);
                if( i != size - 1){
                    System.out.print(" ---> ");
                }
                tempNode = tempNode.next;
            }
            System.out.println("");
        }
        else {
            System.out.println("linked list does not exists!!");
        }
    }
//    Searching a node in Circular Singly Linked List:
    public boolean searchCSLL(int nodeValue){
        if (head != null){
            _37_1_node tempNode = head;
            for(int i = 0; i<size; i++){
                if(tempNode.value == nodeValue){
                    System.out.println("The node is found at index: " + i);
                    return true;
                }
                tempNode = tempNode.next;
            }
        }
        System.out.println("Node not found!!");
        return false;
    }

//    Deletion of a node from Circular Singly Linked List:
    public void deleteCSLL(int location){
        if(head == null){
            System.out.println("The linked list does not exists!!");
            return;
        } else if (location == 0) {
            head = head.next;
            tail = head;
            size--;
            if(size == 0){
                tail = null;
                head.next = null;
                head = null;
            }
        }
        else if (location >= size-1){
            _37_1_node tempNode = head;
            for(int i = 0; i<size-1; i++){
                tempNode = tempNode.next;
            }
            if(tempNode == head){
                head.next = null;
                tail = head = null;
                size--;
                return;
            }
            tempNode.next = head;
            tail = tempNode;
            size--;
        }
        else{
            _37_1_node tempNode = head;
            for(int i = 0; i<location-1; i++){
                tempNode = tempNode.next;
            }
            tempNode.next = tempNode.next.next;
            size--;
        }
    }

//    Delete entire CSLL
    public void deleteCSLL(){
        if(head ==null){
            System.out.println("Linked list does not exists!!");
        }
        else{
            head = null;
            tail.next = null;
            tail = null;
            System.out.println("The CSLL has been deleted successfully");
        }
    }




    public static void main(String[] args) {
        _38_circularSinglyLinkedList csll = new _38_circularSinglyLinkedList();

        csll.createCSLL(5);
        System.out.println(csll.head.value);
        System.out.println(csll.head.next.value);

        csll.insertCSLL(6, 0);
        csll.insertCSLL(7, 1);
        csll.insertCSLL(8, 2);
        System.out.println(csll.head.value);
        System.out.println(csll.head.next.value);
        System.out.println(csll.head.next.next.value);
        System.out.println(csll.head.next.next.next.value);

        csll.insertCSLL(9, 3);
        csll.insertCSLL(10, 4);
        csll.insertCSLL(11, 5);
        csll.traverseCSLL();

        csll.searchCSLL(5);
        csll.searchCSLL(10);
        csll.searchCSLL(15);

        csll.deleteCSLL(0);
        csll.deleteCSLL(3);
        csll.deleteCSLL(10);
        csll.traverseCSLL();

//        csll.deleteCSLL();
        csll.traverseCSLL();
        csll.deleteCSLL(3);
        csll.traverseCSLL();
        System.out.println(csll.size);
        System.out.println(csll.tail.value);
        System.out.println(csll.head.value);
    }
}
