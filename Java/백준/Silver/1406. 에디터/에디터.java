import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Stack;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String s = br.readLine();
    Stack<Character> Lstack = new Stack<>();
    Stack<Character> Rstack = new Stack<>();
    int N = Integer.parseInt(br.readLine());

    for (int i = 0; i < s.length(); i++) {
      Lstack.push(s.charAt(i));
    }

    for (int i = 0; i < N; i++) {
      String tmp = br.readLine();

      switch (tmp.charAt(0)) {
        case 'L':
          if (!Lstack.isEmpty()) {
            Rstack.push(Lstack.pop());
          }
          break;
        case 'D':
          if (!Rstack.isEmpty()) {
            Lstack.push(Rstack.pop());
          }
          break;
        case 'B':
          if (!Lstack.isEmpty()) {
            Lstack.pop();
          }
          break;
        case 'P':
          Lstack.push(tmp.charAt(2));
          break;
      }
    }

    StringBuilder sb = new StringBuilder();

    while (!Lstack.isEmpty()) {
      Rstack.push(Lstack.pop());
    }

    while (!Rstack.isEmpty()) {
      sb.append(Rstack.pop());
    }

    System.out.println(sb);
  }
}
