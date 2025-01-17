import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Stack;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());
    StringTokenizer st = new StringTokenizer(br.readLine().trim());
    int[] arr = new int[N];
    HashMap<Integer, Integer> freqMap = new HashMap<>();

    for (int i = 0; i < N; i++) {
      arr[i] = Integer.parseInt(st.nextToken());
      freqMap.put(arr[i], freqMap.getOrDefault(arr[i], 0) + 1);
    }

    int[] res = new int[N];
    for (int i = 0; i < N; i++) {
      res[i] = -1;
    }

    Stack<int[]> stack = new Stack<>();

    for (int i = 0; i < N; i++) {
      while (!stack.isEmpty() && stack.peek()[1] < freqMap.get(arr[i])) {
        int[] top = stack.pop();
        res[top[0]] = arr[i];
      }
      stack.push(new int[] { i, freqMap.get(arr[i]) });
    }

    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < N; i++) {
      sb.append(res[i]).append(" ");
    }
    System.out.println(sb.toString().trim());
  }
}