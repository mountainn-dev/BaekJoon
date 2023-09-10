import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double max = 0;
        double sum = 0;

        br.readLine();
        String[] data = br.readLine().split(" ");
        for (int i = 0; i < data.length; i++) {
            double num = Integer.parseInt(data[i]);
            if (num > max) max = num;
            sum += num;
        }

        System.out.printf("%3.5f", sum/max*100/data.length);
    }
}