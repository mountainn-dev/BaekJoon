import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String word = br.readLine();
        int[] charCount = new int[26];

        for (int i = 0; i < charCount.length; i++) {
            charCount[i] = -1;
        }

        for (int j = 0; j < word.length(); j++) {
            char c = word.charAt(j);
            if (charCount[c - 'a'] == -1) charCount[c - 'a'] = j;
        }

        for (int k : charCount) {
            System.out.printf("%d ", k);
        }
    }
}