import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    boolean[] sosu = new boolean[1000001];
    sosu[0] = sosu[1] = true;
    for (int i = 2; i <= Math.sqrt(1000000); i++) {
      if (sosu[i])
        continue;
      for (int j = i * i; j <= 1000000; j += i) {
        sosu[j] = true;
      }
    }

    int n = Integer.parseInt(br.readLine());
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < n; i++) {
      int count = 0;
      int tmp = Integer.parseInt(br.readLine());
      for (int j = 2; j <= tmp / 2; j++) {
        if (!sosu[j] && !sosu[tmp - j]) {
          count++;
        }
      }
      sb.append(count).append("\n");
    }
    System.out.print(sb.toString());
  }
}
