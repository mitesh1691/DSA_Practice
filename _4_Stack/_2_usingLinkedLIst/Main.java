package _4_Stack._2_usingLinkedLIst;

public class Main {
    public static void main(String[] args) {
        stack newStack = new stack(); // creating instance of stack class
        boolean result = newStack.isEmpty();
        System.out.println(result); // true

        newStack.push(1); // inserted in stack
        newStack.push(2);
        newStack.push(3);

        boolean result1 = newStack.isEmpty();
        System.out.println(result1); // false

        int result2 = newStack.pop();
        System.out.println(result2); // 3
        int result3 = newStack.pop();
        System.out.println(result3); // 2

//        method call:
        int result4 = newStack.peek();
        System.out.println(result4); // 1
        int result5 = newStack.peek();
        System.out.println(result5); // 1

        newStack.deleteStack();
    }
}
