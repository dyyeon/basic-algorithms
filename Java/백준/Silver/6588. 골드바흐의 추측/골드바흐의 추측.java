import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Main {
  final static int MAX = 1000000;
  static boolean[] primeNum = new boolean[MAX + 1];

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    int num = Integer.parseInt(br.readLine());
    int[] result;

    findPrimeNum(primeNum);
    while (num != 0) {
      result = new int[2];
      for (int i = num; i >= 0; i--) {
        if (primeNum[i] && primeNum[num - i]) {
          result[0] = num - i;
          result[1] = i;
          bw.write(num + " = " + result[0] + " + " + result[1] + "\n");
          break;
        }
      }
      if (result[0] == 0) {
        bw.write("Goldbach's conjecture is wrong.\n");
      }
      num = Integer.parseInt(br.readLine());
    }
    bw.close();
  }

  static boolean[] findPrimeNum(boolean[] arr) {
    int count;
    for (int i = 2; i < arr.length; i++) {
      count = 0;
      for (int j = 2; j * j <= i; j++) {
        if (i % j == 0) {
          count++;
          break;
        }
      }
      if (count == 0) {
        arr[i] = true;
      }
    }
    return arr;
  }
}