package _4_Stack._2_usingLinkedLIst;
// imported code from singlyLinkedList
public class linkedList {
    public Node head;
    public Node tail;
    public int size;
    public Node singlyLinkedListCreate(int nodeValue){
        head = new Node(); // initialize head with the type of node
        Node node = new Node(); // instance of the Node class
        node.value = nodeValue;
        node.next = null;
        head = node; //reference head and tail to node
        tail = node;
        size = 1;
        return head;
    }

    //    Insert Method SinglyLinkedList
    public void insertInLinkedList( int nodeValue, int location){
        Node node = new Node();
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
            Node tempNode = head;
            int index = 0;
            while (index < location -1){
                tempNode = tempNode.next;
                index++;
            }
            Node nextNode = tempNode.next;
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
            Node tempNode = head;
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
            Node tempNode = head;
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
            Node tempNode = head;
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
            Node tempNode = head;
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
}
