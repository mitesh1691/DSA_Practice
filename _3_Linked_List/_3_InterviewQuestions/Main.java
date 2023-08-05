package _3_Linked_List._3_InterviewQuestions;

class Main {
    public static void main(String[] args) {
//        LinkedList ll = new LinkedList();
//        ll.createLL(1);
//        ll.insertLL(2);
//        ll.insertLL(3);
//        ll.insertLL(4);
//        ll.insertLL(1);
//        ll.insertLL(5);
//        ll.insertLL(6);
//        ll.insertLL(7);
//        ll.traverseLL();
//
//        Questions q = new Questions();
//        q.deleteDupes(ll);
//        ll.traverseLL();
//
//        Node n = q.nthToLast(ll, 3);
//        System.out.println(n.value);
//
//        LinkedList p = q.partition(ll, 5);
//        p.traverseLL();
//        System.out.println(p.tail.next);

//        LinkedList llA = new LinkedList();
//        llA.insertLL(5);
//        llA.insertLL(8);
//        llA.insertLL(3);
//        LinkedList llB = new LinkedList();
//        llB.insertLL(6);
//        llB.insertLL(3);
//        llB.insertLL(4);
//
//        Questions sumLL = new Questions();
//        LinkedList res = sumLL.sumList(llA,llB);
//        res.traverseLL();


        LinkedList llA = new LinkedList();
        llA.insertLL(5);
        llA.insertLL(8);
        llA.insertLL(3);
        llA.insertLL(9);
        LinkedList llB = new LinkedList();
        llB.insertLL(6);
        llB.insertLL(3);
        llB.insertLL(4);
        Questions q = new Questions();
        q.addSameNode(llA, llB, 7);
        q.addSameNode(llA, llB, 2);
        q.addSameNode(llA, llB, 3);
        llA.traverseLL();
        llB.traverseLL();
        Node intersec = q.intersection(llA, llB);
        System.out.println(intersec.value);



    }
}
