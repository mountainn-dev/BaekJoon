import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());

        for (int i = 0; i < count; i++) {
            String[] data = br.readLine().split(" ");
            StringBuilder sb = new StringBuilder();
            String word = data[1];
            int rep = Integer.parseInt(data[0]);

            for (int j = 0; j < word.length(); j++) {
                for (int k = 0; k < rep; k++) {
                    sb.append(word.charAt(j));
                }
            }
            System.out.println(sb);
        }
    }
}