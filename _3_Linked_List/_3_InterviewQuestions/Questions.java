package _3_Linked_List._3_InterviewQuestions;

import java.util.HashSet;


// because we are going to use sets to store the values of linked list nodes
public class Questions {

//    Question 1 - Delete duplicates
    void deleteDupes(LinkedList ll){
        HashSet<Integer> hs = new HashSet<>();
        Node current = ll.head;
        Node prev = null;
        while(current != null){
            int curvalue = current.value;
            if (hs.contains(curvalue)) {
                prev.next = current.next;
                ll.size--;
            }
            else {
                hs.add(curvalue);
                prev = current;
            }
            current = current.next;
        }
    }

//    Question 2 - Nth to last
   Node nthToLast(LinkedList ll, int n){
        Node p1 = ll.head;
        Node p2 = ll.head;
        for(int i=0; i<n; i++){
            if(p2 == null){
                return null; // this will break the loop if p2 reaches last element
            }
            p2 = p2.next;
        }
        while(p2!= null){
            p1 = p1.next;
            p2 = p2.next;
        }
        return p1;
    }

//    Question 3 - Partition
    LinkedList partition(LinkedList ll, int x){
        Node currentNode = ll.head;
        ll.tail = ll.head; // creating a new linkedlist for partition of elements
        while(currentNode != null){
            Node next = currentNode.next;
            if(currentNode.value < x){
                currentNode.next = ll.head;
                ll.head = currentNode;
            }
            else{
                ll.tail.next = currentNode;
                ll.tail = currentNode;
            }
            currentNode = next;
        }
        ll.tail.next = null;
        return ll;
    }

    //    Question 4 - Sum List
        LinkedList sumList(LinkedList llA, LinkedList llB){
            Node nA = llA.head;
            Node nB = llB.head;
            int carry = 0;
            LinkedList resultLL = new LinkedList();
            while(nA != null || nB != null){
                int result = carry;
                if(nA != null){
                    result = result + nA.value;
                    nA = nA.next;
                }
                if(nB != null){
                    result = result + nB.value;
                    nB = nB.next;
                }
                resultLL.insertLL(result%10);
                carry = result/10;
            }
            return resultLL;
        }


    //    Question 5 - Intersection
        // 1. finding the kth node ( difference node betweeen 2 lists )
        Node getKthNode(Node head ,int k){
            Node current = head;
            while(current != null && k>0){
                current = current.next;
                k--;
            }
            return current;
        }
        // 2. Intersection method
        Node intersection(LinkedList list1, LinkedList list2){
            if(list1.head == null || list2.head == null) return null;
            if(list1.tail != list2.tail) return null;
            Node shorter = new Node();
            Node longer = new Node();
            if(list1.size > list2.size){
                longer = list1.head;
                shorter = list2.head;
            }
            else{
                longer = list2.head;
                shorter = list1.head;
            }
            longer = getKthNode(longer, Math.abs(list1.size - list2.size));
            while(shorter != longer){
                shorter = shorter.next;
                longer = longer.next;
            }
            return longer;
        }
        // 3. add same node to two linked list ( to make the linked lists intersect, used while calling the method)\
        void addSameNode(LinkedList llA, LinkedList llB, int nodeValue){
            Node newNode = new Node();
            newNode.value = nodeValue;
            llA.tail.next = newNode;
            llA.tail = newNode;
            newNode.next = null;
            llB.tail.next = newNode;
            llB.tail = newNode;
            newNode.next = null;
        }


}
