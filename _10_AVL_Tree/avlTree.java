package _10_AVL_Tree;

import java.util.LinkedList;
import java.util.Queue;

public class avlTree {
    public binaryNode root;

    // Constructor - Creation of avl tree
    public avlTree(){
        root = null;
        System.out.println("AVL Tree Created!!");
    }

//    Traversal
    public void preOrder(binaryNode node){
        if (node == null){
            return;
        }
        System.out.print(node.value + " ");
        preOrder(node.leftChild);
        preOrder(node.rightChild);
    }

    public void inOrder(binaryNode node){
        if(node == null){
            return;
        }
        inOrder(node.leftChild);
        System.out.print(node.value + " ");
        inOrder(node.rightChild);
    }

    public void postOrder(binaryNode node){
        if(node == null){
            return;
        }
        postOrder(node.leftChild);
        postOrder(node.rightChild);
        System.out.println(node.value + " ");
    }

    public void levelOrder(){
        Queue<binaryNode> queue = new LinkedList<binaryNode>();
        queue.add(root);
        while(!queue.isEmpty()){
            binaryNode presentNode = queue.remove();
            System.out.print(presentNode.value + " ");
            if(presentNode.leftChild != null){
                queue.add(presentNode.leftChild);
            }
            if(presentNode.rightChild != null){
                queue.add(presentNode.rightChild);
            }
        }
    }

//    search method
    public binaryNode search(binaryNode node, int value){
        if(node == null){
            System.out.println("The value " + value + " not found in the AVL tree");
            return null;
        }
        else if(node.value == value){
            System.out.println("The value " + value + " is found in the AVL tree");
            return node;
        } else if (value < node.value) {
            return search(node.leftChild, value);
        }else {
            return search(node.rightChild, value);
        }
    }

//    Insertion method

//    helper functions - 1: getHeight
    public int getHeight(binaryNode node){
        if(node == null){
            return 0;
        }
        return node.height;
    }
//    helper functions - 2: rotateRight
    private binaryNode rotateRight(binaryNode unbalancedNode){
        binaryNode newRoot = unbalancedNode.leftChild;
        unbalancedNode.leftChild = unbalancedNode.leftChild.rightChild;
        newRoot.rightChild = unbalancedNode;
        unbalancedNode.height = 1 + Math.max(getHeight(unbalancedNode.leftChild), getHeight(unbalancedNode.rightChild));
        newRoot.height = 1 + Math.max(getHeight(newRoot.leftChild), getHeight(newRoot.rightChild));
        return newRoot;
    }
//    helper functions - 3: rotateLeft
    private binaryNode rotateLeft(binaryNode unbalancedNode){
        binaryNode newRoot = unbalancedNode.rightChild;
        unbalancedNode.rightChild = unbalancedNode.rightChild.leftChild;
        newRoot.leftChild = unbalancedNode;
        unbalancedNode.height = 1 + Math.max(getHeight(unbalancedNode.leftChild), getHeight(unbalancedNode.rightChild));
        newRoot.height = 1 + Math.max(getHeight(newRoot.leftChild), getHeight(newRoot.rightChild));
        return newRoot;
    }
//    helper functions - 4: getBalanceFactor --> (left height - right height)
    private int getBalanceFactor(binaryNode node){
        if(node == null){
            return 0;
        }
        return getHeight(node.leftChild) - getHeight(node.rightChild);
    }
//    InsertNode method
    private binaryNode insertNode(binaryNode node, int nodeValue){
        if(node == null){
            binaryNode newNode = new binaryNode();
            newNode.value = nodeValue;
            newNode.height = 1;
            return newNode;
        }
        else if (nodeValue < node.value){
            node.leftChild = insertNode(node.leftChild, nodeValue);
        }
        else {
            node.rightChild = insertNode(node.rightChild, nodeValue);
        }

        node.height = 1 + Math.max(getHeight(node.leftChild), getHeight(node.rightChild));
        int balanceFactor = getBalanceFactor(node);

        if(balanceFactor > 1 && nodeValue < node.leftChild.value){
            return rotateRight(node);
        }
        if(balanceFactor > 1 && nodeValue > node.leftChild.value) {
            node.leftChild = rotateLeft(node.leftChild);
            return rotateRight(node);
        }
        if(balanceFactor < -1 && nodeValue > node.rightChild.value){
            return rotateLeft(node);
        }
        if(balanceFactor < -1 && nodeValue < node.rightChild.value) {
            node.rightChild = rotateRight(node.rightChild);
            return rotateLeft(node);
        }
        return node;
    }
    public void insert(int value){
        root = insertNode(root, value);
    }



    //    Deletion method
//    helper method - minimumNode
    public static binaryNode minimumNode(binaryNode root) {
        if (root.leftChild == null) {
            return root;
        } else {
            return minimumNode(root.leftChild);
        }
    }

    //    delete node
    public binaryNode deleteNode(binaryNode node, int value){
        if(node == null){
            System.out.println("value not found in the AVL tree");
            return node;
        }
        if(value < node.value){
            node.leftChild = deleteNode(node.leftChild, value);
        }
        else if(value > node.value){
            node.rightChild = deleteNode(node.rightChild, value);
        }
        else {
            if (node.leftChild != null && node.rightChild != null) {
                binaryNode temp = node;
                binaryNode minimumNodeForRight = minimumNode(temp.rightChild);
                node.value = minimumNodeForRight.value;
                node.rightChild = deleteNode(node.rightChild, minimumNodeForRight.value);
            } else if (node.leftChild != null) {
                node = node.leftChild;
            } else if (node.rightChild != null) {
                node = node.rightChild;
            } else {
                node = null;
            }
        }
//        Case 2 - rotation is required:
        int balanceFactor = getBalanceFactor(node);

        if(balanceFactor > 1 && getBalanceFactor(node.leftChild)>= 0){
            return rotateRight(node);
        }
        if(balanceFactor > 1 && getBalanceFactor(node.leftChild) < 0){
            node.leftChild = rotateLeft(node.leftChild);
            return rotateRight(node);
        }
        if(balanceFactor < -1 && getBalanceFactor(node.rightChild) <= 0){
            return rotateLeft(node);
        }
        if(balanceFactor < -1 && getBalanceFactor(node.rightChild) > 0){
            node.rightChild = rotateRight(node.rightChild);
            return rotateLeft(node);
        }
        return node;
    }
    public void deleteNodeavl(int value){
        root = deleteNode(root, value);
    }

//    delete entire avl tree
    public void deleteAVL() {
        root = null;
        System.out.println("AVL tree has been deleted successfully!");
    }
}