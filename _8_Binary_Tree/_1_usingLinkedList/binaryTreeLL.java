package _8_Binary_Tree._1_usingLinkedList;

import java.util.LinkedList;
import java.util.Queue;

public class binaryTreeLL {
    binaryNode root;

    public binaryTreeLL(){
        this.root = null; //set root node to null.
    }

//    PreOrder Traversal
    void preOrder(binaryNode node){
        if(node == null){
            return;
        }
        System.out.print(node.value + " ");
        preOrder(node.leftChild);
        preOrder(node.rightChild);
    }

//    InOrder Traversal
    void inOrder(binaryNode node){
        if(node == null){
            return;
        }
        inOrder(node.leftChild);
        System.out.print(node.value + " ");
        inOrder(node.rightChild);
    }

//    PostOrder Traversal
    void postOrder(binaryNode node){
        if(node == null){
            return;
        }
        postOrder(node.leftChild);
        postOrder(node.rightChild);
        System.out.print(node.value + " ");
    }

//    LevelOrder Traversal
    void levelOrder(){
        Queue<binaryNode> queue = new LinkedList<binaryNode>(); // creating a queue using linked list class, Linkedlist will act as a queue and Queue class is the interface
        queue.add(root);
        while (!queue.isEmpty()){
            binaryNode presentNode = queue.remove(); // removing 1st node from queue and storing it as presentNode
            System.out.print(presentNode.value + " "); // printing removed node
            if(presentNode.leftChild != null){
                queue.add(presentNode.leftChild);
            }
            if(presentNode.rightChild != null){
                queue.add(presentNode.rightChild);
            }
//            // now the loop will start again and remove 1st element and then print it, then add its left right child to queue
        }
        System.out.println("");
    }

//    Search - using levelOrder Traversal
    public void search(String value){
        Queue<binaryNode> queue = new LinkedList<binaryNode>();
        queue.add(root);
        while(!queue.isEmpty()){
            binaryNode presentNode = queue.remove();
            if(presentNode.value == value){
                System.out.println("The value " + value + " is found in the tree");
                return;
            }
            else {
                if(presentNode.leftChild != null){
                    queue.add(presentNode.leftChild);
                }
                if(presentNode.rightChild != null){
                    queue.add(presentNode.rightChild);
                }
            }
        }
        System.out.println("The value " + value + " is not found in the tree");
    }

//    Insertion
    public void insert(String value){
        binaryNode newNode = new binaryNode();
        newNode.value = value;
        if(root == null){
            root = newNode;
            System.out.println("Inserted new node at Root");
            return;
        }
        Queue<binaryNode> queue = new LinkedList<binaryNode>();
        queue.add(root);
        while(!queue.isEmpty()){
            binaryNode presentNode = queue.remove();
            if(presentNode.leftChild == null){
                presentNode.leftChild = newNode;
                System.out.println("Successfully inserted");
                break;
            } else if (presentNode.rightChild == null) {
                presentNode.rightChild = newNode;
                System.out.println("successfully inserted");
                break;
            }
            else {
                queue.add(presentNode.leftChild);
                queue.add(presentNode.rightChild);
            }
        }
    }

// deletion of a node - we will need 3 methods - getDeepestNode, deleteDeepestNode, deleteNode
    public binaryNode getDeepestNode(){
        Queue<binaryNode> queue = new LinkedList<binaryNode>();
        queue.add(root);
        binaryNode presentNode = null;
        while(!queue.isEmpty()){
            presentNode = queue.remove();
            if(presentNode.leftChild != null){
                queue.add(presentNode.leftChild);
            }
            if(presentNode.rightChild != null){
                queue.add(presentNode.rightChild);
            }
        }
        return presentNode;
    }
    public void deleteDeepestNode(){
        Queue<binaryNode> queue = new LinkedList<binaryNode>();
        queue.add(root);
        binaryNode previousNode, presentNode = null;
        while (!queue.isEmpty()){
            previousNode = presentNode;
            presentNode = queue.remove();
            if(presentNode.leftChild == null){
                previousNode.rightChild = null;
                return;
            }
            else if(presentNode.rightChild == null){
                presentNode.leftChild = null;
                return;
            }
            queue.add(presentNode.leftChild);
            queue.add(presentNode.rightChild);
        }
    }
    public void deleteNode(String value){
        Queue<binaryNode> queue = new LinkedList<binaryNode>();
        queue.add(root);
        while (!queue.isEmpty()){
            binaryNode presentNode = queue.remove();
            if(presentNode.value == value){
                presentNode.value = getDeepestNode().value;
                deleteDeepestNode();
                System.out.println("The node is deleted");
                return;
            }
            else {
                if(presentNode.leftChild != null) {
                    queue.add(presentNode.leftChild);
                }
                if(presentNode.rightChild != null) {
                    queue.add(presentNode.rightChild);
                }
            }
        }
        System.out.println("the node does not exist in this BT");
    }

//    delete entire binary tree
    public void deleteBT(){
        root = null;
        System.out.println("successfully deleted BT");
    }
}
