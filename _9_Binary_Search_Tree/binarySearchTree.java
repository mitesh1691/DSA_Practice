package _9_Binary_Search_Tree;

import java.util.LinkedList;
import java.util.Queue;

public class binarySearchTree {
    binaryNode root;

    public binarySearchTree(){
        root = null;
    }

//    Insertion
    public binaryNode insert(binaryNode currentNode, int value){
        if(currentNode == null){
            binaryNode newNode = new binaryNode();
            newNode.value = value;
            System.out.println("The value is successfully inserted");
            return newNode;
        } else if (value <= currentNode.value) {
            currentNode.leftChild = insert(currentNode.leftChild, value);
            return currentNode;
        }
        else {
            currentNode.rightChild = insert(currentNode.rightChild, value);
            return currentNode;
        }
    }
    void insert(int value){
        root  = insert(root, value);
    }

//    Traversal
    public void preOrder(binaryNode node){
        if(node == null){
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
        if (node == null){
            return;
        }
        postOrder(node.leftChild);
        postOrder(node.rightChild);
        System.out.print(node.value + " ");
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

//    Search for a value
    public binaryNode searchNode(binaryNode root, int value){
        if(root == null){
            System.out.println("the value " + value + " not found in the BST");
            return null;
        } else if (root.value == value) {
            System.out.println("the value " + value + " found in the BST");
            return root;
        } else if (value < root.value) {
            return searchNode(root.leftChild, value);
        }
        else {
            return searchNode(root.rightChild, value);
        }
    }


//    Deletion of a node

//    minimum node - smallest node in the tree
    public static binaryNode minimumNode(binaryNode root){
        if(root.leftChild == null){
            return root;
        }
        else {
            return minimumNode(root.leftChild);
        }
    }

//    Delete node
    public binaryNode deleteNode(binaryNode root , int value){
        if(root == null){
            System.out.println("value not found in the BST");
            return null;
        }
        if(value < root.value){
            root.leftChild = deleteNode(root.leftChild, value);
        } else if (value > root.value) {
            root.rightChild = deleteNode(root.rightChild, value);
        }
        else {
            if(root.leftChild != null && root.rightChild != null){
                binaryNode temp = root;
                binaryNode minNodeForRight = minimumNode(temp.rightChild);
                root.value = minNodeForRight.value;
                root.rightChild = deleteNode( root.rightChild ,minNodeForRight.value);
            } else if (root.leftChild != null) {
                root = root.leftChild;
            }
            else if (root.rightChild != null){
                root = root.rightChild;
            }
            else {
                root = null;
            }
        }
        return root;
    }

//    deleting entire tree
    public void deleteBST(){
        root = null;
        System.out.println("BST has been deleted successfully");
    }

}
