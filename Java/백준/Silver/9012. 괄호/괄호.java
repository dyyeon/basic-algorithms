import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());

    for (int i = 0; i < n; i++) {
      Stack<Character> stack = new Stack<>();
      String s = br.readLine();

      boolean isValid = true;

      for (int j = 0; j < s.length(); j++) {
        if (s.charAt(j) == '(') {
          stack.push('(');
        } else if (s.charAt(j) == ')') {
          if (stack.isEmpty()) {
            isValid = false;
            break;
          } else {
            stack.pop();
          }
        }
      }

      if (isValid && stack.isEmpty()) {
        System.out.println("YES");
      } else {
        System.out.println("NO");
      }
    }
  }
}
