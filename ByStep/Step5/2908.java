import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] data = br.readLine().split(" ");
        int num1 = Integer.parseInt(changeNumOrder(data[0]));
        int num2 = Integer.parseInt(changeNumOrder(data[1]));

        System.out.println(Math.max(num1, num2));
    }

    static String changeNumOrder(String num) {
        String result = "";

        for (int i = num.length(); i > 0; i--) {
            result += num.charAt(i-1);
        }
        return result;
    }
}