import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.lang.Integer;
import java.util.Arrays;

// minNum, maxNum 을 이용하지 않고 Arrays.sort() 메서드를 이용하면 한 번에 최소값, 최대값을 정리할 수 있다.
public class Main{
    public static void main(String []args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] numbers = new int[Integer.parseInt(br.readLine())];
        String[] sNumbers = br.readLine().split(" ");

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(sNumbers[i]);
        }
        Arrays.sort(numbers);

        System.out.println(
                numbers[0] + " " + numbers[numbers.length - 1]
        );
    }
}