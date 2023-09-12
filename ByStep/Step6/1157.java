import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] word = br.readLine().toLowerCase().toCharArray();
        int[] count = new int[26];
        char max = 0;
        int maxNum = 0;

        for (char c = 'a'; c <= 'z'; c++) {
            for (char alphabet : word) {
                if (c == alphabet) count[c - 'a'] += 1;
            }
            if (count[c - 'a'] > maxNum) {
                maxNum = count[c - 'a'];
                max = c;
            }
            else if (count[c - 'a'] == maxNum) max = '?';
        }

        System.out.println(String.valueOf(max).toUpperCase());
    }
}