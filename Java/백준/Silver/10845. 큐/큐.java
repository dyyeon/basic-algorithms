import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.Deque;
import java.util.LinkedList;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringTokenizer st;
    int N = Integer.parseInt(br.readLine());
    Deque<Integer> q = new LinkedList<>();
    
    while(N-->0){
      st = new StringTokenizer(br.readLine());
      String message = st.nextToken();
      
      if(message.equals("push")){
        int val = Integer.parseInt(st.nextToken());
        q.add(val);

      } else if (message.equals("pop")){
        if(q.isEmpty()){
          bw.write(-1+"\n");
        } else {
          Integer val = q.poll();
          bw.write(val+"\n");
        }
      
      } else if (message.equals("front")){
        if(q.isEmpty()){
          bw.write(-1+"\n");
        } else {
          bw.write(q.peekFirst() + "\n");
        }

      } else if (message.equals("back")){
        if(q.isEmpty()){
          bw.write(-1+"\n");
        } else {
          bw.write(q.peekLast() + "\n");
        }

      } else if (message.equals("empty")){
        if(q.isEmpty()){
          bw.write(1+"\n");
        } else {
          bw.write(0+"\n");
        }

      } else if (message.equals("size")){
        bw.write(q.size()+"\n");
      }
      
    }

    bw.flush();
    bw.close();
  }
}