import java.util.Scanner;
import java.util.Stack;

public class Main {

  public static String sortSequenceUseFourStack(int n, int[] sequence) {
    Stack<Integer> stack1 = new Stack<>();
    Stack<Integer> stack2 = new Stack<>();
    Stack<Integer> stack3 = new Stack<>();
    Stack<Integer> stack4 = new Stack<>();

    for (int i = 0; i < sequence.length; i++) {
      if (stack1.isEmpty() || stack1.peek() < sequence[i]) {
        stack1.push(sequence[i]);
      } else if (stack2.isEmpty() || stack2.peek() < sequence[i]) {
        stack2.push(sequence[i]);
      } else if (stack3.isEmpty() || stack3.peek() < sequence[i]) {
        stack3.push(sequence[i]);
      } else if (stack4.isEmpty() || stack4.peek() < sequence[i]) {
        stack4.push(sequence[i]);
      } else {
        return "NO";
      }

    }
    
    return "YES";
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int[] sequence = new int[n];
    for (int i = 0; i < n; i++) {
      sequence[i] = scanner.nextInt();
    }

    String result = sortSequenceUseFourStack(n, sequence);
    System.out.println(result);
  }
}