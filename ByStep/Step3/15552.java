import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.lang.Integer;

public class Main{
    public static void main(String []args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int totalCount = Integer.parseInt(br.readLine());
        int sum = 0;

        for (int i = 0; i < totalCount; i++) {
            String line = br.readLine();
            String[] numbers = line.split(" ");   // String 토큰 생성
            for (int j = 0; j < numbers.length; j++) {
                int number = Integer.parseInt(numbers[j]);
                sum += number;
            }
            bw.write(sum + "\n");
            sum = 0;   // 출력 후 sum 변수 초기화
        }
        bw.close();
    }
}