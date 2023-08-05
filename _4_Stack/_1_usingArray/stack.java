package _4_Stack._1_usingArray;

public class stack {
    int[] arr;
    int topOfStack;
    public stack(int size){
        this.arr = new int[size];
        this.topOfStack = -1;
        System.out.println("The stack is created with the size of: " + size);
    }

    public boolean isEmpty(){
        if(topOfStack == -1){
            return true;
        }
        else {
            return false;
        }
    }

    public boolean isFull(){
        if(topOfStack == arr.length - 1){
            return true;
        }
        else {
            return false;
        }
    }

    public void push(int value){
        if(isFull()){
            System.out.println("The stack is full");
        }
        else {
            arr[topOfStack + 1] = value;
            topOfStack ++;
            System.out.println("the value is successfully inserted");
        }
    }

    public int pop(){
        if(isEmpty()){
            System.out.println("the stack is empty");
            return -1;
        }
        else {
            int topStack = arr[topOfStack];
            topOfStack--;
            return topStack;
        }
    }

    public int peek(){
        if (isEmpty()) {
            System.out.println("stack is empty");
            return -1;
        }
        else {
            return arr[topOfStack];
        }
    }

    public void delete(){
        arr = null;
        System.out.println("the stack is successfully deleted");
    }

}
