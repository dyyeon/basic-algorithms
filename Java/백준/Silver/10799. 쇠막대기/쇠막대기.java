import java.io.BufferedReader;
import java.io.CharArrayReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Stack;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String info = br.readLine();
    int cnt = 0;
    Stack<Character> stack = new Stack<>();

    for (int i = 0; i < info.length(); i++) {
      char ch = info.charAt(i);

      if (ch == '(') {
        stack.push(ch);
      } else {
        stack.pop();
        if (info.charAt(i - 1) == '(') {
          cnt += stack.size();
        } else {
          cnt += 1;
        }
      }
    }
    System.out.println(cnt);
    
  }
}