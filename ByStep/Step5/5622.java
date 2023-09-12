import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

// Solution : time = 알파벳 인덱스/3 + 3 (특정 알파벳 제외)
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String data = br.readLine();
        StringBuilder sb = new StringBuilder();
        int total = 0;

        // A ~ Z
        for (char c = 'A'; c <= 'Z'; c++) {
            sb.append(c);
        }

        for (int i = 0; i < data.length(); i++) {
            String alphabet = data.substring(i, i+1);
            int index = sb.indexOf(alphabet);
            if (alphabet.equals("S") || alphabet.equals("V") || alphabet.equals("Y") || alphabet.equals("Z"))
                total += index/3 + 2;
            else total += index/3 + 3;
        }

        System.out.println(total);
    }
}