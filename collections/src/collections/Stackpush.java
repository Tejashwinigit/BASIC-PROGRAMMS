package collections;


import java.util.*;

public class Stackpush{
    public static void main(String args[])
    {
        // Creating an empty Stack
        Stack<String> STACK = new Stack<String>();
  
        // Use push() to add elements into the Stack
        STACK.push("Welcome");
        STACK.push("To");
        STACK.push("Geeks");
        STACK.push("For");
        STACK.push("Geeks");
  
        // Displaying the Stack
        System.out.println("Initial Stack: " + STACK);
  
        // Pushing elements into the stack
        STACK.push("Hello");
        STACK.push("World");
  
        // Displaying the final Stack
        System.out.println("Final Stack: " + STACK);
    }
}