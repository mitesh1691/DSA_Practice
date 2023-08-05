package _4_Stack._1_usingArray;

class Main {
     public static void main(String[] args) {
         stack newStack = new stack(4);

         boolean result = newStack.isEmpty();
         System.out.println(result);

         boolean result1 = newStack.isFull();
         System.out.println(result1);

         newStack.push(3);
         newStack.push(4);
         newStack.push(5);
         newStack.push(6);
//         newStack.push(7); // error, stack is full, as the stack exceeds length of the array

         int result2  = newStack.pop();
         System.out.println(result2); // output 6
         int result3  = newStack.pop();
         System.out.println(result3); // output 5

         int result4 = newStack.peek();
         System.out.println(result4); // output 4
         int result5 = newStack.peek();
         System.out.println(result5); // output 4

         newStack.delete();

     }
}
