import java.util.Stack;

public class _stack {
    public static void main(String[] args) {
      Stack<String> stack = new Stack<>();

      System.out.println(stack.isEmpty());

      stack.push("Sakna");
      stack.push("Sakitha");
      stack.push("Chathuni");
      stack.push("Theekshana");
      System.out.println(stack.isEmpty());

      //stack.pop();
      System.out.println(stack);
        System.out.println(stack.peek()); // Chathuni
        System.out.println(stack.search("Sakitha")); // 3
        stack.pop(); // remove the top element (Chathuni)

        stack.push("Puppy");
        stack.push("Kitty");
        stack.push("Bunny");

        System.out.println(stack);
    }
}
