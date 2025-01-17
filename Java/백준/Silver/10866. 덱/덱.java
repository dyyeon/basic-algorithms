import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;
import java.io.IOException;

public class Main {
  static LinkedList<Integer> queue = new LinkedList<>();
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();

    int N = Integer.parseInt(br.readLine());

    while(N-->0){
      String str = br.readLine();

      if(str.contains("push")){
        StringTokenizer st = new StringTokenizer(str);

        if(st.nextToken().contains("front")){
          push_front(Integer.parseInt(st.nextToken()));
        } else if(str.contains("back")){
          push_back(Integer.parseInt(st.nextToken()));
        }
      } else if(str.contains("pop")){
        if(str.contains("front")){
          sb.append(pop_front()).append("\n");
        } else if(str.contains("back")){
          sb.append(pop_back()).append("\n");
        }
      } else if(str.contains("size")){
        sb.append(size()).append("\n");
      } else if(str.contains("empty")){
        sb.append(empty()).append("\n");
      } else if(str.contains("front")){
        sb.append(front()).append("\n");
      } else if(str.contains("back")){
        sb.append(back()).append("\n");
      }
    }
    br.close();
    System.out.println(sb);
  }


  static void push_front(int X){
    queue.addFirst(X);
  }

  static void push_back(int X){
    queue.addLast(X);
  }

  static int pop_front(){
    if(empty() == 1){
      return -1;
    }
    return queue.removeFirst();
  }

  static int pop_back(){
    if(empty() == 1){
      return -1;
    }
    return queue.removeLast();
  }

  static int size(){
    return queue.size();
  }

  static int empty(){
    return (queue.size() <= 0) ? 1 : 0;
  }

  static int front(){
    if(empty() == 1){
      return -1;
    }
    return queue.peekFirst();
  }

  static int back(){
    if(empty() == 1){
      return -1;
    }
    return queue.peekLast();
  }
}