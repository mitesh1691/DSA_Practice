package _6_Stack_and_Queue_Interview_questions;

public class ThreeInOne {
    private int numberOfStacks = 3;
    private int stackCapacity;
    private int[] sizes;
    private int[] values;

    public ThreeInOne(int stackSize){
        stackCapacity = stackSize;
        sizes = new int[numberOfStacks];
        values = new int[stackSize * numberOfStacks];
    }

    public boolean isFull(int stackNum){
        if(sizes[stackNum] == stackCapacity){
            return true;
        }
        else {
            return false;
        }
    }

    public boolean isEmpty(int stackNum){
        if(sizes[stackNum] == 0){
            return true;
        }
        else {
            return false;
        }
    }


//    returns index of the top element in the specified stack ( will return index of array like 5,6,7)
//    do this on paper for better understanding
    public int indexOfTop(int stackNum){
        int size = sizes[stackNum];
        int offset = stackNum * stackCapacity;
        return offset + size -1;
    }

    public void push(int stackNum, int value){
        if((isFull(stackNum))){
            System.out.println("stack is full");
        }
        else {
            sizes[stackNum]++;
            values[indexOfTop(stackNum)] = value;
        }
    }

    public int pop(int stackNum){
        if((isEmpty(stackNum))){
            System.out.println("the stack is empty");
            return -1;
        }
        else {
            int topIndex = indexOfTop(stackNum);
            int value = values[topIndex];
            values[topIndex] = 0;
            sizes[stackNum]--;
            return value;
        }
    }

    public int peek(int stackNum){
        if((isEmpty(stackNum))){
            System.out.println("stack is empty");
            return -1;
        }
        return values[indexOfTop(stackNum)];
    }

    public static void main(String[] args) {
        ThreeInOne newStacks = new ThreeInOne(3);
        newStacks.push(0, 11);
        newStacks.push(1, 21);
        newStacks.push(1, 22);
        newStacks.push(2, 31);
        newStacks.push(2, 32);
        newStacks.push(2, 33);

        boolean isfull = newStacks.isFull(0);
        boolean isfull1 = newStacks.isFull(1);
        boolean isfull2 = newStacks.isFull(2);
        System.out.println(isfull);
        System.out.println(isfull1);
        System.out.println(isfull2);

        boolean isempty = newStacks.isEmpty(0);
        boolean isempty1 = newStacks.isEmpty(1);
        boolean isempty2 = newStacks.isEmpty(2);
        System.out.println(isempty);
        System.out.println(isempty1);
        System.out.println(isempty2);

        int a = newStacks.peek(0);
        System.out.println(a);
        int b = newStacks.peek(1);
        System.out.println(b);
        int c = newStacks.peek(2);
        System.out.println(c);

        int pop = newStacks.pop(0);
        System.out.println(pop);
        int pop1 = newStacks.pop(1);
        System.out.println(pop1);
        int pop2 = newStacks.pop(2);
        System.out.println(pop2);

        int d = newStacks.peek(0);
        System.out.println(d);
        int e = newStacks.peek(1);
        System.out.println(e);
        int f = newStacks.peek(2);
        System.out.println(f);

        boolean isfull3 = newStacks.isFull(0);
        boolean isfull4 = newStacks.isFull(1);
        boolean isfull5 = newStacks.isFull(2);
        System.out.println(isfull3);
        System.out.println(isfull4);
        System.out.println(isfull5);

        boolean isempty3 = newStacks.isEmpty(0);
        boolean isempty4 = newStacks.isEmpty(1);
        boolean isempty5 = newStacks.isEmpty(2);
        System.out.println(isempty3);
        System.out.println(isempty4);
        System.out.println(isempty5);

        int top = newStacks.indexOfTop(0);
        int top1= newStacks.indexOfTop(1);
        int top2 = newStacks.indexOfTop(2);
        System.out.println(top);
        System.out.println(top1);
        System.out.println(top2);
    }

}
