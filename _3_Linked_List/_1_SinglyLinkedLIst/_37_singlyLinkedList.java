package _3_Linked_List._1_SinglyLinkedLIst;

public class _37_singlyLinkedList {
    public _37_1_node head;
    public _37_1_node tail;
    public int size;
    public _37_1_node singlyLinkedListCreate(int nodeValue){
        head = new _37_1_node(); // initialize head with the type of node
        _37_1_node node = new _37_1_node(); // instance of the _37_1_node class
        node.value = nodeValue;
        node.next = null;
        head = node; //reference head and tail to node
        tail = node;
        size = 1;
        return head;
    }

//    Insert Method SinglyLinkedList
    public void insertInLinkedList( int nodeValue, int location){
        _37_1_node node = new _37_1_node();
        node.value = nodeValue;

        if(head == null){
//            node.next = null;
//            head = node;
//            tail = null;
            singlyLinkedListCreate(nodeValue);
            return;
        }
        else if(location == 0){
            node.next = head;
            head = node;
        } else if (location >= size) {
            node.next = null;
            tail.next = node;
            tail = node;
        }
        else{
            _37_1_node tempNode = head;
            int index = 0;
            while (index < location -1){
                tempNode = tempNode.next;
                index++;
            }
            _37_1_node nextNode = tempNode.next;
            tempNode.next = node;
            node.next = nextNode;
        }
        size++;
    }

//    Traversal SinglyLinkedList
    public void traverseSinglyLinkedList(){
        if (head == null){
            System.out.println("singly linked list does not exist");
        }
        else {
            _37_1_node tempNode = head;
            for (int i = 0; i<size; i++){
                System.out.print(tempNode.value);
                if (i != size - 1 ){
                    System.out.print( " ---> " );
                }
                tempNode = tempNode.next;
            }
            System.out.println("\n");
        }
    }

//    Search Singly Linked List
    public boolean searchSinglyLinkedList(int nodeValue){
        if ( head != null){
            _37_1_node tempNode = head;
            for ( int i = 0; i < size; i++){
                if(tempNode.value == nodeValue){
                    System.out.println("The node is found at location: " + i) ;
                    return true;
                }
                tempNode = tempNode.next;
            }
        }
        System.out.println("node not found");
        return false;
    }

//    Deleting a Node From singlylinkedlist
    public void deletionOfNode(int location){
        if (head == null){
            System.out.println("singly linked list does not exit");
            return;
        }
        else if(location == 0){
            head = head.next;
            size--;
            if(size == 0){
                tail = null;
            }
        }
        else if(location >= size){
            _37_1_node tempNode = head;
            for(int i = 0; i< size -1; i++){
                tempNode = tempNode.next;
            }
            if ( tempNode == head){
                head = tail = null;
                size --;
                return;
            }
            tempNode.next = null;
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

    // Delete Entire SinglyLinkedList
    public void deleteSLL(){
        head = null;
        tail = null;
        System.out.println("Singly linked list is deleted successfully");
    }


    public static void main(String[] args) {
        _37_singlyLinkedList sll = new _37_singlyLinkedList();
        sll.singlyLinkedListCreate(5);
        System.out.println(sll.head.value);

//        sll.insertInLinkedList(6, 0);
        sll.insertInLinkedList(6, 1);
        sll.insertInLinkedList(7, 2);
        sll.insertInLinkedList(8, 3);
        sll.insertInLinkedList(9, 4);
        sll.insertInLinkedList(10, 5);
        sll.insertInLinkedList(99, 2);
//        System.out.println(sll.head.value);
//        System.out.println(sll.head.next.value);
//        System.out.println(sll.head.next.next.value);

        sll.traverseSinglyLinkedList();
        sll.searchSinglyLinkedList(10);

        sll.deletionOfNode(2);
        sll.traverseSinglyLinkedList();

        sll.deleteSLL();
        sll.traverseSinglyLinkedList();
    }
}
