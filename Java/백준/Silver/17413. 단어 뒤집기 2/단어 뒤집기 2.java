import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Stack;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String S = br.readLine();
    Stack<Character> stack = new Stack<>();
    boolean check = false;

    for (int i = 0; i < S.length(); i++) {
      if (S.charAt(i) == '<') {
        print(stack);
        check = true;
        System.out.print(S.charAt(i));
      } else if (S.charAt(i) == '>') {
        check = false;
        System.out.print(S.charAt(i));
      } else if (check) {
        System.out.print(S.charAt(i));
      } else {
        if (S.charAt(i) == ' ') {
          print(stack);
          System.out.print(S.charAt(i));
        } else {
          stack.push(S.charAt(i));
        }
      }
    }
    print(stack);
  }

  public static void print(Stack stack) {
    while (!stack.isEmpty()) {
      System.out.print(stack.peek());
      stack.pop();
    }
  }
}