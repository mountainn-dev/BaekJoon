import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

// Solution : left(0) == right(0), left(1) == right(1) ...
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String word = br.readLine();
        int result = 1;

        for (int i = 0; i < word.length()/2; i++) {
            if (word.charAt(i) != word.charAt((word.length()-1)-i)) {
                result = 0;
                break;
            }
        }

        System.out.printf("%d", result);
    }
}