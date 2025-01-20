import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.file.StandardOpenOption;
import java.io.IOException;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    String[] arr = br.readLine().split(" ");
    String str1 = arr[0] + arr[1];
    String str2 = arr[2] + arr[3];

    System.out.println(Long.parseLong(str1) + Long.parseLong(str2));
  }
}