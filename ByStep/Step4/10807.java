import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Main{
    public static void main(String []args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int count = 0;
        br.readLine();   // 첫 행 생략
        String[] numbers = br.readLine().split(" ");
        String targetNum = br.readLine();

        for (String number : numbers) {
            if (number.equals(targetNum)) count++;
        }

        bw.write(String.valueOf(count));
        bw.close();
    }
}